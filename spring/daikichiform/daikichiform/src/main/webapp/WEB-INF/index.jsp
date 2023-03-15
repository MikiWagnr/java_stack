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
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
    <title>daikichi form</title>
</head>
<body>
        <h1>Send an Omikuji!</h1>
        
        <form action="handleform" method="POST">
            <div class="mb-3">
                <label for="number">Pick a number from 5 to 25:</label>
                <input type="number" name="number">
            </div>
            <div class="mb-3">
                <label for="city">Enter the name of any city:</label>
                <input type="text" name="city">
            </div>
            <div class="mb-3">
                <label for="person">Enter the name of any real person:</label>
                <input type="text" name="person">
            </div>
            <div class="mb-3">
                <label for="job">Enter professional endeavor or hobby:</label>
                <input type="text" name="job">
            </div>
            <div class="mb-3">
                <label for="livingthing">Enter anytype of living thing:</label>
                <input type="text" name="livingthing">
            </div>
            <div class="mb-3">
                <label for="comment">Say something nice to someone:</label>
                <textarea name="comment" rows="5" cols="40"></textarea>
            </div>
            <h5>Send and show a friend!</h5>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>

</body>
</html>
