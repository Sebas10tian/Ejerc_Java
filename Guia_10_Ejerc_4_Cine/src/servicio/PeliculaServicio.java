/*En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:*/
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public void crearPelicula() {

        Boolean resp = true;

        do {
            System.out.println("Cual es el nombre de la pelicula?");
            String titulo = leer.next();
            System.out.println("Quien es el director de la peli?");
            String director = leer.next();
            System.out.println("Cuanto dura la pelicula?");
            Integer duracion = leer.nextInt();
            peliculas.add(new Pelicula(titulo, director, duracion));

            System.out.println("Desea agregar otra Pelicula? S/N");
            String desea = leer.next();

            if (desea.equalsIgnoreCase("N")) {
                resp = false;
            }

        } while (resp);

    }

    public void mostrarPeliculas() {

        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula.getTitulo());
        });
    }

    public void mayorHora() {

        System.out.println("Estas son las peliculas que duran mas de una hora --------------");
        for (Pelicula pelicula : peliculas) {

            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.getTitulo());
            }
        }
    }

    public void ordenarMenor() {
        // Ordenamos las Peliculas de Menor a Mayor //////////////////////
        System.out.println("Estas son las Peliculas ordenadas de Menor a Mayor. ------");
        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion));

        mostrarPeliculas();
    }

    public void ordenarMayor() {
        // Ordenamos las Peliculas de Mayor a Menor  //////////////////////
        System.out.println("Estas son las Peliculas ordenadas de Mayor a Menor. ------");
        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion).reversed());

        mostrarPeliculas();
    }

    public void ordenarAlfab() {
        // Ordenamos las Peliculas de Menor a Mayor //////////////////////
        System.out.println("Estas son las Peliculas ordenadas Alfabeticamente. ------");
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));

        mostrarPeliculas();
    }

    public void ordenarDirector() {
        // Ordenamos las Peliculas segun Director //////////////////////
        System.out.println("Estas son las Peliculas ordenadas Segun Director. ------");
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));

        mostrarPeliculas();
    }

}
