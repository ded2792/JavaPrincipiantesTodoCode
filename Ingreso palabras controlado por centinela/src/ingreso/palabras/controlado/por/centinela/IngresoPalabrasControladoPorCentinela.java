package ingreso.palabras.controlado.por.centinela;

import java.util.Scanner;

public class IngresoPalabrasControladoPorCentinela {

    public static void main(String[] args) {
        /*
        realizar un programa que muestre en pantalla palabras
        que sean ingresadas por teclado hasta que se ingrese
        la palabra "salir"
         */

        System.out.println("Ingrese una palabra");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.next();

        while (!palabra.equalsIgnoreCase("salir")) { //equalsIgnoreCase sirve para que ignore si se ingresa en mayusculas o no
            System.out.println("La palabra es: " + palabra);
            System.out.println("Ingrese una palabra");
            palabra = teclado.next();
        }
    }

}
