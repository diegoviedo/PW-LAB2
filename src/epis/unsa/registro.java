package epis.unsa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

import java.util.ArrayList;


//@SuppressWarnings("serial")
public class registro extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		ArrayList<Persona>poblacion1=(ArrayList<Persona>)getServletContext().getAttribute("poblacion1");
		
		String dninum=req.getParameter("dni123");
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
		Persona persona1=new Persona(dniNum,nombre,apellido,esMiembro,mesa,local,pabellon,piso,aula,direccion);
		poblacion1.add(persona1);
		getServletContext().setAttribute("poblacion1",poblacion1);
		
		out.println(
				"<!DOCTYPE html><html><head>"
				+ "<title>AGREGADO CORRECTAMENTE</title>"
				+ "</head>"
				+ "<body>"
				+ "<a href='index.html'>BUSCAR</a>"
				+ "<a href='registro.jsp'>REGISTRAR</a>"
				+ "<a href='index.html'>VER</a>"
				+ "<h1>AGREGADO CORRECTAMENTE>"
				+ "<p>"+dniNum+" "+nombre+" "+apellido+" "+esMiembro+" "+mesa+" "+local+" "+pabellon+" "+piso+" "+aula+" "+direccion
				+ "</p></body></html>");
		
	}}