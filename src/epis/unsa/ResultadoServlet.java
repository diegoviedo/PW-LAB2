package epis.unsa;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

import java.util.ArrayList;


//@SuppressWarnings("serial")
public class ResultadoServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
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
		boolean entro=false;
		ArrayList<Persona>poblacion=(ArrayList<Persona>)getServletContext().getAttribute("poblacion");
		
		String dninum=req.getParameter("dni123");
		if(dninum==""){
			dninum="00000000";
		}
		int dniNum=Integer.parseInt(dninum);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		for(int i=0;i<poblacion.size();i++){
			
			if(poblacion.get(i).getDni()==dniNum){
				//CODIGO
				out.println(
						"<!DOCTYPE html><html><head>"
						+ "<meta charset='UTF-8'>"
						+ "<title>RESULTADO ONPE</title>"
				+"<link rel='stylesheet' type='text/css' href='../css/onpe.css'>"
				+ "</head>"
				+ "<body>"
				
				+ "	<div class='cuadritoizq3'><ul>"
				+ "<li><p class='gris'><a href='index.html'><b>BUSCAR </b></a></p>"
				+ "<li><p class='gris'><a href='registro.jsp'><b>REGISTRO</b></a> </p>"
				+ "<li><p class='gris'><a href='/ver'><b>VER</b> </a> </p></ul></div>"
				

				+ "	<div class='centro'>"
				+ "	<div class='titulo'>"
				+ "			<div class='logo'>"
				+ "				<img src='/logo-onpe.png' alt='' class='logoOnpe'>"
				+ "	</div><h2 class='onpe'>Elecciones Generales y Parlamento Andino 2016</h2></div>"
				+ "	<div class='bloque1'><div class='cuadro'>"
				+ "	<div class='izq'><p class='gris'><b>BIENVENIDO(A)</b></p>"
				+ "	</div>"
				+ "<div class='der'><p class='gris'><b>DNI:"+poblacion.get(i).getDni()+"</b></p>"
				+ "</div></div>"
				+ "<div class='cuadro'><p class='gris'>Nombres:</p>"
				+ "	<p class='azul'><b>"+poblacion.get(i).getNombre()+"</b></p></div>"
				+ "<div class='cuadro'>"
				+ "<p class='gris'>Apellidos:</p>"
				
				+ "	<p class='azul'><b>"+poblacion.get(i).getApellidos()+"</b></p></div>"
				+ "	<div class='cuadro1'><p class='rojo'><b>"+poblacion.get(i).getMienbroMesa()+"</b><p></div>"
				+ "</div>"
				+ "	<div class='bloque'><div class='cuadro'><p class='naranja'><b>AREQUIPA/AREQUIPA/AREQUIPA</b></p>"
				+ "</div>"
				+ "<div class='cuadro'>"
				+ "	<p class='gris'><b>Mesa de Sufragio</b></p><p class='azul'><b>"+poblacion.get(i).getMesaSufragio()+"</b></p></div>"
				+ "<div class='cuadro'><p class='gris'>Local de Votacion:</p><p class='azul'><b>"+poblacion.get(i).getLocalVotacion()+"</b></p></div>"
				+ "<div class='cuadro'>	<div class='cuadritoizq'><p class='gris'>Pabellon:</p><p class='azul'><b>"+poblacion.get(i).getPabellon()+"</b></p>"
				+ "</div><div class='cuadritoizq'><p class='gris'>Piso:</p>	<p class='azul'><b>"+poblacion.get(i).getPiso()+"</b></p></div>"
				+ "	<div class='cuadritoizq3'><p class='gris'>Aula:</p>	<p class='azul'><b>"+poblacion.get(i).getAula()+"</b></p></div>"
				+ "	</div>"
				+ "<div class='cuadro'>	<br><p class='gris'><a href='#'>Ver croquis del local de votacion</a></p></div>"
				+ "	<div class='cuadro'><div class='dirizq'><p class='azul'><b>Direccion:</b></p></div>"
				+ "	<div class='dirder'><p class='azul2'>Referencia:</p></div>	</div>"
				+ "	<div class='cuadro'>"
				+ "	<p class='azul'><b>"+poblacion.get(i).getDireccion()+"</b></p></div></div></div>"
				+ "	<div class='cuadro'>"
				+ "	<footer>CREADO POR :Diego Oviedo Yauri <br>CURSO : PW2<br>Laboratorio-Grupo: 03-E<br>25 de Abril del 2016 09:00 </footer>"
				+"<p><a href='http://jigsaw.w3.org/css-validator/check/referer'><img style='border:0;width:88px;height:31px'"
				+" src='http://jigsaw.w3.org/css-validator/images/vcss' alt='�CSS V�lido!' /></a></p>"
		            
				+ "	<a href='index.html'>REGRESAR</a></div></body></html>" );
				
				
				entro=true;
				break;
			}
		}
		if(entro==false){
			out.print("<!DOCTYPE html><html><head>"
					+ "<meta charset='UTF-8'>"
					+ "<title>DNI NO ENCONTRADO</title>"
			+"<link rel='stylesheet' type='text/css' href='../css/onpe.css'>"
			+ "</head>"
			+ "<body>"
			
			+ "	<div class='cuadritoizq3'><ul>"
			+ "<li><p class='gris'><a href='index.html'><b>BUSCAR </b></a></p>"
			+ "<li><p class='gris'><a href='registro.jsp'><b>REGISTRO</b></a> </p>"
			+ "<li><p class='gris'><a href='/ver'><b>VER</b> </a> </p></ul></div>"
			

			+ "	<div class='centro'>"
			+ "	<div class='titulo'>"
			+ "<h2 class='onpe'>NO ENCONTRADO</h2>"
			+ "	<div class='oracion'>"
			+ "<h2 class='gris'>DNI NO ENCONTRADO EN LA BASE DE DATOS</h2>"
			+ "</div>"
			+ "</div>"
			
			+ "<footer>CREADO POR :Diego Oviedo Yauri <br>CURSO : PW2<br>Laboratorio-Grupo: 03-E"
			+ "<br>25 de Abril del 2016 09:00 </footer>"

					+ "</body></html>");
		}
		
	}	
		
	
}
