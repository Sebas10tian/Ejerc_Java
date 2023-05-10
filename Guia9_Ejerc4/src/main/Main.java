
package main;

import java.util.Date;
import servicio.FechaService;


public class Main {

   
    public static void main(String[] args) {
        FechaService fecha = new FechaService();
        
        Date nacimiento = fecha.fechaNacimiento();
        Date fechaActual = fecha.fechaActual();
        fecha.diferencia(nacimiento, fechaActual);
        
    }
    
}
