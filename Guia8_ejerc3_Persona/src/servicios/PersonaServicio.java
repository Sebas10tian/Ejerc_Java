/*
 nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        //Instanciar persona
        Persona persona = new Persona();
        System.out.println("- Nombre de la persona");
        persona.setNombre(leer.next());
        System.out.println("- Edad");
        persona.setEdad(leer.nextInt());
        System.out.println("- Sexo, ‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro");
        persona.setSexo(leer.next());
        System.out.println("- Peso: ");
        persona.setPeso(leer.nextDouble());
        System.out.println("- Altura: ");
        persona.setAltura(leer.nextDouble());
        System.out.println("//////////////////////////////");

        return persona;

    }

    public boolean esMayorDeEdad(Persona nombre) {

        boolean mayor = false;

        if (nombre.getEdad() >= 18) {
            mayor = true;

        }

        return mayor;
    }

    public int calcularIMC(Persona nombre) {
        int imc = (int) (nombre.getPeso() / (Math.pow(nombre.getAltura(), 2)));
        if (imc < 20) {
            //System.out.println("Esta por debajo de su peso ideal");
            return -1;
        } else if (imc <= 25) {
            //System.out.println("Peso ideal");
            return 0;
        } else {
            //System.out.println("Persona con sobrepeso");
            return 1;
        }
    }

    public void porcentajeIMC(int[] imc) {
        double bajo = 0;
        double ideal = 0;
        double encima = 0;
        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:
                    encima++;
                    break;
            }
        }
        System.out.println(bajo / 4 * 100 + "% peso bajo.");
        System.out.println(ideal / 4 * 100 + "% peso ideal.");
        System.out.println(encima / 4 * 100 + "% sobrepeso.");
    }

    public void porcentajeEdad(boolean[] edades) {
        double mayores = 0;
        double menores = 0;
        for (int i = 0; i < 4; i++) {
            if (edades[i]) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("El porcentaje de mayores de edad es del " + mayores / 4 * 100 + "% y el porcentaje de menores es de " + menores / 4 * 100 + "%");
    }
}
