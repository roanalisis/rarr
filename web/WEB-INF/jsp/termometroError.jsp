<%-- 
    Document   : registroError
    Created on : May 27, 2018, 6:10:05 PM
    Author     : rodrigorr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Registro</title>
    </head>
    <body>
        <!--   <h1>Usuario ya existe!</h1>    -->
        <c:out value="${erR}" />
        <a href="agregarTermometro.htm">atras</a>
    </body>
</html>
