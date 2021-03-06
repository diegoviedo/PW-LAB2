package epis.unsa;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

import java.util.ArrayList;


//@SuppressWarnings("serial")
public class RegistroServlet extends HttpServlet {
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
		ArrayList<Persona>poblacion=(ArrayList<Persona>)getServletContext().getAttribute("poblacion");
		
		
		
		String dninum=req.getParameter("dni123");
		if(dninum=="")
			dninum="00000000";
		int dniNum=Integer.parseInt(dninum);
		String nombre=req.getParameter("nombre123");
		String apellido=req.getParameter("apellido123");
		String mienbro=req.getParameter("mienbro123");
		String mesa=req.getParameter("mesa123");
		String local=req.getParameter("local123");
		String pabellon=req.getParameter("pabellon123");
		String piso=req.getParameter("piso123");
		String aula=req.getParameter("aula123");
		String direccion=req.getParameter("direccion123");
		
		
		String esMiembro;
		if(mienbro.equalsIgnoreCase("NO")){
			esMiembro="No es Miembro de Mesa";
		}else{
			esMiembro="Si es Miembro de Mesa";
		}
		
		
		if(dniNum==00000000){
			
			nombre="--";
			apellido="--";
			mienbro="--";
			mesa="--";
			esMiembro="--";
			
			local="--";
			pabellon="--";
			piso="--";
			aula="--";
			direccion="--";
		}
		
		
		
		Persona persona=new Persona(dniNum,nombre,apellido,esMiembro,mesa,local,pabellon,piso,aula,direccion);
		poblacion.add(persona);
		
		getServletContext().setAttribute("poblacion",poblacion);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println(
				"<!DOCTYPE html><html><head>"
				+"<meta charset='UTF-8'>"
				+ "<title>AGREGADO CORRECTAMENTE</title>"
				+"<link rel='stylesheet' type='text/css' href='../css/onpe.css'>"		
				+ "</head>"
				+ "<body>"

				+ "	<div class='cuadritoizq3'><ul>"
				+ "<li><p class='gris'><a href='index.html'><b>BUSCAR </b></a></p>"
				+ "<li><p class='gris'><a href='registro.jsp'><b>REGISTRO</b></a> </p>"
				+ "<li><p class='gris'><a href='/ver'><b>VER</b> </a> </p></ul></div>"
				

				+ "	<div class='centro'>"
				+ "	<div class='titulo'><h2 class='onpe'>AGREGADO CORRECTAMENTE</h2></div>"
				+ "	<div class'oracion'><p class='gris'>"+dniNum+" "+nombre+" "+apellido+" "+"</p></div>"
				+ "	<div class'oracion'><p class='gris'>"+esMiembro+"</p></div>"
				+ "	<div class'oracion'><p class='gris'>MESA :"+mesa+"</p></div>"
				+ "	<div class'oracion'><p class='gris'>"+local+" "+pabellon+" "+piso+" "+aula+" "+direccion+"</p></div>"
			
				+ "	<div class'oracion'><p class='gris'> <a href='/ver'>VER CUADRO ACTUAL </a></p></div>"
				+ "</div>"
				
				+ "	<footer>CREADO POR :Diego Oviedo Yauri <br>CURSO : PW2<br>Laboratorio-Grupo: 03-E"
				+ "<br>25 de Abril del 2016 09:00 </footer>"
				
				+ "</body></html>");
		
	}}