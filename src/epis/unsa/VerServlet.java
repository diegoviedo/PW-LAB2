package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		//preguntando si la variable no existe para crearla.
		if(getServletContext().getAttribute("poblacion")==null){
			//Creando arreglo para la clase persona
			ArrayList<Persona>poblacion1=new ArrayList<Persona>();

			//añadiendo datos al arreglo persona.
			Persona persona1=new Persona(72126234,"DIEGO","OVIEDO YAURI","No es Miembro de Mesa","301285","IE 104 LA RECOLETA","400","2","10","PASAJE LA RECOLETA");
			//persona1={72126234,"DIEGO","OVIEDO YAURI",301285,"IE 104 LOS PANMCHITOS",400,2,10,"cALLE OLVIDO"};
			Persona persona2=new Persona(73868584,"AUDREY","TACCA BARRANTES","Si es Miembro de Mesa","355623","IE LOS PANDAS","200","3","1","CALLE PERAL 507 ");
			Persona persona3=new Persona(45655339,"RICHARD","ALVAREZ MAMANI","No es Miembro de Mesa","234533","UNIVERSIDAD WOW","100","2","3","CALLE LEGION 107");
			
			poblacion1.add(persona1);
			poblacion1.add(persona2);
			poblacion1.add(persona3);
			//==>PARTE IMPORTANTE Guardando arreglo poblacion en el conteiner con nombre población
			//getServletContext().setAttribute("NombreVariableParaGuardarConteiner", VaribaleAGuardar);
			getServletContext().setAttribute("poblacion", poblacion1);
		}


		//ArrayList<Persona>poblacion=(ArrayList<Persona>)getServletContext().getAttribute("poblacion");
		//falta poner css
	

		//ArrayList<Persona>poblacion=(ArrayList<Persona>)getServletContext().getAttribute("poblacion");
		//falta poner css
// PW2-lab3
		

		ArrayList<Persona>poblacion=(ArrayList<Persona>)getServletContext().getAttribute("poblacion");	
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println(
		"<!DOCTYPE html>"
		+"<head>"
			+"<meta charset='UTF-8'>"
			+"<title>VerLista</title>"
			+"<link rel='stylesheet' type='text/css' href='../css/onpe.css'>"
		+"</head>"
		+"<body>"
			+"<a href='index.html'>BUSCAR </a>"
			+"<a href='registro.jsp'>REGISTRAR </a>"
			+"<a href='/ver'>VER </a>"
			+"<div id='contenedor'>"
		    +"<div id='contenidos'>"
		    	+"<div class='columna'>DNI</div>"
		        +"<div class='columna'>Nombres</div>"
		        +"<div class='columna'>Apellidos</div>"
		        +"<div class='columna'>MienbroDeMesa</div>"
		        +"<div class='columna'>MesaSufragio</div>"
		        +"<div class='columna'>LocalVotaci&oacute;n</div>"
		        +"<div class='columna'>Pabellon</div>"
		        +"<div class='columna'>Piso</div>"
		        +"<div class='columna'>Aula</div>"
		        +"<div class='columna'>Direcci&oacute;n</div>"
		    +"</div>"
				);   
		for(int i=0;i<poblacion.size();i++){
			out.println(
				    "<div id='contenidos'>"
			    		+"<div class='columna'>"+poblacion.get(i).getDni()+"</div>"
				        +"<div class='columna'>"+poblacion.get(i).getNombre()+"</div>"
				        +"<div class='columna'>"+poblacion.get(i).getApellidos()+"</div>"
				        +"<div class='columna'>"+poblacion.get(i).getMienbroMesa()+"</div>"
				        +"<div class='columna'>"+poblacion.get(i).getMesaSufragio()+"</div>"
				        +"<div class='columna'>"+poblacion.get(i).getLocalVotacion()+"</div>"
				        +"<div class='columna'>"+poblacion.get(i).getPabellon()+"</div>"
				        +"<div class='columna'>"+poblacion.get(i).getPiso()+"</div>"
				        +"<div class='columna'>"+poblacion.get(i).getAula()+"</div>"
				        +"<div class='columna'>"+poblacion.get(i).getDireccion()+"</div>"
				    +"</div>"
					); 
		}
					
		out.println(
				"</div>"
				+"</body>"
				+"</html>"
				); 
		
	}
}

