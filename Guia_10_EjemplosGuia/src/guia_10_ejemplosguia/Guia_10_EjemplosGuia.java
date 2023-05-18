/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_ejemplosguia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author Chiva
 */
public class Guia_10_EjemplosGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        
        
// Correccion de errores  //////////////////
//        HashMap<Integer, String> personas = new HashMap();
//        int a =0;
//        String n1 = "Albus";
//        int b = 1;
//        String n2 = "Severus";
//        personas.put(a,n1);
//        personas.put(b,n2);

// Correccion de errores //////
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
////////////////////////////////////////////////////////////////

            // Listas
            ArrayList<Integer> numerosA = new ArrayList();
            int x = 20;
            int m = 20;
            int c = 30;
            int d = 10;
            int s = 30;
            numerosA.add(x);
            numerosA.add(s);
            numerosA.add(c);
            numerosA.add(d);
            numerosA.add(m);
            //numerosA.remove(2);
            //Conjuntos
            HashSet<Integer> numerosB = new HashSet();
            Integer y = 20;
            Integer r = 20;
            Integer u = 20;
            Integer o = 20;
            Integer p = 20;
            numerosB.add(y);
            numerosB.add(r);
            numerosB.add(u);
            numerosB.add(o);
            numerosB.add(p);
            numerosB.remove(r);

            //Mapas ///////////////////////////////////////////
            HashMap<Integer, String> alumnos = new HashMap();
            int dni = 34567851;
            String nombreAlumno = "Pepe";
            int dni2 = 34567251;
            String nombreAlumno2 = "Juan";
            int dni3 = 34577851;
            String nombreAlumno3 = "Jose";
            int dni4 = 33567851;
            String nombreAlumno4 = "Anabel";
            int dni5 = 31567851;
            String nombreAlumno5 = "Gabi";

            alumnos.put(dni, nombreAlumno);
            alumnos.put(dni2, nombreAlumno2);
            alumnos.put(dni3, nombreAlumno3);
            alumnos.put(dni4, nombreAlumno4);
            alumnos.put(dni5, nombreAlumno5);

            // remove(llave): Este método remueve la primera aparición de la llave de un elemento a borrar en
            // un mapa.
            alumnos.remove(34567251);

            System.out.println("Los numeros de la Lista A son:");
            for (Integer aux : numerosA) {
                System.out.println(aux);

            }
            System.out.println("Cantidad " + numerosA.size());

            // este es el for para mostrar los mapas con Map.Entry. //////////////////////////////
            System.out.println("Los alumnos del mapa, alumnos son:");
            for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
                System.out.println("DNI: " + entry.getKey()
                        + ", Nombre: " + entry.getValue());
            }
            System.out.println("Cantidad " + alumnos.size());
        }*/
        ArrayList<Libro> libros = new ArrayList();
        Libro libro = new Libro();
        libros.add(libro);
        
        String titulo = "Aves";
        
      
        

    }

}
