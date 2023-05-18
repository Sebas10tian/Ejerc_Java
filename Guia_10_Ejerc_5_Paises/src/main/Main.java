/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicio.PaisesServicio;

/**
 *
 * @author Chiva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisesServicio pais = new PaisesServicio();
        
        pais.crearPais();
        pais.mostrar();
        pais.ordenar();
    }
    
}
