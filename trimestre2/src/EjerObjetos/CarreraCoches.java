package EjerObjetos;

import java.util.Scanner;

public class CarreraCoches {
	static private Scanner teclado;
	public static void main(String[] args) {
	teclado = new Scanner (System.in);
	
	Coche Coche1 = new Coche(0);
	int velocidad = 0;
	
	Coche1.setVelocidad(Coche1.getVelocidad());
	System.out.println("Velocidad inicial: " +Coche1.getVelocidad());
	do {
	System.out.println("Introduce la variacion de velocidad deseada (0 para finalizar): ");
	velocidad = teclado.nextInt();
	if(velocidad < 0) {
		Coche1.frena(velocidad);
		System.out.println("Velocidad actual: " +Coche1.getVelocidad());
		velocidad = 0;
	}else if(velocidad > 0) {
		Coche1.acelera(velocidad);
		velocidad = 0;
		System.out.println("Velocidad actual: "+Coche1.getVelocidad());
	}
	
	}while (Coche1.getVelocidad() > 0);
	System.out.println("Fin");
	
	}
}

