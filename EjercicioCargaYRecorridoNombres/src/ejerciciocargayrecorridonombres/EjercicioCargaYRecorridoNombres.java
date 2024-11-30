
package ejerciciocargayrecorridonombres;

public class EjercicioCargaYRecorridoNombres {

    /*
    llevar a cabo un programa que incluya un vector que almacente los nombres (8 nombres cualquiera):
    Alejandra, Leonardo, Rosa, Guillermo, Gabriel, DAniel; Luisa y Ludmila.
    Realizar un recorrido del vector para cargar los datos y otros recorrido para mostrar los mismos por pantalla
    */
    
    public static void main(String[] args) {
        String vector[] = new String [8];
        
        //carga
        vector[0] = "Alejandra";
        vector[1] = "Leonardo";
        vector[2] = "Gabriel";
        vector[3] = "Pepe";
        vector[4] = "Pedro";
        vector[5] = "Pepito";
        vector[6] = "Pablo";
        vector[7] = "Jose";
        
        //recorrido
        for (int i=0; i<vector.length; i++){
            System.out.println("En la posicion: " + i + " Esta el nombre: " + vector[i]);
        }
    }
    
}
