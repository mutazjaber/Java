<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>



    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Travel Details</title>


</head>
<body>
<h1>Expense Details</h1>
<p><a href = "/">back</a></p>
<p>Expense Name : ${travel.expense}</p>
<p>Expense Description : ${travel.description}</p>
<p>Vendor : ${travel.vendor}</p>
<p>Amount : $${travel.amount}</p>

</body>
</html>