/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.cadena;
import java.util.Scanner;
import servicio.cadenaServicio;


public class mainCadena {

 
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

        cadenaServicio cadenaS = new cadenaServicio();
        cadena cadena1 = cadenaS.leerFrase();
        
        
        System.out.println(cadena1.toString());
        
        cadenaS.contarVocales(cadena1);
        cadenaS.invertirFrase(cadena1);
        cadenaS.vecesRepetido(cadena1);
        
        
        System.out.println("Ingrese un caracter");
        String letra = leer.nextLine();
        
        cadenaS.reemplazarVocal(cadena1, letra);
        
        cadenaS.contiene(cadena1, letra);
        
    }
    
}
