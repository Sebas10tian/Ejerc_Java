/*Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);*/
package servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {

        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el anio");
        int anio = leer.nextInt();
        Date nacimiento = new Date(anio - 1900, mes - 1, dia);
        return nacimiento;
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    //Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra
    //(edad del usuario).
    public void diferencia(Date nacimiento, Date fechaActual) {

        //Date fecha1 = x
        System.out.println("La edad del usuario es: " + (fechaActual.getYear()- nacimiento.getYear()));

    }
}
