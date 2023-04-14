/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_ejerc2.circunferencia;

import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Circunferencia {
    
   private double radio;

    public Circunferencia() {
    }

    private Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio del objeto");
        this.radio = (leer.nextDouble());
    }

    public void area() {
        double area = Math.PI * (Math.pow(this.radio, 2));
        System.out.println("El área del círculo es: " + area);
    }

    public void perimetro() {
        double perimetro = Math.PI * this.radio * 2;
        System.out.println("El Perimetro del círculo es: " + perimetro);
    }

}

