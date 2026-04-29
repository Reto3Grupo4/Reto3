package EjerUD5Array;

/**
 * Programa que lee las edades de 20 alumnos (validado entre 18 y 35), las almacena en un array y calcula y escribe su media (para probar, se pueden generar aleatoriamente entre 18 y 35). Crear los siguientes métodos:

 */

import java.util.Scanner;
public class EjerArray1 {
	private static Scanner teclado;
	public static void main(String[] args) {
		
		teclado = new Scanner (System.in);
		int edad [] = new int [20];
		
		leerEdad (edad);
		
		
		imprimirEdad (edad);
		double media = calcularMedia (edad);
		System.out.println("La edad media de los 20 alumnos es: " +media);
		
		
		teclado.close();
	}
	/**
	 * Metodo encargado de recoger una edad mediante el teclado.
	 * Una vez se recoge, se posiciona en el indice 0 del array edad.
	 * @param edades
	 */
	private static void leerEdad (int edad[]) {
		int edadTeclado = 0;
		
		teclado = new Scanner(System.in);
		System.out.println("Introduce una edad (18-35): ");
		edadTeclado = teclado.nextInt();
		teclado.nextLine();
		
		do {
		if (edadTeclado > 35 || edadTeclado < 18) {
			System.out.println("Introduce una edad valida: ");
			teclado.nextInt();
		}else {
			System.out.println("Edad introducida correctamente");
		}
		
		}while(edadTeclado > 35 || edadTeclado < 18);
		
		edadTeclado = edad[0];
	}
	/**
	 * 
	 * @param edades
	 * @return
	 */
	private static double calcularMedia (int [] edades) {
		
		if (edades == null || edades.length != 20 ) {
			System.out.println("El array de edades debe tener 20 numeros ");
		}
		
		int sumaEdades = 0;
		
		for (int edad : edades) {
			sumaEdades += edad;
		}
		
		return (double) sumaEdades / 20;
	}
	/**
	 * 
	 * @param edades
	 */
	private static void imprimirEdad (int [] edades) {
		System.out.println("\n---Edades de los alumnos---");
		for (int i = 0; i < edades.length-1; i++) {
			int edad = (int) Math.floor(Math.random()*(35-18)+18);
			edades [i]= edad;
			System.out.println("Alumno " +(i+2) +":" +edades[i]);
		}
	}
	
	

}
