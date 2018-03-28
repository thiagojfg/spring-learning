<%-- 
    Document   : hello.jsp
    Created on : 27/03/2018, 20:28:04
    Author     : desen03
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <spring:url value="/resources/bootstrap/css/bootstrap.css" var="bootCss"/>
        <spring:url value="/resources/bootstrap/js/bootstrap.css" var="bootJs"/>
        <link href="${bootCss}" rel="stylesheet"/>
    </head>

    <body>

        <h2>Hello World Spring Maven e Boostrap</h2>

        <a class="btn btn-link" href="#">Boostrap 4 Button Link</a>

        <c:if test="${not empty name}">
            <div class="alert alert-info">Hello ${name}</div>
        </c:if>

        <script src="${bootJs}" type="text/javascript"></script>        
    </body>
</html>
