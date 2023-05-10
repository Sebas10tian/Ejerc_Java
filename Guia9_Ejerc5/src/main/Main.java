/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Persona;
import servicio.PersonaServicio;

/**
 *
 * @author Chiva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        PersonaServicio n1 = new PersonaServicio();
        Persona per = n1.crearPersona();
        
        
        n1.mostrarPersona(per);
        
        
    }
    
}
