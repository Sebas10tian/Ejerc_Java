/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadoService;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class AhorcadoService {
   private char[] palabra;
    private boolean[] encontradas;
    public char[] letraEncontrada;
    private int oportunidades;

    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra a buscar:");
        String palabraStr = scanner.nextLine();
        palabra = palabraStr.toCharArray();
        encontradas = new boolean[palabra.length];
        letraEncontrada = new char [palabra.length];
        Arrays.fill(encontradas, false);
        Arrays.fill(letraEncontrada,'x');

        System.out.println("Ingrese la cantidad de oportunidades máximas:");
        oportunidades = scanner.nextInt();

        System.out.println("El juego ha sido creado.");
        mostrarEstado();
    }

    public void buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontradas[i] = true;
                letraEncontrada[i] = letra;
                encontrada = true;
            }
        }
        if (encontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
            oportunidades--;
        }
        mostrarEstado();
    }

    public void encontradas(char letra) {
        int encontradasCount = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra && encontradas[i]) {
                encontradasCount++;
            }
        }
        int faltantesCount = palabra.length - encontradasCount;
        System.out.println("Número de letras (encontradas, faltantes): (" + encontradasCount + "," + faltantesCount + ")");
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + oportunidades);
    }

    public void juego() {
        crearJuego();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una letra:");
            char letra = scanner.next().charAt(0);
            buscar(letra);
            encontradas(letra);
            intentos();

//            if (Arrays.equals(char palabra, char letraEncontrada)) {
//                System.out.println("¡Felicidades! Has encontrado la palabra.");
//                break;
//            }else (oportunidades <= 0) {
//                System.out.println("Lo sentimos, no hay más oportunidades.");
//                break;
//            }
        }
    }

    private void mostrarEstado() {
        for (int i = 0; i < palabra.length; i++) {
            if (encontradas[i]) {
                System.out.print(palabra[i] + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
} 

