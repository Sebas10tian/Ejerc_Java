/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import curso.Curso;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class CursoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso c1 = new Curso();
    
    public void cargarAlumnos(Curso c1){
        String [] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno");
            alumnos[i]= leer.next();
            
        }
       c1.setAlumnos(alumnos);
        
    }
    
    /*Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después
    se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método
    cargarAlumnos() para asignarle valor al atributo alumnos
    */
    
    public Curso crearCurso(){
    
        System.out.println("Ingrese el nombre del curso:");
        c1.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por dia:");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias a la semana");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese turno (Mañana/Noche)");
        c1.setTurno(leer.next());
        System.out.println("Ingrese el costo de la hora");
        c1.setPrecioPorHora(leer.nextInt());
        
        cargarAlumnos(c1);
        return c1;
    }
    
    /*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso.
    Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la
    cantidad de días a la semana que se repite el encuentro.
    */
    
    public void calcularGananciaSemanal(){
    
        System.out.println("La ganancia semanal es de : $ "+ c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*c1.getAlumnos().length*c1.getCantidadDiasPorSemana());
    
    }
    
}
