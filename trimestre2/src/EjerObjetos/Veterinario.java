package EjerObjetos;

import java.util.Scanner;
public class Veterinario {

	static private Scanner teclado;
	public static void main (String[] args) {
		teclado = new Scanner (System.in);
		
		Perro miPerro = new Perro("Ricky" , "Macho" , "Doberman" , 5);
		Perro tuPerro = new Perro("Milu" , "Hembra" , "Mastín" , 7);
		
		System.out.println("Bienvenidos a la clinica veterinaria");
		
		System.out.println("Perrito como te llamas? ");
		System.out.printf("%s \n" , miPerro.getNombre());
		miPerro.ladrar();
		System.out.println("");
		
		if(miPerro.getRaza().equals(tuPerro.getRaza())) {
			System.out.println("Son el mismo canido");
		}else {
			System.out.println(miPerro.getNombre() + " y " + tuPerro.getNombre() + " son distinto canido");
		}
		
		System.out.println("");
		System.out.println("Cuantos años tienes?");
		miPerro.getEdad();
		
		System.out.printf("Tengo %d años.\n" , miPerro.getEdad());
		
		String textTec = "Mastín";
		textTec = teclado.nextLine();
	
		System.out.println("Cual es la raza de tu perro?");
		tuPerro.setRaza(textTec);
		
		
	}
}
