/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_extra4_cuenta;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Guia6_Extra4_Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double saldo;
        String titular;
        
        System.out.println("Ingrese el nombre del Titular");
        titular= leer.next();
        System.out.println("Cargue el saldo que tiene la cuenta");
        saldo = leer.nextDouble();
        
        Cuenta cuenta = new Cuenta(saldo, titular);
        System.out.println("Desea retirar dinero? s/n");
        String opc = leer.next();
        
        switch(opc){
            case "s":
                case"S":
                    cuenta.retirarDinero();
                    break;
                default:
                    System.out.println("Hasta luego");
        }
        
        
    }
    
}
