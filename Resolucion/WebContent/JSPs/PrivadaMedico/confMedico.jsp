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

<title>Configuracion Medico</title>

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
					<a class="nav-link" href="/Resolucion/JSPs/"></a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/Resolucion/JSPs/"></a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="/Resolucion/JSPs/login.jsp"></a>
				</li>
			</ul>
		</div>
	</nav>
	
<h1>CONFIGURACION</h1>	

<div class="container">
	<table class="table">
	<thead>
		<tr>
			<th scope="col">Nombre</th>
			<th scope="col">Apellido</th>
			<th scope="col">Correo</th>
			<th scope="col">Cedula</th>
			<th scope="col">Telefono</th>
			<th scope="col">Sexo</th>
			<th scope="col">Contraseña</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="usu1" items="${usu }">
			<tr>
				<td>${usu1.nombre }</td>
				<td>${usu1.apellido }</td>
				<td>${usu1.email }</td>
				<td>${usu1.cedula }</td>
				<td>${usu1.telefono }</td>
				<td>${usu1.sexo }</td>
				<td>${usu1.contrasena }</td>
				<td><a class="nav-link badge badge-info" href="/Resolusion/ControladorEditar?id=${usu1.id }">Editar</a></td>
				<td><a class="nav-link badge badge-danger" href="/Resolusion/ControladorEliminar?id=${usu1.id }">Eliminar</a></td>			
			</tr>
			
		</c:forEach>
	</tbody>
	</table>
</div>
	
</body>
</html>