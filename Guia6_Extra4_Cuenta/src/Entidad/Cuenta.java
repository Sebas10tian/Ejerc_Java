/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Cuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double saldo;
    private String titular;

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    public void retirarDinero(){
        System.out.println("Su saldo es de: "+saldo);
        System.out.println("Digite que cantidad de diner desea retirar");
        double retiro = leer.nextDouble();
        if (retiro<= saldo) {
            saldo=saldo-retiro;
            System.out.println("Su saldo es de: "+saldo);
        }else{
            System.out.println("ERROR: no puede retirar mas dinero");
    }
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
}
