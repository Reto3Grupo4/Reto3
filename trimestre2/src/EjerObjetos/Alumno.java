package EjerObjetos;

public class Alumno {

	private String nombre;
	private String sexo;
	private int edad;
	private double altura;
	private double peso;
	
	public Alumno(String nombre, char sexo2, int edad, double altura, double peso) {
		this.nombre = nombre;
		setSexo(sexo2);
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		 this.sexo = (sexo == 'H' || sexo == 'h') ? "Hombre" : "Mujer";
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad > 0) this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura > 0 && altura <= 2.5) this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso > 0 && peso <= 150) this.peso = peso; 
	}

	@Override
    public String toString() {
        return "Datos del alumno:\n" +
                "Nombre: " + nombre + "\n" +
                "Sexo: " + sexo + "\n" +
                "Edad: " + edad + " años\n" +
                "Altura: " + altura + " m\n" +
                "Peso: " + peso + " Kg.";
    }

}
