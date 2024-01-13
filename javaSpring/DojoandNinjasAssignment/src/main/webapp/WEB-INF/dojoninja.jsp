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
<h1>Burbank Location Ninjas</h1>
<h2 style="text-align: center;" > <c:out value="${dojo.name}"/> </h2>
    <table class="table table-hover">
    <thead>
        <tr>
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
            <th scope="col">Age</th>
        </tr>
        </thead>
        <c:forEach items="${dojo.ninjas}" var="dojo" >
            <tr>
                <td ><c:out value="${dojo.getFirstName()}" /></td>
                <td><c:out value="${dojo.getLastName()}" /></td>
                <td><c:out value="${dojo.getAge()}" /></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>