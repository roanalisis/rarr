<%-- 
    Document   : usuarioCrear
    Created on : May 27, 2018, 6:10:05 PM
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
        <!-- fin parte nueva -->
        
        
    </head>
    <body>
       
            
            
    <div id="wrapper">

    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav metismenu" id="side-menu">
                <li class="active">
                        <a href="index.htm"><i class="fa fa-th-large"></i> <span class="nav-label">Análisis</span> <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level collapse">
                            <li><a href="histograma.htm">Histograma</a></li>
                            <li ><a href="registros.htm">Tabla de datos</a></li>
                            <li ><a href="configuracion.htm">Configuración</a></li>
                        </ul>
                </li>
                
                <li class="active">
                        <a href="index.html"><i class="fa fa-th-large"></i> <span class="nav-label">Modificar de Termómetros</span> <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level collapse">
                            <li class="active"><a href="modificarTermometros.htm">Modificar</a></li>
                            <li><a href="index.htm">Eliminar</a></li>
                        </ul>
                </li>

                
                <li>
                        <!--<a href="layouts.html"><i class="fa fa-diamond"></i> <span class="nav-label">Layouts</span></a>-->
                        <a href="<c:url value="agregarTermometro.htm" />">Agregar Termómetro</a><br />
                        <a href="<c:url value="agregarUsuario.htm" />">Agregar Usuario</a><br />
                        <a href="<c:url value="login.htm" />">Log out</a><br />
                        
                        
                        
                </li>
                
                
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
                    <input type="text" placeholder="Modificar temómetros" class="form-control" name="top-search" id="top-search">
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
                    <h2>Modificar Termómetros</h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="index.htm">Home</a>
                        </li>
                        <!--<li>
                            <a>Forms</a>
                        </li>-->
                        <li class="active">
                            <strong>Modificar Termómetros</strong>
                        </li>
                    </ol>
                </div>
                <div class="col-lg-2">

                </div>
            </div>
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
            <!--<div class="col-lg-7">-->
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>Ingrese los datos del termómetro <small> </small></h5>
                        <div class="ibox-tools">

                        </div>
                    </div>
                    <div class="ibox-content">
                        <div class="row">
                            <div class="col-sm-6 b-r"><h3 class="m-t-none m-b"> </h3>
                                <!--<p>Sign in today for more expirience.</p>-->
                                <!--<form role="form">-->
                                    
                                    <form:form modelAttribute="termometro" method="post">  

                                        <table>
                                            <tbody>
                                                    <tr>
                                                        <td colspan="1"> <strong>Id del Termómetro</strong><form:input id="idterm" path="idterm" type="idterm" placeholder="Id Termómetro" class="form-control" /><form:errors path="idterm" /><br /> </td>                                                                  
                                                           
                                                    </tr>
                                                    <tr>
                                                        <td colspan="1"> <strong>Dirección IP</strong><form:input id="dirip" path="dirip" type="dirip" placeholder="Dirección IP" class="form-control" /><form:errors path="dirip" /><br /> </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="1"> <strong>Puerto</strong><form:input id="dirpuerto" path="dirpuerto" type="dirpuerto" placeholder="Puerto" class="form-control" /><form:errors path="dirpuerto" /><br /> </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="1"> <strong>Canal termómetro</strong><form:input id="clase" path="clase" type="clase" placeholder="Canal" class="form-control" /><form:errors path="clase" /><br /> </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="1"> <strong>Nombre termómetro</strong><form:input id="nombre" path="nombre" type="nombre" placeholder="Nombre" class="form-control" /><form:errors path="nombre" /><br /> </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="1"> <strong>Rango Máximo</strong><form:input id="rangomax" path="rangomax" type="rangomax" placeholder="Rango Máximo" class="form-control" /><form:errors path="rangomax" /><br /> </td>                                                        
                                                    </tr>
                                                    <tr>
                                                        <td colspan="1"> <strong>Rango Mínimo</strong><form:input id="rangomin" path="rangomin" type="rangomin" placeholder="Rango Mínimo" class="form-control" /><form:errors path="rangomin" /><br /> </td>                                                        
                                                    </tr>
                                            </tbody>
                                        </table>
                                        
                                                    
                                                    
                                        
                                        <div>
                                            <button class="btn btn-sm btn-primary pull-right m-t-n-xs" input type="submit" value="Actualizar" ><strong>Actualizar</strong> </button> 
                                        </div>                                        
                                    </form:form> 
                                        
                                    
                                <!--</form>-->
                            </div>
                             <div class="col-sm-6"><h4>Lista de Termometros del Adam-6015</h4>
                                <!--<p>You can create an account:</p>-->
                                <p class="text-center">
                                    <!--<a href=""><i class="fa fa-sign-in big-icon"></i></a>-->
                                    <script type="text/javascript">
                                        idterm.value="";
                                        dirip.value="";
                                        dirpuerto.value="";
                                        clase.value="";
                                        nombre.value="";
                                        rangomax.value="";
                                        rangomin.value="";
                                    </script>
                                    
                                </p>
                                
                                
                                
                                <div class="col-lg-0">                                    
                                    <!--<div class="ibox float-e-margins">-->
                                    <div class="table-responsive">                                            
                                    <div class="ibox-content">
                                    <table id="table" class="table table-hover no-margins">
                                        <thead>
                                        <tr>

                                            <th>Id Termómetro </th>
                                            <th>Dirección IP </th>
                                            <th>Puerto </th>   
                                            <th>Canal </th> 
                                            <th>Nombre </th>  
                                            <th>Rango Máximo </th> 
                                            <th>Rango Mínimo </th>  
                                        </tr>
                                        </thead>
                                        <tbody>
                                         
                                        <c:forEach items="${lisTerm}" var="termometro">
                                            <option value="${termometro.idterm}" ></option>
                                                <tr>
                                                   <td>${termometro.idterm}</td>
                                                   <td>${termometro.dirip}</td>
                                                   <td>${termometro.dirpuerto}</td>
                                                   <td>${termometro.clase}</td>
                                                   <td>${termometro.nombre}</td>
                                                   <td>${termometro.rangomax}</td>
                                                   <td>${termometro.rangomin}</td>
                                                </tr>                                                
                                        </c:forEach>  

                                        </tbody>
                                    </table>
                                        <script>
                                            var table = document.getElementById('table'),rIndex;
                                            for (var i = 0; i < table.rows.length; i++){
                                                table.rows[i].onclick = function(){
                                                    rIndex = this.rowIndex;
                                                    console.log(rIndex);
                                                    document.getElementById("idterm").value = this.cells[0].innerHTML;
                                                    document.getElementById("dirip").value = this.cells[1].innerHTML;
                                                    document.getElementById("dirpuerto").value = this.cells[2].innerHTML;
                                                    document.getElementById("clase").value = this.cells[3].innerHTML;
                                                    document.getElementById("nombre").value = this.cells[4].innerHTML;    
                                                    document.getElementById("rangomax").value = this.cells[5].innerHTML;
                                                    document.getElementById("rangomin").value = this.cells[6].innerHTML;    
                                                };
                                            }
                                                        
                                        </script>
                                        
                                        
                                    </div>
                                    </div>
                                </div>
                                
                                
                                
                                
                                
                            </div> 
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
