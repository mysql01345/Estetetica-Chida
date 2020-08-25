<%-- 
    Document   : Cliente.jsp
    Created on : 17/08/2020, 10:47:34 PM
    Author     : Juampi
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*, Controlador.*" session="true" %>

<%  

    //todo lo que hay aqui adentro es codigo java
    String usuario = "";
    HttpSession sessionok = request.getSession();
    if(sessionok.getAttribute("usuario") == null){

%>

<jsp:forward page="index.html">
    <jsp:param name="error" value="Es obligatorio tener una cuenta autenticada"/>
</jsp:forward>

<%   

    }else{
        usuario = (String)sessionok.getAttribute("usuario");
    }
    //todo lo anterior se encarga de validar la sesion que sea correcta
%>


<%
 
  
  Cliente c = new Cliente();

%>


<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Inner Page - iPortfolio Bootstrap Template</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets2/img/favicon.png" rel="icon">
  <link href="assets2/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets2/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets2/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="assets2/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets2/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="assets2/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="assets2/vendor/aos/aos.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets2/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: iPortfolio - v1.4.0
  * Template URL: https://bootstrapmade.com/iportfolio-bootstrap-portfolio-websites-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Mobile nav toggle button ======= -->
  <button type="button" class="mobile-nav-toggle d-xl-none"><i class="icofont-navigation-menu"></i></button>

  <!-- ======= Header ======= -->
  <header id="header">
    <div class="d-flex flex-column">

      <div class="profile">
        <img src="assets2/img/profile-img.jpg" alt="" class="img-fluid rounded-circle">
        <h1 class="text-light"><a href="index.html"><%=usuario%></a></h1>
        

      <nav class="nav-menu">
        <ul>
          <li><a href="index.html"><i class="bx bx-home"></i> <span>Home</span></a></li>
          <li><a href="#Agenda"><i class="bx bx-user"></i> <span>Citas</span></a></li>
          <li><a href="#Cuenta"><i class="bx bx-file-blank"></i> <span>Cuenta</span></a></li>
        </ul>
      </nav><!-- .nav-menu -->
      <button type="button" class="mobile-nav-toggle d-xl-none"><i class="icofont-navigation-menu"></i></button>

    </div>
  </header><!-- End Header -->

  <main id="main">

    <!-- ======= Breadcrumbs ======= -->
    <section class="breadcrumbs">
      <div class="container">

        <div class="d-flex justify-content-between align-items-center">
          <h2>Bienvenido</h2><%=usuario%>
          <ol>
            <li><a href="index.html">Home</a></li>
            <li>Inner Page</li>
          </ol>
        </div>

      </div>
    </section><!-- End Breadcrumbs -->

    <!-- Inicio de Cita -->
    
     <section id="Agenda" class="Agenda">
      <div class="container">
 
          <div class="col-md-6 order-md-last ftco-animate makereservation p-4 p-md-5 pt-5">
          	<div class="py-md-5">
	          	<div class="heading-section ftco-animate mb-5">
		          	<span class="subheading"></span>
		            <h2 class="mb-4">Agenda tu cita</h2>
		          </div>
	            <form action="#">
	              <div class="row">
                          
	                <div class="col-md-6">
	                  <div class="form-group">
                              <label for="">Nombre</label>
	                    <input type="text" class="form-control" placeholder="Your Name">
	                  </div>
	                </div>
                          
                          
                              <div class="col-md-6">
	                  <div class="form-group">
	                    <label for="">Usario</label>
	                    <input type="text" class="form-control" placeholder="Ingresa tu usuario">
	                  </div>
	                </div>
                          
                          
	                <div class="col-md-6">
	                  <div class="form-group">
	                    <label for="">Correo</label>
	                    <input type="text" class="form-control" placeholder="Your Email">
	                  </div>
	                </div>
                          
	                <div class="col-md-6">
	                  <div class="form-group">
	                    <label for="">Telefono</label>
	                    <input type="text" class="form-control" placeholder="Phone">
	                  </div>
	                </div>
	                <div class="col-md-6">
	                  <div class="form-group">
	                    <label for="">Fecha</label>
	                    <input type="Date" class="form-control" id="" placeholder="Date">
	                  </div>

                            
	                </div>
                          
                          
	                <div class="col-md-6">
	                  <div class="form-group">
	                    <label for="">Hora</label>
	                    <input type="Time" class="form-control" id="" placeholder="Time">
	                  </div>
	                </div>
                          
                            <div class="col-md-6">
	                  <div class="form-group">
	                    <label for="">Sucursales</label>
                            	<select name="" id="" class="form-control">
	                        <option value="">Paquetes o Servicios</option>
	                        <option value="">1</option>
	                        <option value="">2</option>
	                        <option value="">3</option>
	                        <option value="">4+</option>
	                      </select>
	                  </div>
	                </div>
                          
 
	                <div class="col-md-6">
	                  <div class="form-group">
	                    <label for="">Paquetes Caballero</label>
	                    <div class="select-wrap one-third">
	                      <div class="icon"><span class="ion-ios-arrow-down"></span></div>
	                      <select name="" id="" class="form-control">
	                        <option value="">Paquetes o Servicios</option>
	                        <option value="">1</option>
	                        <option value="">2</option>
	                        <option value="">3</option>
	                        <option value="">4+</option>
	                      </select>
	                    </div>
	                  </div>
                          </div>
 
                          <div class="col-md-6">
	                  <div class="form-group">
	                    <label for="">Paquetes Dama</label>
                            	<select name="" id="" class="form-control">
	                        <option value="">Paquetes o Servicios</option>
	                        <option value="">1</option>
	                        <option value="">2</option>
	                        <option value="">3</option>
	                        <option value="">4+</option>
	                      </select>
	                  </div>
	                </div>
                      </div>
                            
	               
	                <div class="col-md-12 mt-3">
	                  <div class="form-group">
	                    <input type="submit" value="Reservar ahora" class="btn btn-primary py-3 px-5">
	                  </div>
	                </div>
	              </div>
	            </form>
	          </div>
          </div>
          
          <div class="col-md-6 d-flex align-items-stretch pb-5 pb-md-0">
						<div id="map"></div>
					</div>
        </div>
			</div>
		</section>
