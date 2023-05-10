/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.ParDeNumeros;
import servicio.ParDeNumerosServicio;

/**
 *
 * @author Chiva
 */
public class mainNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ParDeNumeros numS = new ParDeNumeros();
        //ParDeNumeros nu = numS.mostrarValores();

        ParDeNumerosServicio.mostrarValores(numS);
        ParDeNumerosServicio.devolverMayor(numS);
        ParDeNumerosServicio.devolverMenor(numS);
        ParDeNumerosServicio.calcularPotencia(numS);
        ParDeNumerosServicio.calcularRaiz(numS);

    }

}
