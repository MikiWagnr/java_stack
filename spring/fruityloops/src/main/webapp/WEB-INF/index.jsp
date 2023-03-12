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
                        <title>FRUITY LOOPS</title>
                        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
                        <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
                        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
                        <script type="text/javascript" src="/js/app.js"></script>
                        <!-- change to match your file/naming structure -->
                    </head>

                    <body>
                        <h1 class="text-center">FRUITY LOOPS!</h1>
                        <table class="table-sm table-bordered mx-auto">
                            <thead>
                                <!-- Table head rows will go here -->
                                <tr>
                                    <th>Name</th>
                                    <th>Price</th>
                                </tr>
                            </thead>
                            <tbody>
                                <!-- Table body rows will go here -->
                                <c:forEach var="fruit" items="${fruits}">
                                    
                                        <tr>
                                            <td>${fruit.name}</td>
                                            <td>${fruit.price}</td>
                                        </tr>
                                    
                                </c:forEach>
                            </tbody>
                        </table>


                    </body>

                    </html>