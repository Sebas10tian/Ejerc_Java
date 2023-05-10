/*Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para
organizar la información de cada curso. Para ello, crearemos una clase entidad llamada Curso,
cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde), 
precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán
los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:*/
package guia9_ejerc6_alumnos;

import curso.Curso;
import servicio.CursoServicio;


public class Guia9_Ejerc6_Alumnos {

    public static void main(String[] args) {
        CursoServicio cursoS = new CursoServicio();
        Curso c1 = cursoS.crearCurso();
        
        
        cursoS.calcularGananciaSemanal();
        
        
        
    }
    
}
