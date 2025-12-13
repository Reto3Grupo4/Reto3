package EjerObjetos;

import java.util.Scanner;

public class Conversion {
	static private Scanner teclado;
	public static void main(String[] args) {

		teclado = new Scanner (System.in);
		
		Temperatura temp = new Temperatura();
		
		System.out.println("--------Opciones--------");
		System.out.println("Selecciona una opcion: ");
		System.out.println("1. Celsius a fahrenheit");
		System.out.println("2. Fahrenheit a celsius");
		System.out.println("Opcion: ");
		int opcion = teclado.nextInt();
		
		
		
		if (opcion == 1) {
			System.out.println("Ingresa grados Celsius: ");
			double celsius = teclado.nextDouble();
			System.out.println("Resultado: " +temp.CelciusToFahrenheit(celsius) + " ºF");
		}else if (opcion == 2) {
			System.out.println("Ingresa grados Fahrenheit: ");
			double fahrenheit = teclado.nextDouble();
			System.out.println("Resultado: " +temp.FahrenheitToCelsius(fahrenheit) + " ºC");
		}else if (opcion == 3) {
			System.out.println("Programa finalizado");
		}else {
			System.out.println("Opcion no valida");
		}
	
		
		teclado.close();
	}
	
}
