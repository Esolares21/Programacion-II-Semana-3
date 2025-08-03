import javax.swing.*;
import java.util.Scanner;

public class Semana3_Promedios {
    public static void main(String[] args) {
        // Utilizamos Scanner para que el usuario ingrese los datos;
        Scanner nombres = new Scanner(System.in);
        Scanner notas = new Scanner(System.in);

        // Declaramos los arreglos que vamos a utilizar para solicitar nombres y notas y colocams el limite de cada arreglo;
        String[] nombresE = new String[5];
        int[] notasE1 = new int[3];
        int[] notasE2 = new int[3];
        int[] notasE3 = new int[3];
        int[] notasE4 = new int[3];
        int[] notasE5 = new int[3];


        /* Damos la bienvenida y solicitamos los nombres de los estudiantes especificando
        la posicion que llevara cada nombre en el arreglo nombresE.

        Por cada nombre agrefamos un for para solicitas las 3 notas de cada estudiantre
         */
        System.out.println("Bienvenido al listado de notas de los estudiantes de Programacion II");
        System.out.println("Ingresa el nombre del primer estudiante: ");
        nombresE[0] = nombres.nextLine();


        for (int notaE1 = 0; notaE1 < notasE1.length; notaE1++) {
            System.out.println("Ingresa las notas del estudiante (Maximo 3 ): ");
            notasE1[notaE1] = notas.nextInt();
        }

        System.out.println("Ingresa el nombre del segundo estudiante: ");
        nombresE[1] = nombres.nextLine();
        for (int notaE2 = 0; notaE2 < notasE2.length; notaE2++) {
            System.out.println("Ingresa las notas del estudiante (Maximo 3 ): ");
            notasE2[notaE2] = notas.nextInt();
        }

        System.out.println("Ingresa el nombre del tercer estudiante: ");
        nombresE[2] = nombres.nextLine();
        for (int notaE3 = 0; notaE3 < notasE3.length; notaE3++) {
            System.out.println("Ingresa las notas del estudiante (Maximo 3 ): ");
            notasE3[notaE3] = notas.nextInt();
        }

        System.out.println("Ingresa el nombre del cuarto estudiante: ");
        nombresE[3] = nombres.nextLine();
        for (int notaE4 = 0; notaE4 < notasE4.length; notaE4++) {
            System.out.println("Ingresa las notas del estudiante (Maximo 3 ): ");
            notasE4[notaE4] = notas.nextInt();
        }

        System.out.println("Ingresa el nombre del quinto estudiante: ");
        nombresE[4] = nombres.nextLine();
        for (int notaE5 = 0; notaE5 < notasE5.length; notaE5++) {
            System.out.println("Ingresa las notas del estudiante (Maximo 3 ): ");
            notasE5[notaE5] = notas.nextInt();
        }


        // Realizamos el promedio de las nodas de cada estudiante ingresado
        double promedio1 = (notasE1[0] + notasE1[1] + notasE1[2]) / notasE1.length;
        double promedio2 = (notasE2[0] + notasE2[1] + notasE2[2]) / notasE2.length;
        double promedio3 = (notasE3[0] + notasE3[1] + notasE3[2]) / notasE3.length;
        double promedio4 = (notasE4[0] + notasE4[1] + notasE4[2]) / notasE4.length;
        double promedio5 = (notasE5[0] + notasE5[1] + notasE5[2]) / notasE5.length;

        // Declaramos variables de estado para cada estudiante
        String estado1;
        String estado2;
        String estado3;
        String estado4;
        String estado5;

        // Realizamos condiciones de if else para saber el estado de cada estudiante
        if (promedio1 >= 61) {
            estado1 = "Aprobado";
        } else {
            estado1 = "Reprobado";
        }

        if (promedio2 >= 61) {
            estado2 = "Aprobado";
        } else {
            estado2 = "Reprobado";
        }

        if (promedio3 >= 61) {
            estado3 = "Aprobado";
        } else {
            estado3 = "Reprobado";
        }

        if (promedio4 >= 61) {
            estado4 = "Aprobado";
        } else {
            estado4 = "Reprobado";
        }

        if (promedio5 >= 61) {
            estado5 = "Aprobado";
        } else {
            estado5 = "Reprobado";
        }

        // Presentamos el resumen de cada estudiante con su nombre, promedio y estado
        System.out.println("Resumen de estudiantes de Programacion II: ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nombre: " + nombresE[0] + "   " + "Promedio: " + promedio1 + "   " + "Estado: " + estado1);
        System.out.println("Nombre: " + nombresE[1] + "   " + "Promedio: " + promedio2 + "   " + "Estado: " + estado2);
        System.out.println("Nombre: " + nombresE[2] + "   " + "Promedio: " + promedio3 + "   " + "Estado: " + estado3);
        System.out.println("Nombre: " + nombresE[3] + "   " + "Promedio: " + promedio4 + "   " + "Estado: " + estado4);
        System.out.println("Nombre: " + nombresE[4] + "   " + "Promedio: " + promedio5 + "   " + "Estado: " + estado5);

        // Cerramos los Scanner utilizados
        nombres.close();
        notas.close();
    }
}
