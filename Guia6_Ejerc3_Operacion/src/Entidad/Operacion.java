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
public class Operacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese el primer numero:");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2 = leer.nextInt();
    }
    
    public int suma(){
        
        int suma = numero1 + numero2;
        
        return suma;
    }
    
    public int resta (){
            int resta = numero1-numero2;
            return resta;
    }
    
    public int multiplicacion (){
        int resultado;
        
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("ERROR: No se puede multiplicar por 0");
           resultado = 0;
            return resultado;
        }else{
            resultado = numero1*numero2;
            return resultado;
        }
    }
    
       public double dividir (){
        int resulDividir;
        
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("ERROR: No se puede dividir por 0");
           resulDividir = 0;
            return resulDividir;
        }else{
            resulDividir = numero1/numero2;
            return resulDividir;
        }
    }
}
