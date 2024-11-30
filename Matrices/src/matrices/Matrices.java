package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        //Declaración
        int matriz[][] = new int[3][3];

        /*Asignación (manual)
        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 96;
        matriz[1][0] = 35;
        matriz[1][1] = 33;
        matriz[1][2] = 71;
        matriz[2][0] = 446;
        matriz[2][1] = 228;
        matriz[2][2] = 24;*/
        Scanner teclado = new Scanner (System.in);
        //Asignación (por teclado)
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor de la posicion f: " + f + " c: " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }

        //Recorrido
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posicion f: " + f + " c: " + c);
                System.out.println("es de: " + matriz[f][c]);
            }
        }

    }

}
