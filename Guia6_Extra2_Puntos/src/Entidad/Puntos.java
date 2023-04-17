/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Puntos {
   
    private int x1, y1, x2, y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas de ambos puntos (x1, y1, x2, y2)");
        x1= leer.nextInt();
        y1= leer.nextInt();
        x2= leer.nextInt();
        y1= leer.nextInt();
        
    }
    
    public void calcularDistancia(){
        int x = x2-x1;
        int y = y2-y1;
        double distancia = Math.sqrt(x*x + y*y);
        
        System.out.println("La distancia entre los puntos es: " + distancia);
        
    }
    
}
