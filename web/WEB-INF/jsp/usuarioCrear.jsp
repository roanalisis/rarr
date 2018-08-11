<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type"; charset=UTF-8">
        <%@page session="true"%>
        <title>JSP Page</title>
        
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>INSPINIA | Register</title>

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.css" rel="stylesheet">
        <link href="css/plugins/iCheck/custom.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        
        
        <script>
                function determina() {  
                    <%
                    HttpSession s = request.getSession();                    
                    %>
                    var ni = '<%= (String)s.getAttribute("nombreIndex") %>';
                    console.log(ni);
                    if (ni == 'index'){
                        location.href='index.htm';                        
                    }else{                        
                        location.href='indexConfigurador.htm';                        
                    }
                }

        </script>
        
        
        
        
    </head>
    <body class="gray-bg">
        <div class="middle-box text-center loginscreen   animated fadeInDown">
            <div>
<!--                <div>

                    <h1 class="logo-name">A.T.A.</h1>

                </div>-->
                <h3>Ingreso de registro</h3>
                <p>Crea una cuenta y entra a la aplicación.</p>
                
                <form:form modelAttribute="usuario" method="post" class="m-t" role="form">
                    <div class="form-group">
                    <form:input id="nombre" path="nombre" type="nombre" placeholder="Nombre" class="form-control" required="" />
                    <form:errors path="nombre" /><br />
                    </div>
                    <div class="form-group">
                    <form:input id="nombreusuario" path="nombreusuario" type="nombreusuario" placeholder="Nombre usuario" class="form-control" required="" />
                    <form:errors path="nombreusuario" /><br />                    
                    </div>
                    <div class="form-group">
                    <form:input id="mail" path="mail" type="mail" placeholder="Email" class="form-control" required="" />
                    <form:errors path="mail" /><br />
                    </div>
                    <div class="form-group">
                    <form:input id="passwordU" path="passwordU" type="password" placeholder="Password" class="form-control" required="" />
                    <form:errors path="passwordU" /><br />                      
                    </div>
                    <div class="form-group">
                       <div class="checkbox i-checks"><label> <input id="ch" type="checkbox"><i></i> Acepto los términos y políticas </label></div>
                    </div>
                    
                    
                    <button input type="submit" class="btn btn-primary block full-width m-b">Registrar</button>  
                    
                    <c:if test="${mens=='guardado'}">             
                        <% response.sendRedirect("login.htm"); %> 
                    </c:if>
                    
                    
                    <p class="text-muted text-center"><small>¿Ya tienes una cuenta?</small></p>
                    <a class="btn btn-sm btn-white btn-block" href="login.htm">Login</a>  
                    
                    
                    <% 
//                        HttpSession s = request.getSession();
//                        //Crear variables de session
//                        String nombreindex = (String)s.getAttribute("nombreIndex");
//                        
//                        if (nombreindex.equals("index")){
//                            response.sendRedirect("index.htm");
//                        }else{
//                            response.sendRedirect("indexConfigurador.htm");
//                        }
                    %>
                    <a class="btn btn-sm btn-white btn-block" href="#" onclick="determina();">home</a> 
                    
                    
                </form:form> 


                <p class="m-t"> <small>Inspinia we app framework base on Bootstrap 3 &copy; 2018</small> </p>
            </div>
        </div>

        <!-- Mainly scripts -->
        <script src="js/jquery-2.1.1.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <!-- iCheck -->
        <script src="js/plugins/iCheck/icheck.min.js"></script>
        <script>
            $(document).ready(function(){
                $('.i-checks').iCheck({
                    checkboxClass: 'icheckbox_square-green',
                    radioClass: 'iradio_square-green',
                });
            });
        </script>
        
    </body>
</html>