package numeros.hasta.limite;

import java.util.Scanner;

public class NumerosHastaLimite {
/* realizar un programa que dado por teclado un limite numerico muestre en pantalla
    todos los numeros hasta ese limite (empezando por 1)
    */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar hasta que numero hay que contar");
        int limite = scanner.nextInt();
        
        
         for (int num = 1; num<=limite; num++){
             System.out.println("El numero es " + num);
         }
         
         
         /*
         System.out.println("Ingresar hasta que numero hay que contar");
         Scanner teclado = new Scanner (System.in);
         int limite = teclado.nextInt();
         int cont = 1;
         
         while (cont <= limite) {
            System.out.println(cont);
            cont++;
         }
         */
    }
    
}
