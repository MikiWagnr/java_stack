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
    <title>Save Travels</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<h1>Save Travels</h1>
<a class="btn btn-warning" href="/">Home</a>
<a class="btn btn-primary" href="/expenses/edit/${expense.id}">Edit</a>
<form id="delete-form-${expense.id}" action="/expenses/delete/${expense.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <button type="button" class="btn btn-danger delete-button" onclick="deleteConfirmation('${expense.id}')">DELETE</button>
</form>   
<h2>${expense.name}</h2>
<h4>${expense.vendor}</h4>
<p>${expense.description}</p>
<h2>${expense.amount}</h2>
</body>
</html>