<!-- Fin Cita -->
                      <section id="Cuenta" class="Cuenta">
                      <div class="container">
                          <form method="post" name="frmEditar_Cliente" action="Editar_Cliente">
					<h3>Tus Datos </h3>
					<div class="form-group">
						<input type="text" placeholder="Apellido Paterno" class="form-control" id ="paterno" name="paterno" <%=c.getAppat_cli()%>>
						
                                                <input type="text" placeholder="Apellido Materno" class="form-control"  id ="materno" name="materno" <%=c.getApmat_cli() %>>
					</div>

						 <input type="text" placeholder="Nombre(s)" class="form-control" id="nombre" name="nombre" <%=c.getNom_cli() %>> 
						 
                                                <div class="form-wrapper">
                                                    <input type="text" placeholder="Usuario" class="form-control"  id="usuario" name="usuario" <%=c.getUser_musr() %> >
                                                    <i class="zmdi zmdi-account"></i>
                                                </div>
                                                <div class="form-wrapper">
                                                    <input type="text" placeholder="Correo" class="form-control" id="correo"  name="correo"  <%=c.getCorreo_cli() %> >
                                                    <i class="zmdi zmdi-email"></i>
                                                </div>
                                                <div class="form-wrapper">
                                                    <input type="text" placeholder="Telefono" class="form-control" id="telefono"  name="telefono" <%=c.getTel_cli()%>>

                                                </div>
                                                <div class="form-wrapper">
                                                    <select name="sexo" id="sexo" class="form-control" <%=c.getSex_cli()%> >
							<option value="" disabled selected>Genero</option>
							<option value="Masculino">Hombre</option>
							<option value="Femenino">Mujer</option>
							<option value="other">Otro</option>
                                                    </select>
                                                    <i class="zmdi zmdi-caret-down" style="font-size: 17px"></i>
                                                </div>
                                                <div class="form-wrapper">
                                                    <input type="password" placeholder="Contraseña" class="form-control" id="contrasena" name="contrasena" <%=c.getPass_musr()%>>
                                                    <i class="zmdi zmdi-lock"></i>
                                                </div>

                                                 
                                        <button type="submit" name="entrar" id="entrar" value="Entrar" class="btn_3">
                                          Editar
                                        </button>
        <div class="col-md-6 d-flex align-items-stretch pb-5 pb-md-0">
						<div id="map"></div>
					</div>
        </div>
			</div>
		</section>






























  </main>
  
  
  
  
  

  

  <a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets2/vendor/jquery/jquery.min.js"></script>
  <script src="assets2/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets2/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="assets2/vendor/php-email-form/validate.js"></script>
  <script src="assets2/vendor/waypoints/jquery.waypoints.min.js"></script>
  <script src="assets2/vendor/counterup/counterup.min.js"></script>
  <script src="assets2/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets2/vendor/venobox/venobox.min.js"></script>
  <script src="assets2/vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="assets2/vendor/typed.js/typed.min.js"></script>
  <script src="assets2/vendor/aos/aos.js"></script>

  <!-- Template Main JS File -->
  <script src="assets2/js/main.js"></script>

</body>

</html>