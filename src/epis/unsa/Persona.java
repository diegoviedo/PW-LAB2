package epis.unsa;

public class Persona {
	//haciendo pruebas de commit en laboratorio web
	//Otra prueba
	private int dni;
	private String nombre;
	private String apellidos;
	private String mienbroMesa;
	private String mesaSufragio;
	private String localVotacion;
	private String pabellon;
	private String piso;
	private String aula;
	private String direccion;
	
	Persona(){
		
	};
	
	Persona(int dni,String nombre,String apellidos,String mienbroMesa,
			String mesaSufragio,String localVotacion, String pabellon, String piso, String aula,String direccion){ 
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mienbroMesa = mienbroMesa;
		this.mesaSufragio = mesaSufragio;
		this.localVotacion = localVotacion;
		this.pabellon = pabellon;
		this.piso = piso;
		this.aula = aula;
		this.direccion = direccion;
		
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getMienbroMesa() {
		return mienbroMesa;
	}

	public void setMienbroMesa(String mienbroMesa) {
		this.mienbroMesa = mienbroMesa;
	}

	public String getMesaSufragio() {
		return mesaSufragio;
	}

	public void setMesaSufragio(String mesaSufragio) {
		this.mesaSufragio = mesaSufragio;
	}

	public String getLocalVotacion() {
		return localVotacion;
	}

	public void setLocalVotacion(String localVotacion) {
		this.localVotacion = localVotacion;
	}

	public String getPabellon() {
		return pabellon;
	}

	public void setPabellon(String pabellon) {
		this.pabellon = pabellon;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	};
	
	
	
	

}
