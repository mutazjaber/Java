<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>NINJA GOLD</title> 
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">

</head>
<body>
    <div class="container">
        <div class="header">
            <h3>Your Gold: <c:out value="${gold}"></c:out></h3>
            <form action="/reset" method="post">
                <button type="submit" name="reset" class="btn btn-danger">Reset</button>
            </form>
        </div>
        <div class="activity row">
            <form class="quest col-md-3" action="/quest" method="post">
                <h2>Farm</h2>
                <p>Earns (10 - 20) Gold Coins</p>
                <button type="submit" name="farm" class="btn btn-primary">Find Gold</button>
                <input type="hidden" name="Form" value="farm">
            </form>

            <form class="quest col-md-3" action="/quest" method="post">
                <h2>Cave</h2>
                <p>Earns (5 - 10) Gold Coins</p>
                <button type="submit" name="Cave" class="btn btn-primary">Find Gold</button>
                <input type="hidden" name="Form" value="cave">
            </form>

            <form class="quest col-md-3" action="/quest" method="post">
                <h2>House</h2>
                <p>Earns (2 - 5) Gold Coins</p>
                <button type="submit" name="House" class="btn btn-primary">Find Gold</button>
                <input type="hidden" name="Form" value="house">
            </form>

            <form class="quest col-md-3" action="/quest" method="post">
                <h2>Quest</h2>
                <p>Earns/Takes (0 - 50) Gold Coins</p>
                <button type="submit" name="Quest" class="btn btn-primary">Find Gold</button>
                <input type="hidden" name="Form" value="quest">
            </form>
        </div>
        <div class="log">
            <h2>Activities:</h2>
            <div>
                <c:forEach var="message" items="${log}">
                    <p class="alert alert-info"><c:out value="${message}"></c:out></p>
                </c:forEach>
            </div>
        </div>
    </div>

</body>
</html>
