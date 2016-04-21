package epis.unsa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;



//@SuppressWarnings("serial")
public class PW2_V2_ONPE_Get_PostServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		Persona persona1=new Persona(72126234,"DIEGO","OVIEDO YAURI","No es Miembro de Mesa","301285","IE 104 LA RECOLETA","400","2","10","PASAJE LA RECOLETA");
		//persona1={72126234,"DIEGO","OVIEDO YAURI",301285,"IE 104 LOS PANMCHITOS",400,2,10,"cALLE OLVIDO"};
		Persona persona2=new Persona(73868584,"AUDREY","TACCA BARRANTES","Si es Miembro de Mesa","355623","IE LOS PANDAS","200","3","1","CALLE PERAL 507 ");
		Persona persona3=new Persona(45655339,"RICHARD","ALVAREZ MAMANI","No es Miembro de Mesa","234533","UNIVERSIDAD WOW","100","2","3","CALLE LEGION 107");
		
		Persona []poblacion={persona1,persona2,persona3};
		
	
		String dninum=req.getParameter("dni123");
		int dniNum=Integer.parseInt(dninum);
		 boolean entro=false;
		for(int i=0;i<poblacion.length;i++){
			
			if(poblacion[i].getDni()==dniNum){
				//CODIGO
				out.println(
						"<!DOCTYPE html><html><head>"
						+ "<title>"
						+ "PRACTICA 1  LAB 2</title>"+
				"<style> "
				+ "	*{font-family: sans-serif;}"
				+ ".centro {margin:5%  0% 0% 13%;"
				+ "			height: 500px;"
				+ "			width: 1000px;"
				+ "			background-color: white;"
				+ "	}"
				+ ".titulo{"
				+ "			margin:10px 20px 10px 20px;"
				+ "			height: 60px;"
				+ "			width: 1000px;"
				+ "			background-color: #25264C; text-align:center;}"
				+ ".logo{"
				+ "			width: 150px;"
				+ "			height: 60px;"
				+ "			float: right;margin:0px 10px 15px 0px;}"
				+ ".bloque1 {"
				+ "			float: left;"
				+ "			margin: 10px 10px 10px 10px;"
				+ "			height: 400px;"
				+ "				width: 450px;"
				+ "			border-right: 3px solid silver;	}"
				+ ".bloque {"
				+ "				float: left;"
				+ "				margin: 10px 10px 10px 10px;"
				+ "				height: 400px;"
				+ "				width: 450px;}"
				+ ".cuadro {"
				+ "				text-align: center;"
				+ "				margin: 10px 10px 10px 10px;"
				+ "				height: 50px;"
				+ "				width: 400px;"
				+ "				color: #25264C;}"
				+ ".gris{"
				+ "				margin:0px 0px 0px;"
				+ "				color: #5E5C75;}"
				+ ".azul{	"
				+ "				color:#25264C;"
				+ "				margin: 0px 0px 0px 0px;}"
				+ ".azul2{"
				+ "				color:#7F7FF7;"
				+ "				margin: 0px 0px 0px 0px;"
				+ "	}"
				+ ".rojo{"
				+ "				color: #E61529;"
				+ "				font-size: 23px;"
				+ "}"
				+ ".naranja{"
				+ "				color: #EBA620;}"
				+ ".onpe{"
				+ "				color:white;"
				+ "				padding-top: 20px;}"
				+ ".izq{"
				+ "				float: left;}"
				+ ".der{"
				+ "				float: right;}"
				+ ".cuadro1 {"
				+ "				text-align: center;"
				+ "				margin: 90px 10px 20px 10px;"
				+ "				height: 50px;"
				+ "				width: 400px;	"
				+ "				color: #25264C;}"
				+ ".cuadritoizq{"
				+ "				float: left;"
				+ "				margin: 10px 0px 10px 20px;"
				+ "				height: 50px;"
				+ "				width: 100px;"
				+ "				border-right: 2px solid silver;	}"
				+ ".cuadritoizq3{"
				+ "				float: left;"
				+ "				margin: 10px 0px 10px 20px;"
				+ "				height: 50px;"
				+ "				width: 100px;}"
				+ ".dirizq{"
				+ "				float: left;"
				+ "				margin: 10px 0px 10px 50px;"
				+ "				height: 20px;"
				+ "				width: 150px;"
				+ "				background-color: #E8E3E3;	"
				+ "	}"
				+ ".dirder{"
				+ "				float: left;"
				+ "				margin: 10px 0px 10px 0px;"
				+ "				height: 20px;"
				+ "				width: 150px;"
				+ "				background-color: #F1E6E6;}"
				+"footer{"
				+ "				margin-left:20px;"
				+ "				font-size:17px;"
				+ "				color:blue;"
				+ "				font-style:italic;"
				+ "}"
				+ "	</style></head>"
				+ "<body>	"
				+ "	<div class='centro'>"
				+ "	<div class='titulo'>"
				+ "			<div class='logo'>"
				+ "				<img src='/logo-onpe.png' width=90% height=100% alt='onpe' class='logoOnpe'>"
				+ "	</div><h2 class='onpe'>Elecciones Generales y Parlamento Andino 2016</h2></div>"
				+ "	<div class='bloque1'><div class='cuadro'>"
				+ "	<div class='izq'><p class='gris'><b>BIENVENIDO(A)</b></p>"
				+ "	</div>"
				+ "<div class='der'><p class='gris'><b>DNI:"+poblacion[i].getDni()+"</b></p>"
				+ "</div></div>"
				+ "<div class='cuadro'><p class='gris'>Nombres:</p>"
				+ "	<p class='azul'><b>"+poblacion[i].getNombre()+"</b></p></div>"
				+ "<div class='cuadro'>"
				+ "<p class='gris'>Apellidos:</p>"
				
				+ "	<p class='azul'><b>"+poblacion[i].getApellidos()+"</b></p></div>"
				+ "	<div class='cuadro1'><p class='rojo'><b>"+poblacion[i].getMienbroMesa()+"</b><p></div>"
				+ "</div>"
				+ "	<div class='bloque'><div class='cuadro'><p class='naranja'><b>AREQUIPA/AREQUIPA/AREQUIPA</b></p>"
				+ "</div>"
				+ "<div class='cuadro'>"
				+ "	<p class='gris'><b>Mesa de Sufragio</b></p><p class='azul'><b>"+poblacion[i].getMesaSufragio()+"</b></p></div>"
				+ "<div class='cuadro'><p class='gris'>Local de Votacion:</p><p class='azul'><b>"+poblacion[i].getLocalVotacion()+"</b></p></div>"
				+ "<div class='cuadro'>	<div class='cuadritoizq'><p class='gris'>Pabellon:</p><p class='azul'><b>"+poblacion[i].getPabellon()+"</b></p>"
				+ "</div><div class='cuadritoizq'><p class='gris'>Piso:</p>	<p class='azul'><b>"+poblacion[i].getPiso()+"</b></p></div>"
				+ "	<div class='cuadritoizq3'><p class='gris'>Aula:</p>	<p class='azul'><b>"+poblacion[i].getAula()+"</b></p></div>"
				+ "	</div>"
				+ "<div class='cuadro'>	<br><p class='gris'><a href='#'>Ver croquis del local de votacion</a></p></br></div>"
				+ "	<div class='cuadro'><div class='dirizq'><p class='azul'><b>Direccion:</b></p></div>"
				+ "	<div class='dirder'><p class='azul2'>Referencia:</p></div>	</div>"
				+ "	<div class='cuadro'>"
				+ "	<p class='azul'><b>"+poblacion[i].getDireccion()+"</b></p></div></div></div>"
				+ "	"
				+ "	<footer>CREADO POR :Diego Oviedo Yauri <br>CURSO : PW2</br><br>Laboratorio-Grupo: 02-E</br><br>17 de Abril del 2016 09:00 </br></footer>"
				+"<p><a href='http://jigsaw.w3.org/css-validator/check/referer'><img style='border:0;width:88px;height:31px'"
				+" src='http://jigsaw.w3.org/css-validator/images/vcss' alt='�CSS V�lido!' /></a></p>"
		            
				+ "	</body></html>" );
				
				
				entro=true;
				break;
			}
			}
		if(entro==false){
			out.print("<!DOCTYPE html><html><head>"
					+ "<title>DNI NO ENCONTRADO</title>"
					+ "	</head>"
					+ "<body><p>NO SE ENCONTRO EL DNI</p></body></html>");
		}
		
	}	
		
	
}
