package ejerciciotemperaturasciudades;

import java.util.Scanner;

public class EjercicioTemperaturasCiudades {

    /*
    en 3 vectores diferentes se guardan los nombres, temperaturas minimas y maximas de 5 ciudades.
    En el primer vector se guardan los nombres de las ciudades, en el seguinda las temperaturas minimas
    y en el tercero las temperaturas maximas. Se necesita un programa que permita la carga de las ciudades, las temperaturas
    e infromar por pantalla cual fue la ciudad con la temperatura mas baja y cual con la mas alta (dando a conocer
    al mismo tiempo la cantidad de grados)
    */
    
    public static void main(String[] args) {
       
        //declaracion vectores
        String ciudades[] = new String[5];
        Double minimas[] = new Double[5];
        Double maximas[] = new Double[5];
        
        Scanner teclado = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);
        
        
        //carga los vectores
        for (int i=0; i<ciudades.length; i++){
            System.out.println("Ingrese el nombre de la ciudad " + i);
            ciudades[i] = teclado.next();
            
            System.out.println("INgrese la minima de la ciudad " + i);
            minimas[i] = teclado2.nextDouble();
            
            System.out.println("Ingrese la maxima de la ciudad " + i);
            maximas[i] = teclado2.nextDouble();
        }
        
        Double minima = 9999999.00;
        int posMin = -1;
        //determinar la minima
         for (int i=0; i<ciudades.length; i++){
             if (minimas[i] < minima) {
                 minima = minimas[i];
                 posMin = i;
             }
         }
         
         Double maxima = -9999999.00;
        int posMax = -1;
        //determinar la maxima
        for (int i=0; i<ciudades.length; i++){
            if (maximas[i] > maxima){
                maxima = maximas[i];
                posMax = i;
            }
        }
        
        System.out.println("La temperatura minima es de: " + minima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMin]);
        System.out.println("La temperatura maxima es de: " + maxima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMax]);
    }
    
}
