package EjerObjetos;

public class Persona {

	
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private String numeroIdentidad;
	
	
	public Persona (String nombre, String apellidos, int edad, boolean casado, String numeroIdentidad) {
		super ();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.casado = casado;
		this.numeroIdentidad = numeroIdentidad;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public String getNumeroIdentidad() {
		return numeroIdentidad;
	}
	public void setNumeroIdentidad(String numeroIdentidad) {
		this.numeroIdentidad = numeroIdentidad;
	}
	
	
	
}
