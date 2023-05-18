
package main;

import entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Empleado [] empleados = new Empleado[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el nombre del empleado");
            String nombre = leer.next();
            System.out.println("Ingrese el salario del empleado");
            double salario = leer.nextDouble();
            empleados[i]= new Empleado(nombre,salario);
            
        }
        double sumaSalarios =0;
        for (int i = 0; i < 6; i++) {
            sumaSalarios+= empleados[i].getSalario();
        }
        double promedioSalarios= sumaSalarios/empleados.length;
        System.out.println("El promedio de todos los salarios es: "+ promedioSalarios);
        int contador =0;
         for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario()>promedioSalarios) {
                contador++;
            }
        }
        
        String[]nombreEmpleados = new String[contador];
        contador =0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario()>promedioSalarios) {
                nombreEmpleados[contador]=empleados[i].getNombre();
                contador++;
            }
        }
        
        for (int i = 0; i < nombreEmpleados.length; i++) {
            System.out.println("El empleado "+nombreEmpleados[i]+" supera el promedio salario");
            
        }
    }
    
    
}
