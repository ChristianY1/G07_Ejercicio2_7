<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link rel="stylesheet" href="/Practica003/css/estilo.css" type="text/css">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

<title>Home</title>

</head>
<body>
<c:set var="usu" value="${requestScope['usuario'] }"/>
<c:set var="med" value="${requestScope['medico'] }"/>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="nav nav-tabs">
				<li class="nav-item">
					<a class="nav-link" href="/Resolucion/JSPs/PrivadaMedico/indexMedico.jsp">Home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/Resolucion/JSPs/PrivadaMedico/confMedico.jsp">Configurar</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/Resolucion/JSPs/"></a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/Resolucion/JSPs/Login.jsp">Login</a>
				</li>
			</ul>
		</div>
	</nav>
	
<div class="container">	
	<div class="center-block">
		<div class="card" style="width: 23rem;">
	<br>
		<div class="center">
    		<img alt="" src="https://image.flaticon.com/icons/png/512/64/64572.png" class="img-circle" height=70 weight=70>
    	</div>
	<br>
		<div class="card-body">
			<h5 class="card-title">	nombre ${usu.nombre } apellido${usu.apellido }</h5>
			<h6 class="card-subtitle mb-2 text-muted">especialidad${med.especialidad }</h6>
			<h6 class="card-subtitle mb-2 text-muted">correo${usu.correo }</h6>
			<h6 class="card-subtitle mb-2 text-muted">cedula${usu.cedula }</h6>
		</div>
		</div>
	</div>	
</div>


</body>
</html>