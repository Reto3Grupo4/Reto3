package EjerObjetos;

import java.util.Scanner;

public class AlumnoApp {

    private static Alumno[] alumnos = null;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu principal");
            System.out.println("1.- Cargar datos alumnos");
            System.out.println("2.- Procesar los datos");
            System.out.println("3.- Mostrar datos de los alumnos");
            System.out.println("4.- Mostrar datos de un alumno");
            System.out.println("0.- Fin");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: cargarAlumnos(teclado);
                break;
                case 2: procesarDatos();
                break;
                case 3: mostrarTodos();
                break;
                case 4: mostrarAlumno(teclado);
                break;
                case 0: System.out.println("Fin del programa.");
                break;
                default: System.out.println("Opción incorrecta.");
                break;
            }

        } while (opcion != 0);

        teclado.close();
    }

    private static void cargarAlumnos(Scanner teclado) {
        System.out.print("Cuántos alumnos desea introducir? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        alumnos = new Alumno[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Sexo (H/M): ");
            char sexo = teclado.nextLine().charAt(0);

            int edad;
            do {
                System.out.print("Edad (>0): ");
                edad = teclado.nextInt();
                teclado.nextLine();
            } while (edad <= 0);

            double altura;
            do {
                System.out.print("Altura (0-2.5 m): ");
                altura = teclado.nextDouble();
                teclado.nextLine();
            } while (altura <= 0 || altura > 2.5);

            double peso;
            do {
                System.out.print("Peso (0-150 kg): ");
                peso = teclado.nextDouble();
                teclado.nextLine();
            } while (peso <= 0 || peso > 150);

            alumnos[i] = new Alumno(nombre, sexo, edad, altura, peso);
        }
        System.out.println("Alumnos cargados correctamente.");
    }

    private static void procesarDatos() {
        if (alumnos == null) {
            System.out.println("No hay alumnos cargados.");
            return;
        }

        int hombres = 0, sumaEdadHombres = 0, mas165 = 0;

        for (Alumno a : alumnos) {
            if (a.getSexo().equalsIgnoreCase("Hombre")) {
                sumaEdadHombres += a.getEdad();
                hombres++;
            }
            if (a.getAltura() > 1.65) mas165++;
        }

        double promedioEdadHombres = (hombres > 0) ? (double)sumaEdadHombres/hombres : 0;

        System.out.println("Promedio edad hombres: " + promedioEdadHombres);
        System.out.println("Total alumnos con altura > 1.65 m: " + mas165);
    }

    private static void mostrarTodos() {
        if (alumnos == null) {
            System.out.println("No hay alumnos cargados.");
            return;
        }

        System.out.println("Listado de alumnos");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-15s %-7s %-5s %-10s %-10s%n", "Nombre", "Sexo", "Edad", "Altura(m)", "Peso(kg)");
        System.out.println("---------------------------------------------------");

        for (Alumno a : alumnos) {
            System.out.printf("%-15s %-7s %-5d %-10.2f %-10.2f%n", 
                a.getNombre(), a.getSexo(), a.getEdad(), a.getAltura(), a.getPeso());
        }
    }
    
    private static void mostrarAlumno(Scanner teclado) {
        if (alumnos == null) {
            System.out.println("No hay alumnos cargados.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno: ");
        String nombreBuscado = teclado.nextLine();

        boolean encontrado = false;
        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println(a);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) System.out.println("No se encontró ningún alumno con ese nombre.");
    }
}