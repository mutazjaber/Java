<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Burger Tracker</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<style>
        
</style>
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
			<td>${burger.getBurgerName()}</td>
			<td>${burger.getRestaurantName()}</td>
			<td>${burger.getRating()}</td>
			<td><a href="/burger/{id}">edit</a></td>
		</tr>
		</c:forEach>
	</table>
	Burger Tracker
	<form:form action="/bureger/create" method="post" modelAttribute="burger">
    <p>
        <form:label path="burgerName">BurgerName</form:label>
        <form:errors path="burgerName"/>
        <form:input path="burgerName"/>
    </p>
    <p>
        <form:label path="restaurantName">RestaurantName</form:label>
        <form:errors path="restaurantName"/>
        <form:textarea path="restaurantName"/>
    </p>

    <p>
        <form:label path="rating">rating</form:label>
        <form:errors path="rating"/>     
        <form:input type="number" path="rating"/>
    </p>    
        <p>
        <form:label path="notes">notes</form:label>
        <form:errors path="notes"/>
        <form:input path="notes"/>
    </p>
    <input type="submit" value="Submit" />
</form:form>    

</body>
</html>