
package main;

import servicio.ServicioEstudiante;


public class MainSeba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   ServicioEstudiante miEstudiante = new ServicioEstudiante();
   
   miEstudiante.crearEstudiantes();
   miEstudiante.calcularPromedio();
   miEstudiante.mostrarPromedio();
   miEstudiante.compararNotas();
   miEstudiante.mostrarAlumnos();
  
   
    }
    
}
