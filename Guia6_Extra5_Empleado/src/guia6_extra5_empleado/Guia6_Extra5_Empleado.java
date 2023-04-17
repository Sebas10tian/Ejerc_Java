/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_extra5_empleado;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Guia6_Extra5_Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String nombre;
        int edad;
        double salario;
        
        System.out.println("Ingrese el nombre del Empleado:");
        nombre = leer.next();
        System.out.println("Ingrese la Edad");
        edad = leer.nextInt();
        System.out.println("Ingrese el Saladio");
        salario = leer.nextDouble();
        
        Empleado juan = new Empleado(nombre,edad, salario );
        
        juan.calcular_aumento();
    }
    
}
