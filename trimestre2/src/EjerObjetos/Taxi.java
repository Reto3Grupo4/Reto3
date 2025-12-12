package EjerObjetos;


import java.util.Scanner;

public class Taxi {
	static private Scanner teclado;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		teclado = new Scanner (System.in);
		
		TaxiApp miTaxi = new TaxiApp("Bizkaia","707GSP" , "Bilbao" , 1);
		
		
		
		
		
		System.out.println("Cual es la matricula del taxi?");
		miTaxi.setMatricula(miTaxi.getMatricula());
		System.out.println(miTaxi.getMatricula());
		System.out.println("Pulsa ENTER para continuar");
		teclado.nextLine();
		
		System.out.println("Cual es el municipio en el que esta usted?");
		miTaxi.setMunicipio(miTaxi.getMunicipio());
		System.out.println(miTaxi.getMunicipio());
		System.out.println("Pulsa ENTER para continuar");
		teclado.nextLine();
		
	
		System.out.println("Cual es el tipo de motor del taxi?");
		do {
		miTaxi.setMotor(teclado.nextInt());
		if(miTaxi.getMotor() > 2 || miTaxi.getMotor() < 0) {
			System.out.println("Introduce un numero valido");
		}
		
		}while(miTaxi.getMotor() > 2|| miTaxi.getMotor() < 0);
		System.out.println("---------------Caracteristicas---------------");
		System.out.println("La provincia de mi taxi es: " +miTaxi.getProvincia());
		System.out.println("");
		System.out.println("La matricula de mi taxi es: " +miTaxi.getMatricula());
		System.out.println("");
		System.out.println("El municipio donde esta mi taxi es: " +miTaxi.getMunicipio());
		System.out.println("");
		System.out.println("El tipo de motor de mi taxi es: " +miTaxi.getMotor());
	}
}
