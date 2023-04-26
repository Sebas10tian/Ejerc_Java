
package main;

import entidad.Raiz;
import servicio.RaizServicio;


public class main {

    
    public static void main(String[] args) {
        
        RaizServicio RS = new RaizServicio();
        Raiz RS1 = new Raiz();
        
        
        RS1= RS.crearRaiz();
        
        RaizServicio.calcular(RS1);
        
    }
    
}
