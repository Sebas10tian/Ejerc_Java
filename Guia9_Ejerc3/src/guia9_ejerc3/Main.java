/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9_ejerc3;

import service.ArregloService;

/**
 *
 * @author Chiva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // public class Main {

    
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        ArregloService servicio = new ArregloService();

        servicio.inicializarA(arregloA);

        System.out.println("Arreglo A:");
        servicio.mostrar(arregloA);

        servicio.ordenar(arregloA);

        System.out.println("Arreglo A ordenado:");
        servicio.mostrar(arregloA);

        servicio.inicializarB(arregloA, arregloB);

        System.out.println("Arreglo B:");
        servicio.mostrar(arregloB);

        System.out.println("Arreglo A después de inicializar B:");
        servicio.mostrar(arregloA);
    }

}
   
    
}
