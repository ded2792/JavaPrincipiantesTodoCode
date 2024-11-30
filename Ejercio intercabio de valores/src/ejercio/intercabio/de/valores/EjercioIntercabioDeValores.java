package ejercio.intercabio.de.valores;

public class EjercioIntercabioDeValores {

    public static void main(String[] args) {
        int num1 = 35; 
        int num2 = 20; 
        int aux; 
        
        System.out.println("ANTES --------- > num1 vale:" + num1 + " y num2 vale: " + num2);
        
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("DESPUES --------> Ahora num1 vale:" + num1 + " y num2 vale:" + num2);
    }
    
}
