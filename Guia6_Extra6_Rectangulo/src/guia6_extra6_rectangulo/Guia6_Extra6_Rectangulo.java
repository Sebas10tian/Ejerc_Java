/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_extra6_rectangulo;

import Entidad.Rectangulo;

/**
 *
 * @author Chiva
 */
public class Guia6_Extra6_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo rectangulo1 = new Rectangulo();
        
        rectangulo1.setLado1(4);
        rectangulo1.setLado2(6);
        
        rectangulo1.calcular_area();
        
    }
    
}
