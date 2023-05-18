/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
 */
package servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class PaisesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> paises = new HashSet<>();

    public void crearPais() {

        Boolean resp = true;

        do {
            System.out.println("Ingrese el nombre del Pais.");
            String nombre = leer.next();
            paises.add(nombre);

            System.out.println("Desea agregar otro Pais?. S/N");
            String agregar = leer.next();

            if (agregar.equalsIgnoreCase("N")) {
                resp = false;
            }

        } while (resp);

    }

    public void mostrar() {

        System.out.println(paises.toString());

    }

    public void ordenar() {

        System.out.println("Estos son los Paises ordenados. ------");
        ArrayList<String> paisOrdenado = new ArrayList(paises);
        Collections.sort(paisOrdenado);
        
            System.out.println(paisOrdenado);
      
    }

}
