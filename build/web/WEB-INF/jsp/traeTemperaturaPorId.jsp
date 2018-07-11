<%-- 
    Document   : traTemperaturaPorId
    Created on : Jul 8, 2018, 6:05:47 PM
    Author     : rodrigorr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="traeUltimoRegistro">
            <% response.sendRedirect("traeUltimoRegistro"); %>             
        </form>
    </body>
</html>
