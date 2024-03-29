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
    <title>Books</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/src/main/resources/static/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->

</head>
<body>
    <a class="btn btn-outline-dark" href="/books">home</a>
<h1>${book.title}</h1>
<h2>${book.author}</h2>
<p>${book.thoughts}</p> 
<c:if test="${book.user.id == userId}">
        <a href="/books/edit/${book.id}">edit</a>
        <form action="/books/delete/${book.id}" method="post">
            <input type="hidden" name="_method" value="delete">
            <input type="submit" value="Delete">
        </form>
    </c:if>  


</body>
</html>