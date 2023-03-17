<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!-- c:out ; c:forEach etc. -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!-- Formatting (dates) -->
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
            <!-- form:form -->
            <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
                <!-- for rendering errors on PUT routes -->
                <%@ page isErrorPage="true" %>
                    <!DOCTYPE html>
                    <html>

                    <head>
                        <meta charset="UTF-8">
                        <title>Save Travels</title>
                        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
                        <link rel="stylesheet" href="css/main.css"> <!-- change to match your file/naming structure -->
                        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
                        <script type="text/javascript" src="js/main.js"></script>
                        <!-- change to match your file/naming structure -->
                    </head>

                    <body>
                        <h1>Save Travels</h1>
                        <a class="btn btn-warning" href="/expenses/new">Add new expense</a>
                        <table class="table">
                            <thead>
                                <th>name</th>
                                <th>vendor</th>
                                <th>Amount</th>
                                <th>Actions</th>
                            </thead>
                            <tbody>
                                <c:forEach var="expense" items="${expenses}">
                                    <tr class="clickable-row" data-href="/expense/${expense.id}">
                                        <td>${expense.name}</td>
                                        <td>${expense.vendor}</td>
                                        <td>${expense.amount}</td>
                                        <td>
                                            <a class="btn btn-primary" href="/expenses/edit/${expense.id}">Edit</a>
                                            <form id="delete-form-${expense.id}" action="/expenses/delete/${expense.id}" method="post">
                                                <input type="hidden" name="_method" value="delete">
                                                <button type="button" class="btn btn-danger delete-button" onclick="deleteConfirmation('${expense.id}')">DELETE</button>
                                            </form>                                            
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </body>

                    </html>