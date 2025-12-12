package EjerObjetos;

public class Persona2 {
	private static final char SEXO_DEFECTO = 'M';
	
	 String nombre;
	 int edad;
	 String DNI;
	 char sexo;
	 double peso;
	 double altura;
	
	public Persona2() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.sexo = SEXO_DEFECTO;
		this.DNI = "";
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona2(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.DNI = "";
		this.peso = 0;
		comprobarSexo(this.sexo);
		this.altura = 0;
	}
	
	public Persona2(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		generarDNI();
		this.sexo = sexo;
		comprobarSexo(this.sexo);
		this.peso = peso;
		this.altura = altura;
		
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

	public String getDNI() {
		return DNI;
	}


	public char isSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
		comprobarSexo(sexo);
		
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

	public static int calcularIMC(double peso, double altura) {
		int IMC = 0;
		
		IMC = (int) ((double) peso / (double)(altura *2));
		
		return IMC;
	}
	
	public static boolean esMayordeEdad (int edad) {
		boolean adulto = true;
		
		if(edad < 18) {
			adulto = false;
		}else if(edad >= 18) {
			adulto = true;
		}
		return adulto;
	}
	
	private void comprobarSexo (char sexo) {
		if (sexo != 'H' && sexo != 'M') {
			this.sexo = 'H';
		}
	}
	
	public String toString() {
		return "Nombre: " +nombre +
				"\nEdad: " +edad +
				"\nDNI: " +DNI +
				"\nSexo: " +sexo +
				"\nPeso: " +peso+
				"\nAltura" +altura;
	}
	private void generarDNI() {
		int numero = (int) (Math.random() * 100000000);
		char letra = calcularletraDNI (numero);
		this.DNI = String.format("%08d", numero) +letra;
	}

	private char calcularletraDNI(int numero) {
		String letras= "ABCDEFGHIJKLMNOPQRSTUVWYZ";
		
		return letras.charAt(numero % 23);
	}
	
	
}
