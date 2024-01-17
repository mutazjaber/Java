package com.mutaz.bookclub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mutaz.bookclub.models.Book;
import com.mutaz.bookclub.models.LoginUser;
import com.mutaz.bookclub.models.User;
import com.mutaz.bookclub.services.BookService;
import com.mutaz.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	@Autowired
	private BookService bookService;

	@GetMapping("/")
	public String index(Model model) {

		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("newUser", new User());
		model.addAttribute("user", new LoginUser());

		return "login.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		// TO-DO Later -- call a register method in the service
		// to do some extra validations and create a new user!
		userService.register(newUser, result);
		if (result.hasErrors()) {
			// Be sure to send in the empty LoginUser before
			// re-rendering the page.

			model.addAttribute("user", new LoginUser());
			return "login.jsp";
		} else {
			session.setAttribute("loginId", newUser.getId());
			// No errors!
			// TO-DO Later: Store their ID from the DB in session,
			// in other words, log them in.
			return "redirect:/dashboard";
		}
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("user") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {

		// Add once service is implemented:
		User user = userService.login(newLogin, result);
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "login.jsp";
		} else {
			session.setAttribute("loginId", user.getId());
			return "redirect:/dashboard";
		}
	}

	///////////////////////////////

	@GetMapping("/dashboard")

	public String dashboard(HttpSession session, Model model) {

		if (session.getAttribute("loginId") == null) {
			return "redirect:/";
		}
		Long id = (Long) session.getAttribute("loginId");
		User user = userService.find_User(id);
		model.addAttribute("email", user.getEmail());
		model.addAttribute("userName", user.getUserName());

		List<Book> books = bookService.ListBooks();
		for (Book book : books) {
			System.out.println(book.getId());
		}

		model.addAttribute("books", books);

		System.out.println(books.isEmpty());
		System.out.println(user.getEmail());
		return "dashboard.jsp";
	}

	@GetMapping("/logout")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	@GetMapping("/books/create")
	public String createBookForm(Model model, @ModelAttribute("book") Book book, HttpSession session) {
		Long id = (Long) session.getAttribute("loginId");
		User user = userService.find_User(id);
		model.addAttribute(user);
		return "newBook.jsp";
	}

	// /////// process new book for user and return to home page to display all
	// books
	@PostMapping("/books/createBook")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "newBook.jsp";
		}
		Long id = (Long) session.getAttribute("loginId");
		System.out.println(id);
		User user = userService.find_User(id);
		System.out.println(user.getEmail());
		bookService.create(book, user);
		return "redirect:/dashboard";
	}

	// display book details
	@GetMapping("/books/{bookId}")
	public String bookDetails(@PathVariable("bookId") Long bookId, HttpSession session, Model model) {
		Long id = (Long) session.getAttribute("loginId");
		User user = userService.find_User(id);
		Book book = bookService.findBook(bookId);
		model.addAttribute("book", book);
		model.addAttribute("user", user);
		return "bookDetails.jsp";
	}

	// ///////// Edit book form
	@GetMapping("/books/{id}/edit")
	public String editBook(@PathVariable("id") Long bookId, HttpSession session, Model model) {
		Long id = (Long) session.getAttribute("loginId");
		Book book = bookService.findBook(bookId);
		System.out.println(!book.getUser().getId().equals(id));
		if (!book.getUser().getId().equals(id)) {
			return "bookDetails.jsp";
		}

		model.addAttribute("book", book);

		return "bookEdit.jsp";
	}

	// Edit book processing

	@RequestMapping(value = "/books/{id}", method = RequestMethod.PATCH)
	public String update(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model,
			HttpSession session) {

		Long loginId = (Long) session.getAttribute("loginId");
		User user = userService.find_User(loginId);

		if (result.hasErrors()) {

			model.addAttribute("book", book);
			return "edit.jsp";
		} else {

			bookService.updateBook(book, user);
			System.out.println(book.getUser().getUserName());
			return "redirect:/dashboard";
		}
	}

	@DeleteMapping("/books/{id}/delete")
	public String delete(@PathVariable("id") Long bookId, HttpSession session) {
		Long id = (Long) session.getAttribute("loginId");
		Book book = bookService.findBook(id);
		if (!book.getUser().getId().equals(id)) {
			return "redirect:/dashboard";
		}
		bookService.deleteBook(bookId);
		return "redirect:/dashboard";
	}

}
