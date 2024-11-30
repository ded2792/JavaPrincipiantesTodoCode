package arbol.de.navidad;

public class ArbolDeNavidad {

    public static void main(String[] args) {

        //altura del arbol
        int altura = 4;
        //bucle para recorrer todas las filas (altura)
        for (int fila = 0; fila < altura; fila++) {

            //bucle para los espacios
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                System.out.print(" ");
            }
            //bucle para los asteriscos
            for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //tronco
        int largoTronco = 3;
        for (int base = 0; base < largoTronco; base++) {

            //escpacios en blanco
            for (int espacio = 0; espacio < (altura - 2); espacio++) {
                System.out.print(" ");
            }
            //barritas tronco
            for (int tronco = 0; tronco < 3; tronco++) {
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
