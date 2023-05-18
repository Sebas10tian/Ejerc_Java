/*Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final.
La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos y
saber qué alumnos han recibido una nota por encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante,
sus atributos van a ser nombre y nota (representando la nota obtenida en el final). 


La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante,
usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
Objeto nombreVector[] = new Objeto[];
 */
package servicio;

import entidad.Estudiante;
import java.util.Scanner;

public class ServicioEstudiante {

    Estudiante[] vectorEstudiante = new Estudiante[3];

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante[] crearEstudiantes() {

        String nombre;
        double nota;

        for (int i = 0; i < vectorEstudiante.length; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            nombre = leer.next();
            System.out.println("Ingrese la nota");
            nota = leer.nextInt();

            vectorEstudiante[i] = new Estudiante(nombre, nota);
        }
        return vectorEstudiante;
    }

    // Calcular el promedio de notas
    public double calcularPromedio() {
        double sumaNotas = 0;
        double promedioNotas = 0;

        for (int i = 0; i < vectorEstudiante.length; i++) {
            sumaNotas += vectorEstudiante[i].getNota();
        }
        promedioNotas = sumaNotas / vectorEstudiante.length;

        return promedioNotas;
    }

    //Mostramos el promedio
    public void mostrarPromedio() {

        System.out.println("El promedio de notas es: " + calcularPromedio());
    }

    //Retornar otro arreglo con los nombre de los alumnos que recibieron una
    //nota mayor al promedio del curso
    
    public String[] compararNotas() {
        // creamos un contador para saber cuantos alumnos superaron el promedio
        int conNota = 0;

        for (int i = 0; i < vectorEstudiante.length; i++) {
            if (calcularPromedio() < vectorEstudiante[i].getNota()) {
                conNota++;
            }
        }
// creamos el vector para los alumnos que superan el promedio
        String[] nombreAlumnos = new String[conNota];
        int z = 0;
        for (int i = 0; i < vectorEstudiante.length; i++) {
            if (vectorEstudiante[i].getNota() > calcularPromedio()) {
                nombreAlumnos[z] = vectorEstudiante[i].getNombre();
                z++;
            }
        }
        return nombreAlumnos;

    }
    //Por último, deberemos mostrar todos los estudiantes con una nota
//mayor al promedio.
    
    public void mostrarAlumnos(){
    String[] nombreAlumnos = compararNotas();
    
        for (int i = 0; i < nombreAlumnos.length; i++) {
            System.out.println("El alumno que supera el promedio es: "+ nombreAlumnos[i]);
            
        }
    
    
    
    }

}
