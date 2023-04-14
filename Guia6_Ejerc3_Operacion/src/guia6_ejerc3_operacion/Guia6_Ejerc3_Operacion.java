/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_ejerc3_operacion;

import Entidad.Operacion;

/**
 *
 * @author Chiva
 */
public class Guia6_Ejerc3_Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operacion calculo = new Operacion();
        
        calculo.crearOperacion();
        calculo.suma();
        System.out.println("La suma de los numeros da: " + calculo.suma());
        calculo.resta();
        System.out.println("La resta de los numeros da: " + calculo.resta());
        calculo.multiplicacion();
        System.out.println("La multiplicacion de los numeros da: " + calculo.multiplicacion());
        calculo.dividir();
        System.out.println("La division de los numeros da: " + calculo.dividir());
    }
    
}
