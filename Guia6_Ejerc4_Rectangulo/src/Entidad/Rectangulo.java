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
public class Rectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int base;
    private int altura;

    public Rectangulo() {
        
    }
    
    public void crearRectangulo(){
        System.out.println("Ingrese la Base del Rectangulo:");
        base = leer.nextInt();
        System.out.println("Ingrese la Altura del Rectangulo:");
        altura = leer.nextInt();
    }
    public void calcSuperficie(){
        System.out.println("La superficie es: "+ base*altura);
    }
    public void calcPerimetro(){
        System.out.println("El Perimetro es: "+ (base+altura)*2);
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void dibujar(){
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
}
