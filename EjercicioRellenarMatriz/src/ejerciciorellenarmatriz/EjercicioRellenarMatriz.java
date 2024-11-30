
package ejerciciorellenarmatriz;

public class EjercicioRellenarMatriz {

    //crear un programa que permita cargar completamente con numeros 5 una matriz de 4x5

    public static void main(String[] args) {
        
        //declaracion matriz
        int matriz [][] = new int [4][5];
        
        //carga con numeros 5
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] =  5;
            }
        }
    
        //recorrido de salida usando solo print no hace el salto de linea
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); //cuando termina cada coluna hace un salto de linea
            }
}
}