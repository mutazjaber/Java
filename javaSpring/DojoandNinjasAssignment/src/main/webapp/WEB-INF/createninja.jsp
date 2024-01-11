<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja</title>
</head>
<body>
New Ninja
<form:form action="/ninja" method="post" modelAttribute="ninja">
    <form:select path="dojo">
        <c:forEach var="onedojo" items="${dojos}">
            <!--- Each option VALUE is the id of the person --->
            <form:option value="${onedojo.id}" path="onedojo">
            <!--- This is what shows to the user as the option --->
                <c:out value="${onedojo.name}"/>
            </form:option>
        </c:forEach>
    </form:select>
    <p>
        <form:label path="firstName"> firstName </form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
        <p>
        <form:label path="lastName"> lastName </form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
     <p>
         <form:label path="age"> age</form:label>
        <form:errors path="age"/>     
        <form:input type="number" path="age"/>
    </p>    
   

     <input type="submit" value="Submit" />
    
</form:form>    
	
</body>
</html>