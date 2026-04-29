package EjercicioTablero;

import java.util.Scanner;
public class Tablero {

	private static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 16;
		int x = 0;
		int y = 0;
		int numeroAciertos = 0;
		String lineaHorizontal = "  +---+---+---+---+---+";
		
		String Tablero [][] = new String [5][5];
		Tablero = new String[][] {{"F", "F" , "" , "" , ""},
		{"" , "" , "S" , "S" , ""},
		{"F" , "F" , "" , "" , ""},
		{"" , "" , "S" , "S" , ""},
		{"" , "" , "D" , "D" , "D"}
		};
		
		String TableroMostrar [][] = new String [5][5];
		TableroMostrar = new String[][]
	   {{" ", " " , " " , " " , " "},
		{" " , " " , " " , " " , " "},
		{" " , " " , " " , " " , " "},
		{" " , " " , " " , " " , " "},
		{" " , " " , " " , " " , " "}
		};
		
		System.out.println("    0   1   2   3   4");
		System.out.println(lineaHorizontal);
		
		do {
		for(int fila = 0 ; fila< TableroMostrar.length; fila ++) {
				System.out.print((fila + 0) + " ");
			for (int col = 0; col< TableroMostrar[0].length; col ++) {
				System.out.printf("| %s ", TableroMostrar[fila] [col]);
			}
			System.out.println("|");
			System.out.println(lineaHorizontal);
		}
		
		
		System.out.println("Tienes "+cont+" intentos. ");
		System.out.println("Introduce X del 0 al 4: ");
		x = teclado.nextInt();
		if(x < 0 || x > 4) {
			System.out.println("Numero Invalido ");
			System.out.println("Introduce numero del 0 al 4: ");
			x = teclado.nextInt();
		}
		
		teclado.nextLine();
		
		System.out.println("Introduce Y del 0 al 4: ");
		y = teclado.nextInt();
		if(y < 0 || y > 4) {
			System.out.println("Numero Invalido ");
			System.out.println("Introduce numero del 0 al 4: ");
			y = teclado.nextInt();
		}
		teclado.nextLine();
		
		if (Tablero [x] [y].equals("D")) {
			System.out.println("Tocado Destructor");
			numeroAciertos ++;
			TableroMostrar [x] [y] = "D";
		}else if (Tablero [x] [y].equals("F")) {
			System.out.println("Tocado Fragata");
			numeroAciertos ++;
			TableroMostrar [x] [y] = "F";
		}else if (Tablero [x] [y].equals("S")) {
			System.out.println("Tocado submarino");
			numeroAciertos ++;
			TableroMostrar [x] [y] = "S";
		}else {
			System.out.println("Agua");
		}
		
		}while(cont == 0 || numeroAciertos < 11);
		System.out.println("Quieres jugar de nuevo? SI/NO ");
		String opcion = teclado.nextLine().substring(0,1); 
		if(opcion.equals("S")) {
			jugarDeNuevo(cont);
		}else {
			System.out.println("Hasta la proxima. ");
			teclado.close();
		}
		
		
	}
	
	private static void jugarDeNuevo (int cont) {
		cont = 0;
		main(null);
		
	}
}
