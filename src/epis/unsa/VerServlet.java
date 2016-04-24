package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		//ArrayList<Persona>poblacion=(ArrayList<Persona>)getServletContext().getAttribute("poblacion");
		
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println(
		"<!DOCTYPE html>"
		+"<head>"
			+"<meta charset='UTF-8'>"
			+"<title>VerLista</title>"
			+"<link rel='stylesheet' type='text/css' href='tablaCss.css'>"
		+"</head>"
		+"<body>"
			+"<div id='contenedor'>"
		    +"<div id='contenidos'>"
		    	+"<div class='columna'>DNI</div>"
		        +"<div class='columna'>Nombres</div>"
		        +"<div class='columna'>Apellidos</div>"
		        +"<div class='columna'>MienbroDeMesa</div>"
		        +"<div class='columna'>MesaSufragio</div>"
		        +"<div class='columna'>LocalVotación</div>"
		        +"<div class='columna'>Pabellon</div>"
		        +"<div class='columna'>Piso</div>"
		        +"<div class='columna'>Aula</div>"
		        +"<div class='columna'>Dirección</div>"
		    +"</div>"
				);   
		    
		out.println(
		    "<div id='contenidos'>"
		        +"<div class='columna1'>Columna 1</div>"
		        +"<div class='columna2'>Columna 2</div>"
		        +"<div class='columna2'>Columna 3</div>"
		    +"</div>"
		+"</div>"
		+"</body>"
		+"</html>"
				); 
		
	}
}

