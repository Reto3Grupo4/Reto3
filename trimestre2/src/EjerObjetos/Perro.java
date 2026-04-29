package EjerObjetos;

public class Perro {

	private String nombre;
	private double peso;
	private double altura;
	private String genero;
	private String raza;
	private int    edad=0;

	private boolean bVacunado = false;
	
	public Perro(String nombre, String genero, String raza , int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.raza = raza;
		this.edad = edad;
	}
	
	public void jugar () {
		
	}
	
	public void ladrar() {
		System.out.println("Guau Guau, me llamo " +nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public boolean isbVacunado() {
		return bVacunado;
	}
	public void setbVacunado(boolean bVacunado) {
		this.bVacunado = bVacunado;
	}
}
