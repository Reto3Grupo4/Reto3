package EjerUD5Array;

/**
 * Cargar una tabla de 20 componentes enteros y calcular la suma de los componentes de posición par y el producto de los componentes de posición impar. Los valores se generarán aleatoriamente entre 1 y 100. Crear los siguientes métodos:
 */



public class EjerArray3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elementos = new int [20];
		int valorMin = 1;
		int valorMax = 9;
		int tamano = 20;

		generarNumeros(elementos);
		System.out.println("---------------Tabla-------------------");
		elementos = cargarTabla(tamano, valorMin, valorMax);
		
		
		mostrarArray(elementos);
		System.out.println("---------------Frecuencias-------------------");
		mostrarFrecuencias(elementos);
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
	
    private static void mostrarArray(int[] elementos) {
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
    
    private static void mostrarFrecuencias(int[] elementos) {
    	int num1=0;
    	int num2=0;
    	int num3=0;
    	int num4=0;
    	int num5=0;
    	int num6=0;
    	int num7=0;
    	int num8=0;
    	int num9=0;

    	for (int i = 0; i < elementos.length; i++ ) {
    		if(elementos[i] == 1) {
    			num1++;
    		}else if(elementos[i] == 2) {
    			num2++;
    		}else if (elementos[i] == 3) {
    			num3++;
    		}else if (elementos[i] == 4) {
    			num4++;
    		}else if (elementos[i] == 5) {
    			num5++;
    		}else if (elementos[i] == 6) {
    			num6++;
    		}else if (elementos[i] == 7) {
    			num7++;
    		}else if (elementos[i] == 8) {
    			num8++;
    		}else if (elementos[i] == 9){
    			num9++;
    		}
    	}
    	System.out.println("Hay esta cantidad de numeros por cada digito: 1: " +num1+ " | 2: " +num2+ " | 3: " +num3+ " | 4: " +num4+ " | 5: " +num5+ " | 6: " +num6+ " | 7: " +num7+ " | 8: " +num8+ " | 9: " +num9);
    }
    
}
