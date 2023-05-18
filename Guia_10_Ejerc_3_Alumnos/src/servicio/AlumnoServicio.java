/*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
* and open the template in the editor.
 */
package servicio;

import entidad.Alumnos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class AlumnoServicio {

    Boolean resp = true;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumnos> alumno = new ArrayList();

    public void crearAlumno() {

        do {
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = leer.next();
            ArrayList<Integer> notas = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota, " + (i + 1));
                notas.add(leer.nextInt());

            }
            System.out.println("Desea crear otro alumno?, S/N");
            String crear = leer.next();
            alumno.add(new Alumnos(nombre, notas)); //  Creando el Alumno con su info

            if (crear.equalsIgnoreCase("N")) {
                resp = false;
            }
        } while (resp);

    }

    /*El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
    
     */
    public double notaFinal() {
        System.out.println("Que alumno desea buscar?.");
        String buscar = leer.next();
        double promedio = 0;
        for (Alumnos alumnos : alumno) {
            if (alumnos.getNombre().equalsIgnoreCase(buscar)) {
                List<Integer> misNotas = alumnos.getNota();
                double sumatoria = 0;
                for (Integer misNota : misNotas) {
                    sumatoria += misNota;
                }
                promedio = sumatoria / misNotas.size();

            }
        }
        return promedio;
    }

}
