package ejercicio.vectores.pkgif.pkgfor;

import java.util.Scanner;

public class EjercicioVectoresIfFor {


    /*Realizar un programa que permita cargar 15 numeros en un vector.
    una vez ccargados se necesita que el programa cuente e informe por pantalla cuantas
    veces se cargo el numero 3
     */
    public static void main(String[] args) {

        int vector[] = new int[15];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Cual es el valor para el vector en el indice " + i);
            vector[i] = teclado.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3){
               contador ++;
            }
        }
        System.out.println("La cantidad de veces que se ingreso el numero 3 es: " + contador + " veces");
    }

}
