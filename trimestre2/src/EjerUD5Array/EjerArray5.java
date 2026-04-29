package EjerUD5Array;

public class EjerArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valorMin = 'a';
		int valorMax = 'z';
		int numTiradas = 100;
		
		
		char [] sorteo = generarSorteo(numTiradas , valorMin , valorMax);
		System.out.println("-------------Sorteo------------");
		mostrarSorteo(sorteo);
		System.out.println();
		System.out.println("-------------Frecuencias------------");
		int [] frecuencias = contarFrecuencias(sorteo, valorMin , valorMax);
		mostrarFrecuencias(frecuencias, valorMin , valorMax);
		
	}

	private static char[] generarSorteo(int numTiradas , int valorMin , int valorMax) {
		
		char []arraySorteo  = new char [numTiradas];
		for (int i = 0; i < arraySorteo.length; i++) {
			arraySorteo [i] = (char) Math.floor(Math.random() * (valorMin - valorMax) + valorMax);
			//System.out.println(arraySorteo[i]);
		}
			
		return (arraySorteo);
	}
	
	public static void mostrarSorteo(char [] arraySorteo) {
		
		for (int i=0; i <arraySorteo.length; i++) {
			System.out.printf("%c " , (char) arraySorteo[i]);
			if((i+1) %15 == 0)
				System.out.println();
			}
		}

	private static int[] contarFrecuencias(char [] arraySorteo , int valorMin, int valorMax){
		int [] frecuencias = new int [valorMax - valorMin +1];
		int indiceFrecuencias = 0;
		
		for (int i=0 ; i < arraySorteo.length; i++) {
			indiceFrecuencias = arraySorteo [i] - valorMin;
			frecuencias [indiceFrecuencias]++;
		}
	return frecuencias;
	}
	
	private static void mostrarFrecuencias(int [] arrayFrecuencias, int valorMin, int valorMax) {
		for (int i = 0; i < arrayFrecuencias.length; i++) {
			System.out.printf(" %c se muestra %d veces.\n", (char) (i + valorMin), arrayFrecuencias[i]);
		}
	}
}
