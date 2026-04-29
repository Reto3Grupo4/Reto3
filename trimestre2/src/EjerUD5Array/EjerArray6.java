package EjerUD5Array;

import java.util.Arrays;
import java.util.Random;

public class EjerArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tabla;
		int valorMin = 0;
		int valorMax = 20;
		
		tabla = cargarTabla(20, valorMin, valorMax);
		System.out.println("\n---------Tabla---------");
		mostrarArray(tabla);
		
		invertirArray(tabla);
		
		System.out.println("\n---------Tabla Invertida---------");
		mostrarArray(tabla);
	}



	/**
	 * Crea un array de integers, de longitud numElementos, y con valores entre el máximo y el minimo pasados como parámetros
	 * @param numElementos
	 * @param valorMin
	 * @param valorMax
	 * @return array de integers dentro de los valores min y maximo
	 */
	private static int[] cargarTabla (int numElementos , int valorMin , int valorMax) {
		
		int [] miTabla = new int[numElementos];
		int temporal = 0;
		
		for(int i = 0; i < miTabla.length; i++) {
			do {
				temporal = ((int) Math.round(Math.random()*100) ) + valorMin;
				
			} while(temporal > valorMax);
				 
			miTabla[i] = temporal;
 		}
		
		return miTabla;
}
	
	private static void invertirArray(int [] tabla) {
		int temporal;
		int ultimo = tabla.length - 1;
		
		for (int i = 0; i <=(int)(tabla.length /2)-1; i++) {
			temporal = tabla [i];
			tabla [i] =tabla[ultimo -i];
			tabla[ultimo -i] = temporal;
		}
		
	}

	private static void mostrarArray(int [] tabla) {
		for (int i = 0; i < tabla.length ; i++) {
			System.out.printf("  %2d  ",tabla[i]);
		}
		System.out.println();
	}
}