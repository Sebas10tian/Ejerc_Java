/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class ServicioPerros {

    ArrayList<String> listaPerros = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearRaza() {

        String resp = "x";

        Boolean salir = false;

        while (!salir) {

            System.out.println("Ingrese la raza del perro:");
            listaPerros.add(leer.next());

            System.out.println("Desea agregar otra raza?. s/n");
            resp = leer.next();

            if (resp.equalsIgnoreCase("n")) {
                salir = true;
            }
        }
        MostrarLista();

    }

    public void MostrarLista() {
        System.out.println("Las razas creadas son: ");
        for (int i = 0; i < listaPerros.size(); i++) {
            System.out.println(listaPerros.get(i));
        }

    }
    
    public void eliminarPerro(){
        
        Iterator<String> it = listaPerros.iterator();
        System.out.println("Que perro desea eliminar?");
        String eliminar = leer.next();
        
        while(it.hasNext())
            if (it.next().equals(eliminar)) {
                it.remove();
                break;
            }else {
            System.out.println("El perrito no se encuentra en la lista, se salvooo");
            //System.out.println(listaPerros);
            }
        //System.out.println("Los perros son:");
        MostrarLista();
        
    }
}
