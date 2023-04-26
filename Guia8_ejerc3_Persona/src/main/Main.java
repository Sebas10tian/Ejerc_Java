/*

 */
package main;

import entidades.Persona;
import java.util.Scanner;
import servicios.PersonaServicio;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        // Instanciar Persona servicio
        PersonaServicio ps = new PersonaServicio();
        Persona[] persona = new Persona[4];
        int[] imc = new int[4];
        boolean[] mayores = new boolean[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1));
            persona[i] = ps.crearPersona();
            imc[i] = ps.calcularIMC(persona[i]);
            mayores[i] = ps.esMayorDeEdad(persona[i]);
            
        }
        ps.porcentajeIMC(imc);
        ps.porcentajeEdad(mayores);
    }

}
