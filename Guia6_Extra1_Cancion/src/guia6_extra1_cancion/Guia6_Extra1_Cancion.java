/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_extra1_cancion;

import Entidad.Cancion;

/**
 *
 * @author Chiva
 */
public class Guia6_Extra1_Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("La Balsa");
        miCancion.setAutor("Los Gatos");
        System.out.println(" La cancion es: "+ miCancion.getTitulo()
        + "\n El Autor es: " + miCancion.getAutor());
        
    }
    
}
