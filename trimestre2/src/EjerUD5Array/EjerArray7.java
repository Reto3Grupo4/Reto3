package EjerUD5Array;


import java.util.Random;
public class EjerArray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] elementos;
		int valorMin = 0;
		int valorMax = 3;
		
		elementos = cargarTabla(20 , valorMin, valorMax);
		System.out.println("\n---------Tabla---------");
		mostrarArray(elementos);
		System.out.println("\n---------Mover ceros---------");
		moverCerosFinal(elementos);
		mostrarArray(elementos);
	}




		public static int[] cargarTabla (int numElementos , int valorMin , int valorMax) {
		
		Random aleatorio = new Random();
		int [] miTabla = new int[numElementos];
		
		for(int i = 0; i < miTabla.length; i++) {
			miTabla[i] = aleatorio.nextInt(valorMax - valorMin +1) +valorMin;
				 
			
 		}
		
		return miTabla;
}

	private static void moverCerosFinal(int[] tabla) {
		int temporal = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] != 0) {
				tabla [temporal] = tabla[i];
				temporal++;
			}
		}
		
		while (temporal < tabla.length) {
			tabla[temporal] = 0;
			temporal++;
		}
	}
	
	private static void mostrarArray(int [] tabla) {
		for (int i = 0; i < tabla.length ; i++) {
			System.out.printf("  %2d  ",tabla[i]);
		}
		System.out.println();
	}
}	
