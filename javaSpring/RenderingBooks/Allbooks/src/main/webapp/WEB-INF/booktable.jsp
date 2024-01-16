<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>


</head>
<body>
<div class="container">
<h1>All Books</h1>

<table class="table">
    <thead>
      <tr>
      <th scope="col">ID</th>
        <th scope="col">Title</th>
        <th scope="col">Description</th>
        <th scope="col">Language</th>
        <th scope="col">Number of pages</th>
  
      </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${books}">
    <tr>
    	  <td>${book.id}</td>
          <td><a href="/book/${book.id}" >${book.title}</a></td>
          
          <td>${book.description}</td>
          <td>${book.language}</td>
          <td>${book.numberOfPages}</td>
          </tr>
      </c:forEach>
  
    </tbody>
  </table>



  </div>
</body>
</html>