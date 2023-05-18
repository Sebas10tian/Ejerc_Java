/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicio.PeliculaServicio;

/**
 *
 * @author Chiva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio miPelicula = new PeliculaServicio();
        
        miPelicula.crearPelicula();
        System.out.println("Estas son las peliculas cargadas");
        miPelicula.mostrarPeliculas();
        miPelicula.mayorHora();
        miPelicula.ordenarMayor();
        miPelicula.ordenarMenor();
        miPelicula.ordenarAlfab();
        miPelicula.ordenarDirector();
    }
    
}
