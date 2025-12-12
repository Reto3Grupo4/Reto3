package EjerObjetos;

import java.util.Scanner;

public class PersonaEjer4 {
	static private Scanner teclado;
	public static void main(String[] args) {
		teclado = new Scanner (System.in);
		
		
		 System.out.print("Introduce el nombre: ");
	        String nombre = teclado.nextLine();

	        System.out.print("Introduce la edad: ");
	        int edad = teclado.nextInt();

	        System.out.print("Introduce el sexo (H/M): ");
	        char sexo = teclado.next().toUpperCase().charAt(0);

	        System.out.print("Introduce el peso en kg: ");
	        double peso = teclado.nextDouble();

	        System.out.print("Introduce la altura en metros: ");
	        double altura = teclado.nextDouble();

	        System.out.println("\n--- Creando objetos ---\n");

	        // --- 2. Crear 3 objetos ---

	        // 2.1 Primer objeto: con todos los datos (constructor completo)
	        Persona2 persona1 = new Persona2(nombre, edad, "", sexo, peso, altura);

	        // 2.2 Segundo objeto: con nombre, edad, sexo (constructor con 3 parámetros)
	        Persona2 persona2 = new Persona2(nombre, edad, sexo);
	        persona2.setPeso(peso);
	        persona2.setAltura(altura);

	        // 2.3 Tercer objeto: constructor por defecto, luego set de todos los atributos
	        Persona2 persona3 = new Persona2();
	        persona3.setNombre(nombre);
	        persona3.setEdad(edad);
	        persona3.setSexo(sexo);
	        persona3.setPeso(peso);
	        persona3.setAltura(altura);

	        // --- 3. Mostrar resultados para cada persona ---
	        System.out.println("\n--- Resultados ---\n");
	        mostrarInformacion(persona1);
	        mostrarInformacion(persona2);
	        mostrarInformacion(persona3);

	        teclado.close();
	    }

	   	/**
	   	 * 
	   	 * @param p
	   	 */
	    public static void mostrarInformacion(Persona2 p) {
	        
	        double imcValor = p.getAltura() > 0 ? p.getPeso() / (p.getAltura() * p.getAltura()) : 0;

	        String mensajeIMC;
	        if (imcValor < 20) {
	            mensajeIMC = "Está por debajo de su peso ideal.";
	        } else if (imcValor <= 25) {
	            mensajeIMC = "Está en su peso ideal.";
	        } else {
	            mensajeIMC = "Tiene sobrepeso.";
	        }

	        // Mayor de edad
	        String mensajeEdad = Persona2.esMayordeEdad(p.getEdad()) ? "Es mayor de edad." : "No es mayor de edad.";

	        // Mostrar información completa
	        System.out.println(p);
	        System.out.printf("IMC: %.2f - %s%n", imcValor, mensajeIMC);
	        System.out.println(mensajeEdad);
	        System.out.println("---------------------------");
	    }
	}
