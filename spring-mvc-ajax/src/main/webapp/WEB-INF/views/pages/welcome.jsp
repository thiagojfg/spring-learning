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


        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <h2>Hello World Spring AJAX</h2>
                </div>
            </div>
            <form id="searchForm">
                <div class="form-group">
                    <div class="col-2">
                        <label>Username</label>
                    </div>
                    <div class="col-10">
                        <input id="username" class="form-control" type="text" name="username"/>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-2">
                        <label>Email</label>
                    </div>
                    <div class="col-10">
                        <input id="email" class="form-control" type="email" name="email"/>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-12">
                        <button type="submit" class="btn btn-info">Pesquisar</button>
                    </div>
                </div>
            </form>
        </div>
        <script src="${bootJs}" type="text/javascript"></script>        
    </body>
</html>
