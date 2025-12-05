package EjerUD5Array;

import java.util.Scanner;

/**
 * Cargar dos tablas, una con los nombres y otra con las calificaciones de los N alumnos de una clase de Programación. Rellenar arrays con el nombre del alumno y su nota validando entre 0 y 10
 */


public class EjerArray4 {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont=0;
		System.out.println("Cuantos alumnos son? ");
		cont = teclado.nextInt();
		String [] nombres = new String [cont];
		double [] notas = new double [cont];
		cargarArrayNombres(nombres , cont);
		cargarArrayNotas(notas , cont);
		mostrarTodosDatos(notas , nombres);
		double [] resultado = calculoDatos(notas , nombres , cont);
		MostrarEstadisticas(nombres, resultado);
	}


	private static String [] cargarArrayNombres(String [] nombres , int cont){
		teclado.nextLine();
		
		for (int i = 0; i <nombres.length; i++) {
			System.out.println("Introduce el Nombre y apellido del alumno numero " +(i + 1) + ":");
			nombres [i] = teclado.nextLine();
		}
			return nombres;
	}
	private static double[] cargarArrayNotas(double [] notas, int cont) {
		// TODO Auto-generated method stub
		for (int i = 0; i < notas.length; i++) {
		notas [i] =(int) Math.floor(Math.random() * (10 - 0) + 0);
		//System.out.println(notas[i]);
		}
		return notas;
	}
	private static void mostrarTodosDatos(double [] notas , String [] nombres) {
		// TODO Auto-generated method stub
		System.out.println("-----------------Nombres y Apellidos-----------------");
		for (int j = 0; j < nombres.length; j++) {
			System.out.print("|" +nombres[j]);
		}
		
		System.out.println("|");
		System.out.println();
		System.out.println("-----------------Notas-----------------");
		for (int i = 0; i < notas.length; i++) {
		System.out.print("|" +notas[i]);
		}
		System.out.print("|");
		System.out.println();
	}
	private static double [] calculoDatos(double [] notas , String [] nombres , int cont) {
		double media =0;
		int suma =0;
		double max = notas[0];
		double min = notas[0];
		int indiceMax =0;
		int indiceMin = 0;
		for (int i = 0; i< notas.length; i++) {
			suma += notas[i];
			media = suma / cont;	
		}
		
		System.out.println("La media de la clase es: " +media);
		
		for (int j=1; j< notas.length; j++) {
			if(notas[j] > max) {
				max = notas[j];
				indiceMax = j;
			}
		}
		
		for (int k=1; k< notas.length; k++) {
			if(notas[k] < min) {
				max = notas[k];
				indiceMin = k;
			}
		}
		
		
		double [] resultados = {media, max , indiceMax, min, indiceMin};
		return resultados;
		 
	}
	
	private static double[] MostrarEstadisticas(String [] nombres , double [] resultados) {
		int indiceMax = (int)resultados[2];
		int indiceMin = (int) resultados[4];
		System.out.println("La media es un " +resultados[0]);
		System.out.println("La nota mas alta ha sido un " + resultados[1] + " de parte de " +nombres[indiceMax]);
		System.out.println();
		System.out.println("La nota mas baja ha sido un " + resultados[3] + " de parte de " +nombres[indiceMin]);
		
		
		return resultados;
	}
}
