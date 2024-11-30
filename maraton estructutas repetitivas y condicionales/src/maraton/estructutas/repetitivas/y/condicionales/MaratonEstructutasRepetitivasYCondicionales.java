package maraton.estructutas.repetitivas.y.condicionales;

import java.util.Scanner;

public class MaratonEstructutasRepetitivasYCondicionales {

    public static void main(String[] args) {
        /*
        en un maraton la inscripcion es el dia anterior a la carrera, por lo que no se sabe la cantidad exacta de participantes que puede haber
        para inscribirse se solicita: dni, nombre y edad.
        se manejan las siguiete categorias:
        menores A (6 a 10 años)
        menores B (11 a 17 años)
        juveniles (18 a 30 años)
        adultos (31 a 50 años)
        adultos mayores ( +50 años)
        se necesita un programa que, apartir del ingreso de los datos y edad de los participantes, se muestre por pantalla a que categoria 
        debe inscribirse cada persona. al finalizar el dia para dar fin a las inscripciones al final del dia se debe ingresar un dni con vlor 0
        y un nombre con la palabre "fin" 
         */
        //dni
        System.out.println("Ingrese el dni de la persona");
        Scanner teclado = new Scanner(System.in);
        String dni = teclado.nextLine();
        //nombre
        System.out.println("Ingrese el nombre de la persona");
        String nombre = teclado.nextLine();
        //edad
        System.out.println("Ingrese la edad de la persona");
        Scanner teclado2 = new Scanner(System.in);
        int edad = teclado2.nextInt();

        while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin")) {

            if (edad >= 6 && edad <= 10) {
                System.out.println("La categoria es Menores A");
            } else {
                if (edad >= 11 && edad <= 17) {
                    System.out.println("La categoria es Menores B");
                } else {
                    if (edad >= 18 && edad <= 30) {
                        System.out.println("La categoria es Juveniles");
                    } else {
                        if (edad >= 31 && edad <= 50) {
                            System.out.println("La categoria es Adultos");
                        } else {
                            if (edad >= 51) {
                                System.out.println("La categoria es Adultos Mayores");
                            } else {
                                System.out.println("La persona no cuenta con la edad adecuada");
                            }
                        }
                    }
                }
            }
            System.out.println("Ingrese el dni de la persona");
            dni = teclado.nextLine();
            
            System.out.println("Ingrese el nombre de la persona");
            nombre = teclado.nextLine();
            
            System.out.println("Ingrese la edad de la persona");
            edad = teclado2.nextInt();
        }
    }

}
