<%-- 
    Document   : ConfiguracionCrear
    Created on : Jun 11, 2018, 11:01:18 AM
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

        <!-- parte nueva -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<title>INSPINIA | Basic Form</title>-->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.css" rel="stylesheet">
        <link href="css/plugins/iCheck/custom.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css" rel="stylesheet">
    </head>
    <body>
        <%
            HttpSession s = request.getSession();

            String estoyEnLogin = (String) s.getAttribute("estoyEnLogin");

            if (estoyEnLogin.equals("si")) {
                response.sendRedirect("login.htm");
            }
        %>
        <div id="wrapper">

            <nav class="navbar-default navbar-static-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav metismenu" id="side-menu">
                        <li class = "active"><a><p style="color:#33FF63";><i class="fa fa-cogs"></i> <span class="nav-label">Configuración</span></p></a> </li>
                        <!--<a href="layouts.html"><i class="fa fa-diamond"></i> <span class="nav-label">Layouts</span></a>-->
                        <li class = "active"><a href="configuracion.htm"><i class="fa fa-cog"></i> <span class="nav-label">Configurar Termómetro</span></a></li>
                        <li><a href="modificarTermometros.htm"><i class="fa fa-edit"></i> <span class="nav-label">Modificar Termómetro</span></a></li>
                        <li><a href="agregarTermometro.htm"><i class="fa fa-plus"></i> <span class="nav-label">Agregar Termómetro</span></a></li>
                        <li><a href="eliminarTermometros.htm"><i class="fa fa-trash"></i> <span class="nav-label">Eliminar Termómetro</span></a></li>   
                        <li><a href="<c:url value="agregarUsuario.htm" />"><i class="fa fa-user"></i> <span class="nav-label">Agregar Usuario</span></a></li>
                        <li class = "active"><a href="<c:url value="login.htm" />"><p style="color:#33FF63";><i class="fa fa-sign-out"></i> <span class="nav-label">Log out</span></p></a></li>


                    </ul>

                </div>
            </nav>

            <div id="page-wrapper" class="gray-bg">
                <div class="row border-bottom">
                    <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                        <div class="navbar-header">
                            <!--<a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a> -->
                            <form role="search" class="navbar-form-custom" action="search_results.html">
                                <div class="form-group">
                                    <input type="text" placeholder="Configuración" class="form-control" name="top-search" id="top-search">
                                </div>
                            </form>
                        </div>
                        <ul class="nav navbar-top-links navbar-right">
                            <li>
                                <span class="m-r-sm text-muted welcome-message">A.T.A.</span>
                            </li>
                            <li class="dropdown">
                                <!--<a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                                    <i class="fa fa-envelope"></i>  <span class="label label-warning">16</span>
                                </a>-->
                                <ul class="dropdown-menu dropdown-messages">
                                    <li>
                                        <div class="dropdown-messages-box">
                                            <a href="profile.html" class="pull-left">
                                                <img alt="image" class="img-circle" src="img/a7.jpg">
                                            </a>
                                            <div class="media-body">
                                                <small class="pull-right">46h ago</small>
                                                <strong>Mike Loreipsum</strong> started following <strong>Monica Smith</strong>. <br>
                                                <small class="text-muted">3 days ago at 7:58 pm - 10.06.2014</small>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <div class="dropdown-messages-box">
                                            <a href="profile.html" class="pull-left">
                                                <img alt="image" class="img-circle" src="img/a4.jpg">
                                            </a>
                                            <div class="media-body ">
                                                <small class="pull-right text-navy">5h ago</small>
                                                <strong>Chris Johnatan Overtunk</strong> started following <strong>Monica Smith</strong>. <br>
                                                <small class="text-muted">Yesterday 1:21 pm - 11.06.2014</small>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <div class="dropdown-messages-box">
                                            <a href="profile.html" class="pull-left">
                                                <img alt="image" class="img-circle" src="img/profile.jpg">
                                            </a>
                                            <div class="media-body ">
                                                <small class="pull-right">23h ago</small>
                                                <strong>Monica Smith</strong> love <strong>Kim Smith</strong>. <br>
                                                <small class="text-muted">2 days ago at 2:30 am - 11.06.2014</small>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <div class="text-center link-block">
                                            <a href="mailbox.html">
                                                <i class="fa fa-envelope"></i> <strong>Read All Messages</strong>
                                            </a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <!--<a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                                    <i class="fa fa-bell"></i>  <span class="label label-primary">8</span>
                                </a>-->
                                <ul class="dropdown-menu dropdown-alerts">
                                    <li>
                                        <a href="mailbox.html">
                                            <div>
                                                <i class="fa fa-envelope fa-fw"></i> You have 16 messages
                                                <span class="pull-right text-muted small">4 minutes ago</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="profile.html">
                                            <div>
                                                <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                                <span class="pull-right text-muted small">12 minutes ago</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="grid_options.html">
                                            <div>
                                                <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                                <span class="pull-right text-muted small">4 minutes ago</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <div class="text-center link-block">
                                            <a href="notifications.html">
                                                <strong>See All Alerts</strong>
                                                <i class="fa fa-angle-right"></i>
                                            </a>
                                        </div>
                                    </li>
                                </ul>
                            </li>


                            <li>
                                <a href="login.htm">
                                    <i class="fa fa-sign-out"></i> Log out
                                </a>
                            </li>
                        </ul>

                    </nav>
                </div>
                <div class="row wrapper border-bottom white-bg page-heading">
                    <div class="col-lg-10">
                        <h2>Configuración</h2>
                        <ol class="breadcrumb">
                            <li>
                                <a href="indexConfigurador.htm">Home</a>
                            </li>                        
                            <li class="active">
                                <strong>Configuración Termómetro</strong>
                            </li>
                        </ol>
                    </div>
                    <div class="col-lg-2">

                    </div>
                </div>
                <div class="wrapper wrapper-content animated fadeInRight">
                    <div class="row">
                        <div class="col-lg-7">
                            <div class="ibox float-e-margins">
                                <div class="ibox-title">
                                    <h5>Ingrese parámetros a configurar <small> </small></h5>
                                    <div class="ibox-tools">

                                    </div>
                                </div>
                                <div class="ibox-content">
                                    <div class="row">
                                        <div class="col-sm-6 b-r"><h3 class="m-t-none m-b"> </h3>
                                            <!--<p>Sign in today for more expirience.</p>-->
                                            <!--<form role="form">-->

                                            <form:form modelAttribute="configuracion" method="post">
                                                <strong>Temperatura Máxima</strong><form:input id="maxim" path="maxim" type="maxim" placeholder="Tope Máximo" class="form-control" /><form:errors path="maxim" /><br />
                                                <strong>Temperatura Mínima</strong><form:input id="minim" path="minim" type="minim" placeholder="Tope Mínimo" class="form-control" /><form:errors path="minim" /><br />
                                                <strong>Horas</strong><form:input id="intervaloh" path="intervaloh" type="intervaloh" placeholder="Intervalo en horas" class="form-control" /><form:errors path="intervaloh" /><br />
                                                <strong>Minutos</strong><form:input id="intervalom" path="intervalom" type="intervalom" placeholder="Intervalo en minutos" class="form-control" /><form:errors path="intervalom" /><br />            
                                                <strong>Segundos</strong><form:input id="intervalos" path="intervalos" type="intervalos" placeholder="Intervalo en segundos" class="form-control" /><form:errors path="intervalos" /><br />           


                                                <strong>Termómetros</strong><br />
                                                <form:select path="idtermometro">
                                                    <form:option value="0" label="--- Select ---"/>                                            
                                                    <c:forEach items="${lisTerm}" var="termometro">
                                                        <option value="${termometro.idterm}" >
                                                            ${termometro.nombre}
                                                        </option>
                                                    </c:forEach>
                                                    <form:errors path="idtermometro" /><br />
                                                </form:select><br />  

                                                <div>
                                                    <button class="btn btn-sm btn-primary pull-right m-t-n-xs" input type="submit" value="Registrar" ><strong>Registrar</strong> </button> 
                                                </div>                                        
                                            </form:form> 


                                            <!--</form>-->
                                        </div>
                                        <div class="col-sm-6"><h4>Resultado</h4>
                                            <!--<p>You can create an account:</p>-->
                                            <p class="text-center">
                                                <!--<a href=""><i class="fa fa-sign-in big-icon"></i></a>-->
                                                <script type="text/javascript">
                                                    maxim.value = "";
                                                    minim.value = "";
                                                    intervaloh.value = "";
                                                    intervalom.value = "";
                                                    intervalos.value = "";
                                                </script>
                                            <div><strong><c:out value="${mensaje} " /></strong> </div>
                                            <div><c:out value="${mensAj} " /> </div>
                                            <div><c:out value="${maxim} " /> </div>
                                            <div><c:out value="${minim} " /> </div>
                                            <div><c:out value="${intervaloh} " /> </div>
                                            <div><c:out value="${intervalom} " /> </div>
                                            <div><c:out value="${intervalos} " /> </div>
                                            <div><c:out value="${aDam} " /> </div>
                                            </p>
                                        </div> 
                                    </div>
                                </div>    
                            </div>
                        </div>


                        <div class="col-lg-5">
                            <div class="ibox float-e-margins">
                                <div class="ibox-title">
                                    <h5>Configuraciones realizadas</h5>
                                    <!--<div class="ibox-tools">-->
                                    <!--                                <a class="collapse-link">
                                                                        <i class="fa fa-chevron-up"></i>
                                                                    </a>-->
                                    <!--                                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                                                        <i class="fa fa-wrench"></i>
                                                                    </a>
                                                                    <ul class="dropdown-menu dropdown-user">
                                                                        <li><a href="#">Config option 1</a>
                                                                        </li>
                                                                        <li><a href="#">Config option 2</a>
                                                                        </li>
                                                                    </ul>-->
                                    <!--                                <a class="close-link">
                                                                        <i class="fa fa-times"></i>
                                                                    </a>-->
                                    <!--</div>-->
                                </div>
                                <div class="ibox-content">
                                    <form class="form-horizontal">
                                        <!--<p>Sign in today for more expirience.</p>-->

                                        <div class="col-lg-0">                                    
                                            <!--<div class="ibox float-e-margins">-->
                                            <div class="table-responsive">                                            
                                                <div class="ibox-content">
                                                    <table id="table" class="table table-hover no-margins">
                                                        <thead>
                                                            <tr>

                                                                <th>Id Configuración </th>
                                                                <th>Nombre temómetro </th>
                                                                <th>Temp Máx </th>   
                                                                <th>Temp Mín </th> 
                                                                <th>Intervalo h </th>  
                                                                <th>Intervalo m </th> 
                                                                <th>Intervalo s </th>  
                                                            </tr>
                                                        </thead>
                                                        <tbody>

                                                            <c:forEach items="${listConfiguraciones}" var="configuracion">
                                                            <option value="${configuracion.idconf}" ></option>
                                                            <tr>
                                                                <td>${configuracion.idconf}</td>
                                                                <td>${configuracion.idtermometro.nombre}</td>
                                                                <td>${configuracion.maxim}</td>
                                                                <td>${configuracion.minim}</td>
                                                                <td>${configuracion.intervaloh}</td>
                                                                <td>${configuracion.intervalom}</td>
                                                                <td>${configuracion.intervalos}</td>
                                                            </tr>                                                
                                                        </c:forEach>  

                                                        </tbody>
                                                    </table>

                                                </div>
                                            </div>
                                        </div>


                                    </form>
                                </div>
                            </div>
                        </div>





                    </div>

                </div>
                <div class="footer">
                    <div class="pull-right">
                        10GB of <strong>250GB</strong> Free.
                    </div>
                    <div>
                        <strong>MMR</strong> &copy; 2018
                    </div>
                </div>

            </div>
        </div>


        <!-- Mainly scripts -->
        <script src="js/jquery-2.1.1.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
        <script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

        <!-- Custom and plugin javascript -->
        <script src="js/inspinia.js"></script>
        <script src="js/plugins/pace/pace.min.js"></script>



        <!-- iCheck -->
        <script src="js/plugins/iCheck/icheck.min.js"></script>
        <script>
                                                    $(document).ready(function () {
                                                        $('.i-checks').iCheck({
                                                            checkboxClass: 'icheckbox_square-green',
                                                            radioClass: 'iradio_square-green',
                                                        });
                                                    });
        </script>
    </body>
</html>
