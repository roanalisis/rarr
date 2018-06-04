<%-- 
    Document   : UsuarioError
    Created on : May 29, 2018, 3:28:39 PM
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
        <c:out value="${erR}" />
        <a href="agregarUsuario.htm">atras</a>
    </body>
</html>
