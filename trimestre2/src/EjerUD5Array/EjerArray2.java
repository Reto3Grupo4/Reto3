package EjerUD5Array;
/**
 * Cargar una tabla de 20 componentes enteros y calcular la suma de los componentes de posición par y el producto de los componentes de posición impar. Los valores se generarán aleatoriamente entre 1 y 100. Crear los siguientes métodos:
 */

import java.util.Scanner;
public class EjerArray2 {
	private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teclado = new Scanner (System.in);
		
		int indice=0;
		int [] componentes = new int[19];
		generarNumero(componentes, indice);
		System.out.println("-------Tabla-------");
		cargarTabla (componentes);
		System.out.println("-----Suma-----");
		sumaPares(componentes);
		System.out.println("-------Producto------");
		prodImpares(componentes);
		System.out.println("-------Datos------");
		imprimirDatos(componentes);
	}
	/**
	 * 
	 * @return
	 */
	private static void generarNumero (int []comps , int index) {
	
		int numAleatorio = (int) Math.floor(Math.random()*(100-1)+1);
		System.out.println("-------------------------");
		System.out.println("El numero generado es " +numAleatorio);
		comps[index] = numAleatorio;
	
		
		
	}
	/**
	 * @return 
	 * 
	 */
	public static void cargarTabla (int [] elementos ) {

		
		for(int i = 0; i < elementos.length; i++) {
			generarNumero (elementos , i);
			
		}
		System.out.println("-------------------------");
		System.out.println("");
		System.out.println("La tabla se ha cargado correctamente");
	
	}
	
	/**
	 * 
	 * @param pares
	 */
	private static void sumaPares (int[] elementos) {
		
		int suma=0;
		
		for(int i=0; i < elementos.length; i+=2) {
			System.out.println(elementos[i]);
			
			suma += elementos[i];
			System.out.println("La suma total es: "+suma);
			System.out.println("---------------------");
				
		}
		
	}
	/**
	 * 
	 * @param elementos
	 */
	private static void prodImpares (int[] elementos) {
		long producto= 1;
		int cont = 1;
		for(int i=1; i < elementos.length; i+=2) {
			System.out.println(elementos[i]);
			
			producto = producto * elementos[i];
			System.out.println("El producto numero "+ cont +" es: " +producto);
			System.out.println("---------------------------------------");
			cont++;
		}
	
	}
	/**
	 * 
	 * @param elementos
	 * @param suma
	 * @param producto
	 */
	public static void imprimirDatos (int[]elementos) {
		for(int i = 0; i < elementos.length; i++) {
			System.out.println(elementos[i]);
			
		}
		sumaPares(elementos);
		System.out.println("");
		prodImpares(elementos);
		
	}
}



