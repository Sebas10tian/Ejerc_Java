/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Juego {
    
    private int num;
    private int intentos;
    private int cantGanadas;
    private int num2;
    boolean verific= false;
    
    public void iniciarJuego (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de intentos deseada");
        intentos = leer.nextInt();
        System.out.println("Que numero desea que adivines?");
        num = leer.nextInt();
        
        System.out.println("Segundo jugador, adivine el numero secreto.");
        
        
       while(verific == false){
           System.out.println("Tiene "+(intentos)+ " intentos");
           num2= leer.nextInt();
           intentos --;
           if (num2>num) {
               System.out.println("Ingrese un numero mas chico");
               
           }else if (num2<num) {
               System.out.println("Ingrese un numero mas grande");
               
           }
           if (num == num2) {
               System.out.println("Adivinaste!!, en "+(intentos)+ " intentos");
               verific = true;
               break;
           }
           if (intentos ==0) {
               System.out.println("Perdio, no hay mas intentos.");
               break;
           }
       }
        
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getCantGanadas() {
        return cantGanadas;
    }

    public void setCantGanadas(int cantGanadas) {
        this.cantGanadas = cantGanadas;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean isVerific() {
        return verific;
    }

    public void setVerific(boolean verific) {
        this.verific = verific;
    }
    
}
