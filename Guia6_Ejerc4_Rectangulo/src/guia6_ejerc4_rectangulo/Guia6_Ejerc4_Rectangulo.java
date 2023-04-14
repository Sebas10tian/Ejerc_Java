/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_ejerc4_rectangulo;

import Entidad.Rectangulo;

/**
 *
 * @author Chiva
 */
public class Guia6_Ejerc4_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo primero = new Rectangulo();
        
        primero.crearRectangulo();
        primero.calcSuperficie();
        primero.calcPerimetro();
        primero.dibujar();
        
    }
    
}
