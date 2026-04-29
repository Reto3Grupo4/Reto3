package EjerUD5Array;

import java.util.Scanner;

public class NOTASMULTI {
    static Scanner teclado = new Scanner(System.in);
    static String[] materias = {"Redes", "Bases de datos", "Programación"};
    static String[] alumnos = new String[5];
    static double[][] notas = new double[5][3]; // 5 alumnos, 3 materias

    public static void main(String[] args) {
        pedirDatos();
        mostrarPorAlumno();
        mostrarPorMateria();
        mostrarInformeGeneral();
        teclado.close();
    }

    // --- MÉTODO PARA ENTRAR DATOS ---
    public static void pedirDatos() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Alumno " + (i + 1) + " ---");
            System.out.print("Nombre y apellido: ");
            alumnos[i] = teclado.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Nota de " + materias[j] + ": ");
                notas[i][j] = teclado.nextDouble();
            }
            teclado.nextLine(); // limpiar buffer
        }
    }

    // --- MÉTODO PARA MOSTRAR POR ALUMNO ---
    public static void mostrarPorAlumno() {
        System.out.println("\n=== INFORME POR ALUMNO ===");
        for (int i = 0; i < 5; i++) {
            double suma = 0;
            double notaMax = notas[i][0];
            double notaMin = notas[i][0];
            int indexMax = 0;
            int indexMin = 0;
            StringBuilder suspensos = new StringBuilder();

            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];
                if (notas[i][j] < 5) {
                    if (suspensos.length() > 0) suspensos.append(", ");
                    suspensos.append(materias[j]);
                }
                if (notas[i][j] > notaMax) { notaMax = notas[i][j]; indexMax = j; }
                if (notas[i][j] < notaMin) { notaMin = notas[i][j]; indexMin = j; }
            }

            double media = suma / 3;
            System.out.println("\nAlumno: " + alumnos[i]);
            System.out.printf("  Media: %.2f\n", media);
            System.out.println("  Suspensos: " + (suspensos.length() > 0 ? suspensos : "Ninguno"));
            System.out.println("  Nota más alta: " + materias[indexMax] + " (" + notaMax + ")");
            System.out.println("  Nota más baja: " + materias[indexMin] + " (" + notaMin + ")");
        }
    }

    // --- MÉTODO PARA MOSTRAR POR MATERIA ---
    public static void mostrarPorMateria() {
        System.out.println("\n=== INFORME POR MATERIA ===");
        for (int j = 0; j < 3; j++) {
            double suma = 0;
            double max = notas[0][j];
            double min = notas[0][j];
            String alumnoMax = alumnos[0];
            String alumnoMin = alumnos[0];
            int suspensos = 0;

            for (int i = 0; i < 5; i++) {
                double n = notas[i][j];
                suma += n;
                if (n > max) { max = n; alumnoMax = alumnos[i]; }
                if (n < min) { min = n; alumnoMin = alumnos[i]; }
                if (n < 5) suspensos++;
            }

            double media = suma / 5;
            System.out.println("\nMateria: " + materias[j]);
            System.out.printf("  Media: %.2f\n", media);
            System.out.println("  Nota más alta: " + max + " (Alumno: " + alumnoMax + ")");
            System.out.println("  Nota más baja: " + min + " (Alumno: " + alumnoMin + ")");
            System.out.println("  Suspensos: " + suspensos);
        }
    }

    // --- MÉTODO PARA MOSTRAR INFORME GENERAL ---
    public static void mostrarInformeGeneral() {
        System.out.println("\n=== INFORME GENERAL ===");

        double sumaTotal = 0;
        double notaMax = notas[0][0], notaMin = notas[0][0];
        String alumnoMax = alumnos[0], alumnoMin = alumnos[0];
        String materiaMax = materias[0], materiaMin = materias[0];

        int[] suspAlumno = new int[5];
        int[] suspMateria = new int[3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                double n = notas[i][j];
                sumaTotal += n;

                if (n > notaMax) { notaMax = n; alumnoMax = alumnos[i]; materiaMax = materias[j]; }
                if (n < notaMin) { notaMin = n; alumnoMin = alumnos[i]; materiaMin = materias[j]; }

                if (n < 5) { suspAlumno[i]++; suspMateria[j]++; }
            }
        }

        double mediaTotal = sumaTotal / (5 * 3);

        // Alumno con más suspensos
        int maxSuspAlumno = 0;
        String alumnoMasSusp = alumnos[0];
        for (int i = 0; i < 5; i++) {
            if (suspAlumno[i] > maxSuspAlumno) {
                maxSuspAlumno = suspAlumno[i];
                alumnoMasSusp = alumnos[i];
            }
        }

        // Materia con más suspensos
        int maxSuspMateria = 0;
        String materiaMasSusp = materias[0];
        for (int j = 0; j < 3; j++) {
            if (suspMateria[j] > maxSuspMateria) {
                maxSuspMateria = suspMateria[j];
                materiaMasSusp = materias[j];
            }
        }

        System.out.printf("Media total: %.2f\n", mediaTotal);
        System.out.println("Calificación más alta: " + notaMax + " (Alumno: " + alumnoMax + ", Materia: " + materiaMax + ")");
        System.out.println("Calificación más baja: " + notaMin + " (Alumno: " + alumnoMin + ", Materia: " + materiaMin + ")");
        System.out.println("Alumno con más suspensos: " + alumnoMasSusp + " (" + maxSuspAlumno + " suspensos)");
        System.out.println("Materia con más suspensos: " + materiaMasSusp + " (" + maxSuspMateria + " suspensos)");
    }
}