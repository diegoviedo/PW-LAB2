<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
			<meta charset="UTF-8">
			<title>REGISTRO ONPE</title>
				<link rel='stylesheet' type="text/css" href="../css/onpe.css">
				</head>
	<body>
	
	<div class='cuadritoizq3'>
	<ul>
	<li><p class='gris'><a href='index.html'><b>BUSCAR </b></a></p>
	<li><p class='gris'><a href='registro.jsp'><b>REGISTRAR</b></a> </p>
	<li><p class='gris'><a href='/ver'><b>VER</b> </a> </p></div>
	</ul>
	</div>

	<div class='centro'>
	
  	<div class='titulo'><h2 class='onpe'>REGISTRANDO</h2></div>
  	
	<form action ="/registro" method="get">
	<div class='oracion'><h2 class='gris'>DNI:<input type="text" name="dni123"></h2></div>
	<div class='oracion'><h2 class='gris'>NOMBRE:<input type="text" name="nombre123"></h2></div>
	<div class='oracion'><h2 class='gris'>APELLIDO:<input type="text" name="apellido123"></h2></div>
	<div class='oracion'><h2 class='gris'>MIENBRO:<select name="mienbro123">
						<option value="no">NO</option>
   						<option value="si">SI</option> </select></h2></div>
	<div class='oracion'><h2 class='gris'>MESA<input type="text" name="mesa123"></h2></div>
	<div class='oracion'><h2 class='gris'>LOCAL<input type="text" name="local123"></h2></div>
	<div class='oracion'><h2 class='gris'>PABELLON<input type="text" name="pabellon123"></h2></div>
	<div class='oracion'><h2 class='gris'>PISO<input type="text" name="piso123"></h2></div>
	<div class='oracion'><h2 class='gris'>AULA<input type="text" name="aula123"></h2></div>
	<div class='oracion'><h2 class='gris'>DIRECCION<input type="text" name="direccion123"></h2></div>
	<div class='oracion'> <button name="dato1"><h2 class='gris'>REGISTRAR</h2></button></div>
	</form>
 	</div>
    <div class='cuadro'>
	<footer>CREADO POR :Diego Oviedo Yauri <br>CURSO : PW2<br>Laboratorio-Grupo: 03-E<br>25 de Abril del 2016 09:00 </footer></div>
   
</body>
</html>