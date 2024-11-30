
package ejerciciomatricesiffor;

import java.util.Scanner;

public class EjercicioMatricesIfFor {

/* en una tabla de 4 columnas y 4 filas se guardan las notas de 4 alumnos.
    cada fila corresponde a las notas y al promedio de cada alumno.
    se necesita un programa que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila, las
    notas del alumno y que en las ultima columna se calculen los promedios. Una vez realizados los calculos,
    se desena mostrar las 3 notas de cada alumno y el promedio correspondiente corriendo la matriz
    */
    
    public static void main(String[] args) {
        
     Double matriz [][] = new Double[4][4];
     Scanner teclado  = new Scanner (System.in);
     Double suma = 0.0;
     
     //for para cargar la matriz
     for (int f=0; f<4; f++){
         for (int c=0; c<3; c++){    //se usa 3 porque el 4 es para el promedio ya
             
             System.out.println("Ingrese el alumno n° " + f);
             matriz[f][c] = teclado .nextDouble();
             suma = suma + matriz[f][c];
         }
         matriz[f][3] = suma / 3;  //carga el promedio
         suma = 0.0; //se reinicia el acumulador cuando termina con este alumno
     }
     
     //for para recorrer la matriz
          for (int f=0; f<4; f++){
              System.out.println("Las notas del alumno n° " + f + " son: ");
         for (int c=0; c<3; c++){ 
             
             System.out.println("Nota N° " + c + ": " + matriz[f][c]);
         }
              System.out.println("El promedio de las notas es: " + matriz[f][3]);
          }

        
        
        
        
    }
    
}
