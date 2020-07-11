<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/Resolucion/JSPs/index.jsp" style="font-size:x-large">Inicio</a><br>
<br>
	<div class="body">
		<div class="login">
			<form action="/Resolucion/IniciarSesion" method="POST">
				<input type="text" placeholder="Email" name="user" requiered><br>
				<input type="password" placeholder="contrasena" name="pwd" requiered><br>
				<button type="submit" name="resp" value="Login">Log In</button>
			</form>
		</div>
	</div>
</body>
</html>