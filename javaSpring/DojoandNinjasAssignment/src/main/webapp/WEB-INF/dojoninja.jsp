<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Ninja</title>
</head>
<body>
	<table>
		<tr>
			<th>Burger Name</th>
			<th>Restaurant Name</th>
			<th>Rating(out of 5)</th>
			<th>Action</th>
		</tr>
		 <c:forEach var="burger" items="${burgers}">
		<tr>
			<td>${ninja.getBurgerName()}</td>
			<td>${ninja.getRestaurantname()}</td>
			<td>${ninja.getRating()}</td>
			<td><a href="/burger/{id}">edit</a></td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>