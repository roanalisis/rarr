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

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>INSPINIA | Login</title>

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

        <link href="css/animate.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">



        <script>
            var gloDato;
            function enviar() {
                var nomu = $('#nombreusuario').val();
                $.post('EnviarCorreoServlet', {
                    nomu: nomu,
                    vienede: '1'
                });

            }

        </script>




    </head>

    <body class="gray-bg">

        <div class="middle-box text-center loginscreen animated fadeInDown">
            <div>
                <div>

                    <h1 class="logo-name">IN+</h1>

                </div>
                <h3>Configurador</h3>
                <!--            <p>Perfectly designed and precisely prepared admin theme with over 50 pages with extra new web app views.
                                Continually expanded and constantly improved Inspinia Admin Them (IN+)
                            </p>-->
                <p>Login in.</p>


                <form:form modelAttribute="configurador" method="post" class="m-t" role="form">
                    <div class="form-group">
                        <form:input id = "nombreusuario" path="nombreusuario" type="text" placeholder="Nombre usuario" class="form-control" required="" />
                        <form:errors path="nombreusuario" /><br />                    
                    </div>                
                    <div class="form-group">
                        <form:input path="password" type="password" placeholder="Password" class="form-control" required="" />
                        <form:errors path="password" /><br />                       
                    </div>                    

                    <button input type="submit" class="btn btn-primary block full-width m-b">Login</button>


                    <c:if test="${mensaje=='Usuario o Password incorrectos.'}"> 
                        <a href="#">
                            <small>Usuario o Password incorrectos.</small>
                        </a>
                    </c:if>

                    <c:if test="${mensaje=='Encontrado'}">    
                        <%
                            HttpSession s = request.getSession();                            
                            s.setAttribute("estoyEnLogin", "no");
                        %>
                        <% response.sendRedirect("indexConfigurador.htm");%> 
                    </c:if>


                    <a href="#" onclick="enviar();"><small>Enviar Password al correo.</small></a>
                    <!--<p class="text-muted text-center"><small>¿No tiene una cuenta?</small></p>-->
                    <!--<a class="btn btn-sm btn-white btn-block" href="agregarUsuario.htm">Crear una cuenta</a>-->

                </form:form> 


                <p class="m-t"> <small>Inspinia we app framework base on Bootstrap 3 &copy; 2014</small> </p>
            </div>
        </div>

        <!-- Mainly scripts -->
        <script src="js/jquery-2.1.1.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </body>

</html>
