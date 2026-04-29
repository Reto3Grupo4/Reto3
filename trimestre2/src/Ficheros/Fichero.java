package Ficheros;

import java.io.*;

public class Fichero {

	public static void main(String[] args)  {
		
		
		File fichero = new File ("Fichero.cfg");
		
		try {
			
			if (fichero.exists()) {
				FileWriter fic = new FileWriter(fichero);
				String texto = "Esto es una prueba con FileWriter";
				char [] cad = texto.toCharArray();
				System.out.println("El nombre del fichero es: " +fichero.getName());
				System.out.println("El tamaño del fichero es: " + fichero.getTotalSpace());
				System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
				System.out.println("El fichero se puede leer? " +fichero.canRead());
				System.out.println("El fichero se puede escribir? " +fichero.canWrite());
				System.out.println("El fichero se puede ejecutar? " +fichero.canExecute());
			}
		}catch (IOException eof) {
			System.out.println("Fichero no encontrado");
		}
		

	}
		
}
