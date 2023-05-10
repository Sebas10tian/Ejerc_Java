/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class PersonaServicio {
    
    Persona per1 = new Persona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        
        System.out.println("Ingrese el nombre de la persona:");
        per1.setNombre(leer.next());
        System.out.println("Ingrese el anio");
        int anio = leer.nextInt();
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes= leer.nextInt();
        
        Date n = new Date(anio-1900, mes-1, dia);
        
        per1.setFechaN(n);
        
        return per1;
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    
    public int calcularEdad(Persona per1){
        Date fechaActual = new Date();
        Date fecha2 = per1.getFechaN();
        int difAnios = fechaActual.getYear()-fecha2.getYear();
        int difMes = fechaActual.getMonth()-fecha2.getMonth();
        int difDia = fechaActual.getDate()-fecha2.getDate();
        if (difMes < 0 || (difMes == 0 && difDia<0)) {
            return difAnios-1;
        }else{
        return difAnios;
        }
       
    }
    
    public boolean menorQue(Persona per1){
        System.out.println("Ingrese una edad para calcular:");
        int numConsultar = leer.nextInt();
        
        if (calcularEdad(per1)<numConsultar) {
            return true;
        }else{
        return false;
        }
        
    }
    //Método mostrarPersona que muestra la información de la persona deseada.
    
    public void mostrarPersona(Persona per1){
        System.out.println("Su nombre es: "+ per1.getNombre());
        System.out.println("La fecha de naciemiento es: "+ per1.getFechaN().getDate()+"/"+per1.getFechaN().getMonth()+"/"+per1.getFechaN().getYear());
        System.out.println("La edad de la persona es: "+calcularEdad(per1));
        boolean edad1 = menorQue(per1);
        
        if (edad1) {
            System.out.println("La persona es menor");
           
        }else{
        System.out.println("Es mayor");
        }
    }
}
