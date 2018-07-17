<%-- 
    Document   : histograma
    Created on : Jun 4, 2018, 1:24:11 PM
    Author     : rodrigorr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>    
    <meta http-equiv="Content-Type" charset=UTF-8">
    <title>JSP Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>INSPINIA | Dashboard v.4</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    
    <!--jquery.dataTables.min-->
    <link href="css/DataTables/datatables.css" rel="stylesheet">
    <!--<link rel="stylesheet" href="http://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">-->
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <!--<script src="http://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>-->
    <script src="js/DataTables/datatables.js"></script>
    
</head>
    <body class="fixed-navigation">        
        <div id="wrapper">
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav metismenu" id="side-menu">
                    <li class="active">
                        <a href="index.htm"><i class="fa fa-th-large"></i> <span class="nav-label">Análisis</span> <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level collapse">
                            <li><a href="histograma.htm">Histograma</a></li>
                            <li class="active"><a href="registros.htm">Tabla de datos</a></li>
                            <li><a href="configuracion.htm">Configuración</a></li>
                        </ul>
                    </li>
                    
                    <li class="active">
                        <a href="index.html"><i class="fa fa-th-large"></i> <span class="nav-label">Modificar de Termómetros</span> <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level collapse">
                            <li><a href="modificarTermometros.htm">Modificar</a></li>
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

            <div id="page-wrapper" class="gray-bg sidebar-content">
            <div class="row border-bottom">
            <nav class="navbar navbar-static-top white-bg" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
<!--                <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>-->
                <form role="search" class="navbar-form-custom" action="search_results.html">
<!--                    <div class="form-group">
                        <input type="text" placeholder="Search for something..." class="form-control" name="top-search" id="top-search">
                    </div>-->
                </form>
            </div>
                <ul class="nav navbar-top-links navbar-right">
                    <li>
<!--                        <span class="m-r-sm text-muted welcome-message">Welcome to INSPINIA+ Admin Theme.</span>-->
                    </li>
                    <li class="dropdown">
<!--                        <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                            <i class="fa fa-envelope"></i>  <span class="label label-warning">16</span>
                        </a>-->
                        <ul class="dropdown-menu dropdown-messages">
                            <li>
                                <div class="dropdown-messages-box">
<!--                                    <a href="profile.html" class="pull-left">
                                        <img alt="image" class="img-circle" src="img/a7.jpg">
                                    </a>-->
                                    <div>
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
                                    <div>
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
                                    <div>
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
<!--                        <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
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
                    <li>
                        <a class="right-sidebar-toggle">
                            <i class="fa fa-tasks"></i>
                        </a>
                    </li>
                </ul>

            </nav>
            </div>

                <div class="wrapper wrapper-content">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="ibox float-e-margins">
                                <div class="ibox-content">
                                        <!--<div>-->                                                              
                                            <table id="example" class="display" style="width:100%">
                                                <thead>
                                                    <tr>
                                                        <th>Id Registro</th>
                                                        <th>Fecha/Hora</th>
                                                        <th>Temperatura</th>
                                                        <th>Nombre termómetro</th> 
                                                        <th>Activo</th> 
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <option value="${registrotemp.idreg}" >  
                                                    <c:forEach items="${lisReg}" var="registrotemp">
                                                        <tr>                                                                                                                  
                                                               <td>${registrotemp.idreg}</td>
                                                               <td>${registrotemp.tmestamp}</td>
                                                               <td>${registrotemp.temperatura}</td>
                                                               <td>${registrotemp.idtermometro.nombre}</td>
                                                               <td>${registrotemp.active}</td>                                                         
                                                        </tr> 
                                                    </c:forEach>  
                                                      
                                                </tbody>
                                                <tfoot>
                                                    <tr>
                                                        <th>Id Registro</th>
                                                        <th>Fecha/Hora</th>
                                                        <th>Temperatura </th>
                                                        <th>Termómetro</th> 
                                                        <th>Estado</th> 
                                                    </tr>
                                                </tfoot>
                                            </table>
<!--                                            <small>Sales marketing.</small>-->
                                        <!--</div>-->

                                </div>
                            </div>
<!--                        </div>-->
                    </div>




                </div>
            <div class="footer">
                <div class="pull-right">
<!--                    10GB of <strong>250GB</strong> Free.-->
                </div>
                <div>
                    <strong>MMR</strong> &copy; 2018
                </div>
            </div>
            </div>

        </div>
          
        <!--<script type="text/javascript" charset="utf8" src="js/DataTables/datatables.js"></script>-->        


        <!-- Mainly scripts -->
        <!--<script src="js/jquery-2.1.1.js"></script>-->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
        <script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
        
        

        <!-- Flot -->
        <script src="js/plugins/flot/jquery.flot.js"></script>
        <script src="js/plugins/flot/jquery.flot.tooltip.min.js"></script>
        <script src="js/plugins/flot/jquery.flot.spline.js"></script>
        <script src="js/plugins/flot/jquery.flot.resize.js"></script>
        <script src="js/plugins/flot/jquery.flot.pie.js"></script>
        <script src="js/plugins/flot/jquery.flot.symbol.js"></script>
        <script src="js/plugins/flot/curvedLines.js"></script>

        <!-- Peity -->
        <script src="js/plugins/peity/jquery.peity.min.js"></script>
        <script src="js/demo/peity-demo.js"></script>

        <!-- Custom and plugin javascript -->
        <script src="js/inspinia.js"></script>
        <script src="js/plugins/pace/pace.min.js"></script>

        <!-- jQuery UI -->
        <script src="js/plugins/jquery-ui/jquery-ui.min.js"></script>

        <!-- Jvectormap -->
        <script src="js/plugins/jvectormap/jquery-jvectormap-2.0.2.min.js"></script>
        <script src="js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>

        <!-- Sparkline -->
        <script src="js/plugins/sparkline/jquery.sparkline.min.js"></script>

        <!-- Sparkline demo data  -->
        <script src="js/demo/sparkline-demo.js"></script>

        <!-- ChartJS-->
        <script src="js/plugins/chartJs/Chart.min.js"></script>
        
        <script type="text/javascript">
            
            $(document).ready(function() {                
                // Setup - add a text input to each footer cell
                $('#example tfoot th').each( function () {
                    var title = $(this).text();
                    $(this).html( '<input type="text" placeholder="Buscar '+title+'" />' );                    
                } );

                // DataTable
                var table = $('#example').DataTable();

                // Apply the search
                table.columns().every( function () {
                    var that = this;

                    $( 'input', this.footer() ).on( 'keyup change', function () {
                        if ( that.search() !== this.value ) {
                            that
                                .search( this.value )
                                .draw();                        
                        }
                    } );                                   
                } );
            } );

        </script>

        
    </body>
    
</html>