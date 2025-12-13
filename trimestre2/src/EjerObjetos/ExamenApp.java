package EjerObjetos;

import java.util.Scanner;

public class ExamenApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese los datos del examen de programación:");

        System.out.print("Asignatura: ");
        String asignatura = teclado.nextLine();

        System.out.print("Aula: ");
        String aula = teclado.nextLine();

        System.out.print("Día: ");
        int dia = teclado.nextInt();
        System.out.print("Mes: ");
        int mes = teclado.nextInt();
        System.out.print("Año: ");
        int anio = teclado.nextInt();

        System.out.print("Hora: ");
        int hora = teclado.nextInt();
        System.out.print("Minuto: ");
        int minuto = teclado.nextInt();

        Fecha fecha = new Fecha(dia, mes, anio);
        Hora h = new Hora(hora, minuto);
        Examen examen = new Examen(asignatura, aula, fecha, h);

        // Mostrar datos
        System.out.println("\nDatos del examen:");
        System.out.println("Asignatura: " + examen.getAsignatura());
        System.out.println("Aula: " + examen.getAula());
        System.out.println("Fecha: " + examen.getFecha());
        System.out.println("Hora: " + examen.getHora());

        teclado.close();
    }
}
