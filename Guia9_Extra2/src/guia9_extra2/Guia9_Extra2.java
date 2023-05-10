/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extra2;

import ahorcadoService.AhorcadoService;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Guia9_Extra2 {

    /**
     * @param args the command line arguments
     */


   
 public static void main(String[] args) {
        AhorcadoService juego = new AhorcadoService();
        juego.juego();
        juego.longitud();
        
        while (juego.intentos() != 0) {
            System.out.println("----------------------------------------------");
            System.out.print("Ingrese una letra: ");
            char letra = leerCaracter();
            juego.buscar(letra);
            juego.encontradas(letra);
            System.out.println("Número de oportunidades restantes: " + juego.intentos());
        }
        
//        if (juego.juegoTerminado()) {
//            System.out.println("¡Felicitaciones! Ha encontrado la palabra.");
//        } else {
//            System.out.println("Lo sentimos, no hay más oportunidades.");
//        }
    }
    
    private static char leerCaracter() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        return input.charAt(0);
    }
}
    

