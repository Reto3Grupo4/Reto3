package EjerObjetos;

import java.util.Scanner;

public class PersonasMain {

	static private Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		teclado = new Scanner (System.in);
		
		Persona Persona1 = new Persona("Lucia" , "Gutierrez" , 30 , true , "2");
		Persona Persona2 = new Persona("Luis" , "Gonzalez" , 31 , true , "1");
		getNombreApellidos (Persona1, Persona2);
		setEdad(Persona1 , Persona2);
		setCasados(Persona1 , Persona2);
		setnumeroIdentidad (Persona1 , Persona2);
		mostrarDatos (Persona1 , Persona2);
		Mayor (Persona1 , Persona2);
	}
	



	private static void getNombreApellidos(Persona Persona1 , Persona Persona2) {
		
		System.out.println("--------------Persona 1-------------");
		System.out.println("Introduce el nombre de la primera persona: ");
		Persona1.setNombre(teclado.nextLine());
		System.out.println("Introduce el apellido de la primera persona: ");
		Persona1.setApellidos(teclado.nextLine());
		System.out.println("--------------Persona 2-------------");
		System.out.println("Introduce el nombre de la segunda persona: ");
		Persona2.setNombre(teclado.nextLine());
		System.out.println("Introduce el apellido de la segunda persona: ");
		Persona2.setApellidos(teclado.nextLine());

	}
	
	private static void setEdad(Persona Persona1 , Persona Persona2) {
	
		System.out.println("--------------Persona 1-------------");
		System.out.println("Que edad tiene la primera persona: ");
		Persona1.setEdad(teclado.nextInt());
		System.out.println("--------------Persona 2-------------");
		System.out.println("Que edad tiene la segunda persona: ");
		Persona2.setEdad(teclado.nextInt());
		
	}
	private static void setCasados(Persona Persona1 , Persona Persona2) {
		int opc = 0;
		
		System.out.println("La primera persona esta casado/a? ");
		System.out.println("1: True | 2: False");
		opc = teclado.nextInt();
		switch (opc) {
		case 1:
			Persona1.setCasado(true);
		break;
		case 2:
			Persona1.setCasado(false);
		break;
		
		default:
			System.out.println("Introduce un numero valido");
		}
		System.out.println("La segunda persona esta casado/a? ");
		System.out.println("1: True | 2: False");
		opc = teclado.nextInt();
		switch (opc) {
		case 1:
			Persona2.setCasado(true);
			opc = 0;
		break;
		case 2:
			Persona2.setCasado(false);
			opc = 0;
		break;
		
		default:
			System.out.println("Introduce un numero valido");
		}
		
	}

	private static void setnumeroIdentidad(Persona Persona1, Persona Persona2) {
		System.out.println("--------------Persona 1-------------");
		System.out.println("Introduce el DNI de la primera persona: ");
		teclado.nextLine();
		Persona1.setNumeroIdentidad(teclado.nextLine());
		System.out.println("--------------Persona 2-------------");
		System.out.println("Introduce el DNI de la segunda persona: ");
		Persona2.setNumeroIdentidad(teclado.nextLine());
	}
	public static void mostrarDatos(Persona Persona1, Persona Persona2) {
		System.out.println("--------------Persona 1-------------");
		System.out.println("El nombre de la primera persona es " +Persona1.getNombre() + " y el apellido es " +Persona1.getApellidos());
		System.out.println("La edad de la primera persona es " +Persona1.getEdad());
		System.out.println("La primera persona esta casado/a? " +Persona1.isCasado());
		System.out.println("El DNI de la primera persona es " +Persona1.getNumeroIdentidad());
		
		System.out.println("--------------Persona 2-------------");
		System.out.println("El nombre de la primera persona es " +Persona2.getNombre() + " y el apellido es " +Persona2.getApellidos());
		System.out.println("La edad de la primera persona es " +Persona2.getEdad());
		System.out.println("La segunda persona esta casado/a? " +Persona2.isCasado());
		System.out.println("El DNI de la segunda persona es " +Persona2.getNumeroIdentidad());
	
	}
	
	private static void Mayor(Persona Persona1, Persona Persona2) {
		if(Persona1.getEdad() > Persona2.getEdad()) {
			System.out.println("La persona mas mayor es " +Persona1.getNombre() + Persona1.getApellidos());
		}else if (Persona1.getEdad() < Persona2.getEdad()) {
			System.out.println("La persona mas mayor es " +Persona2.getNombre() + Persona2.getApellidos());
		}
		
	}
	
}
