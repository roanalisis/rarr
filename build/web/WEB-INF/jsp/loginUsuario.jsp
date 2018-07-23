<%-- 
    Document   : login
    Created on : May 28, 2018, 12:11:31 PM
    Author     : rodrigorr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type"; charset=UTF-8">
        <title>JSP Page</title>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>A.T.A. | Login</title>

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        
        
    </head>
    
    
    
    <body class="gray-bg">
        
        <div style="float:right"> <p class="font-bold" style="color:#338EFF";> <a href="loginConfigurador.htm">Configuración </a> &nbsp;</p></div>
        
        
        <div class="loginColumns animated fadeInDown">
        <div class="row">

            <div class="col-md-6">
                <h2 class="font-bold">Bienvenido a A.T.A.</h2>

                <p>
                    Proyecto A.T.A. es un administrador de dispositivos ADVANTECH ADAM especializado en el registro y analisis automatizado de datos.
                </p>


            </div>
            <div class="col-md-6">
                <div class="ibox-content">
<!--                    <form class="m-t" role="form" action="index.html">
                        <div class="form-group">
                            <input type="email" class="form-control" placeholder="Usuario" required="">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Contraseña" required="">
                        </div>
                        <button type="submit" value="enviar" onclick = "location='index.htm'" class="btn btn-primary block full-width m-b">Login</button>

                        <a href="#">
                            <small>¿Olvido su contraseña?</small>
                        </a>

                        <p class="text-muted text-center">
                            <small>¿No tiene una cuenta?</small>
                        </p>
                        <a class="btn btn-sm btn-white btn-block" href="register.html">Crear una cuenta</a>
                    </form>-->
                    
                    
                    <form:form modelAttribute="usuario" method="post" class="m-t" role="form">
                        <div class="form-group">
                            <form:input path="nombreusuario" type="nombreusuario" placeholder="Nombre usuario" class="form-control" required="" />
                            <form:errors path="nombreusuario" /><br />                    
                        </div>
                        <div class="form-group">
                            <form:input path="mail" type="email" placeholder="Email" class="form-control" required="" />
                            <form:errors path="mail" /><br />
                        </div>
                        <div class="form-group">
                            <form:input path="passwordU" type="password" placeholder="Password" class="form-control" required="" />
                            <form:errors path="passwordU" /><br />                      
                        </div>                    

                        <button input type="submit" class="btn btn-primary block full-width m-b">Login</button>
                        
                        <c:if test="${mensaje=='noencuentra'}">                                 
                            <% response.sendRedirect("agregarUsuario.htm"); %> 
                        </c:if>

                        <c:if test="${mensaje=='Usuario o Password incorrectos.'}"> 
                        <a href="#">
                                <small>Usuario o Password incorrectos.</small>
                        </a>
                        </c:if>

                        <p class="text-muted text-center">
                            <small>¿No tiene una cuenta?</small>
                        </p>
                        <a class="btn btn-sm btn-white btn-block" href="agregarUsuario.htm">Crear una cuenta</a>
                    
                    </form:form> 
                    
                    
                    
                    
                    
                    <p class="m-t">
                        <small>MMR/UGM&copy; 2018</small>
                    </p>
                </div>
            </div>
        </div>
        <hr/>
        <div class="row">
            <div class="col-md-6">
                MMR/UGM
            </div>
            <div class="col-md-6 text-right">
               <small>© 2018</small>
            </div>
        </div>
    </div>
    </body>
</html>
