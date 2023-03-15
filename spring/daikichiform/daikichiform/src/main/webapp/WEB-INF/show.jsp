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
    <title>daikichi form</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
        <h1>Here's your Omikuji!</h1>
        
        <p>In <span>${number}</span> years, you will live in <span>${city}</span> with <span>${person}</span> as your roommate, <span>${job}</span> for a living. The next time you see a <span>${livingthing}</span>, you will have good luck. Also, <span>${comment}</span></p>
        <button onclick="location.href='/'" class="btn btn-primary">Home</button>
</body>

</html>
