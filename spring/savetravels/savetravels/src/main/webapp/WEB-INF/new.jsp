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
<h2>Add an expense</h2>

<form:form action="/expenses
" method="POST" modelAttribute="expense">
<form:label path="name">Expense name: </form:label>
<from:errors path="name"/>
<form:input path="name"></form:input>

<form:label path="vendor">Vendor: </form:label>
<from:errors path="vendor"/>
<form:input path="vendor"></form:input>

<form:label path="description">Description: </form:label>
<from:errors path="description"/>
<form:input path="description"></form:input>

<form:label path="amount">Amount: </form:label>
<from:errors path="amount"/>
<form:input path="amount"></form:input>

<button type="submit">Submit</button>
</form:form>
</body>
</html>