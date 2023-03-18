<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dojos and Ninjas</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<h1>Dojos and Ninjas</h1>
<a href="/dojos/new">Add a dojo!</a>
<a href="/ninjas/new">Add a ninja!</a>

<h2>Choose a dojo and see the ninjas!</h2>
    <!-- <for:each var="dojo" items="${dojos}"> -->
        <!-- <a href="/dojos/${dojo.id}">${dojo.name}</a> -->
    <!-- </for:each> -->
    <c:forEach var="dojo" items="${dojos}">
    <a href="/dojos/${dojo.id}">${dojo.name}</a>
    </c:forEach>

</body>
</html>