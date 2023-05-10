/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.ParDeNumeros;

/**
 *
 * @author Chiva
 */
public class ParDeNumerosServicio {
    
    
    
    
   public static void mostrarValores (ParDeNumeros numero) {
      
      // num1= Math.random();
     //   num2= Math.random();
       //ParDeNumerosServicio numeroS = new ParDeNumerosServicio();
       
            System.out.println("El primer numero es: " + numero.getNum1());
            System.out.println("El Segundo numero es: " + numero.getNum2());
    
    }
   
   public static double devolverMayor(ParDeNumeros numero){
       
       if (numero.getNum1()> numero.getNum2()) {
           return numero.getNum1();
       }else{
       return numero.getNum2();
       }
   }
   
     public static double devolverMenor(ParDeNumeros numero){
       
       if (numero.getNum1()< numero.getNum2()) {
           return numero.getNum1();
       }else{
       return numero.getNum2();
       }
   }
   
   public static void calcularPotencia(ParDeNumeros numero){
       
       double mayor = Math.round((devolverMayor(numero)*100)/100);
       double menor = Math.round((devolverMenor(numero)*100)/100);
       System.out.println("La potencia es:" + (Math.pow(mayor, menor)));
   }
   
   public static void calcularRaiz(ParDeNumeros numero){
       
       System.out.println("La raiz es: " + Math.sqrt(devolverMenor(numero)));
   }
}
