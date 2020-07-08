<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de nuevo Usuario</title>
<link rel="stylesheet" href="/Resolucion/CONFIG/Style/style.css" type="text/css"/>
</head>
<body>
	<a href="/Resolucion/JSPs/index.jsp" style="font-size:x-large">Inicio</a>
	
	<form action="/Resolucion/RegistrarUsuario" method="POST">
		<div class="container">
			<h1>Registro de nuevo usuario</h1><br>
			<label for="nombre">Nombres:</label><br>
			<input type="text" placeholder="nombre" name="nombre" required>
			<br>
			<label for="apellidos">Apellidos:</label><br>
			<input type="text" placeholder="apellido" name="apellido" required>
			<br>
			<label for="cedula">Numero de cedula:</label><br>
			<input type="text" placeholder="Numero de cedula" name="cdi" required>
			<br>
			<label for="fechaNacimiento">Fecha Nacimiento:</label><br>
    		<input type="date" id="fechaNacimiento" name="trip-start"
       			value="1980-01-01"
       			min="1985-01-01" max="2020-12-31" required>
       			<br>
       		<label for="sexo">Sexo</label><br>
    		<select id="sexo" name="sexo" required>
        		<option value="femenino">Femenino</option>
       				 <option value="masculino">Masculino</option>
    		</select><br>
    		<label for="telefono">Numero de telefono:</label><br>
			<input type="text" placeholder="numero de telefono" name="telefono" required><br>
			<label for="correo">Correo electronico:</label><br>
			<input type="text" placeholder="ejemplo@ejemplo.com" name="correo" required><br>
			<label for="pwd">Contrasena:</label><br>
			<input type="password" placeholder="contrasena" name="pwd" required><br>
			
			<button type="submit" name="resp" value="Registrarse">Crear Usuario</button><br>
		</div>
	</form>
	<br>
	<br>
	<br>
	<br>

</body>
</html>