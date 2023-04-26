
package main;

import entidad.Cafetera;
import java.util.Scanner;
import servicio.CafeteraServicio;


public class main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Instanciamos la cuenta servicio !!!!
        CafeteraServicio caf = new CafeteraServicio();
        Cafetera cafetera1 = caf.llenarCafetera();
        
    
    int opc=0;
        do {
        System.out.println("l- Servir taza");
        System.out.println("2- Vaciar cafetera");
        System.out.println("3- Agregar cafe");
        System.out.println("4- Llenar cafetera");
        System.out.println("5- Salir");
        
        opc = leer.nextInt();
        
        
            switch (opc) {
                case 1:
                    caf.servirTaza(cafetera1);
                    break;
                case 2:
                    caf.vaciarCafereta(cafetera1);
                    break;
                case 3:
                    caf.agregarCafe(cafetera1);
                    break;
                case 4:
                    caf.llenarCafetera();
                    break;
            }
        } while (opc != 5);
    }
    
}
