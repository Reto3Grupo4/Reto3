package EjerUD5Array;

/**
 * Cargar una tabla de 20 componentes enteros y calcular la suma de los componentes de posición par y el producto de los componentes de posición impar. Los valores se generarán aleatoriamente entre 1 y 100. Crear los siguientes métodos:
 */

import java.util.Scanner;

public class EjerArray3 {
	private static Scanner teclado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elementos = new int [20];
		int valorMin = 1;
		int valorMax = 9;
		int tamano = 20;

		generarNumeros(elementos);
		System.out.println("---------------Tabla-------------------");
		elementos = cargarTabla(tamano, valorMin, valorMax);
		
		// MostrarFrecuencias()
		
		imprimirTabla(elementos);
	}

	private static void generarNumeros(int []elementos) {
		
		
		for (int i = 0; i < elementos.length; i++) {
			int numAleatorio = (int) Math.floor(Math.random() * (9 - 1) + 1);
			elementos[i] = numAleatorio;

		}
		
	}

	private static int[] cargarTabla(int Tamano, int valorMin, int valorMax) {
		// Declaración de variables
		int[] elementos;
		elementos = new int[Tamano];

		// Recorro cada elemento y le meto un valor numero al azar
		for (int i = 0; i < elementos.length; i++) {
			elementos[i] = (int) Math.floor(Math.random() * (valorMax - 1) + valorMin);
		}

		return (elementos);
	}
	
    private static void imprimirTabla(int[] elementos) {
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}
