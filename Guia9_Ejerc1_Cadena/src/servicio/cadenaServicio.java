/*Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud.
Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con frase como atributo
debe setear la longitud de la frase de manera automática. Crear una clase CadenaServicio en el paquete servicios que implemente
los siguientes métodos:*/
package servicio;

import entidad.cadena;
import java.util.Scanner;

public class cadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public cadena leerFrase() {

        cadena objetoCadena = new cadena();
        System.out.println("ingrese una frase");
        objetoCadena.setFrase(leer.nextLine());
        objetoCadena.setLongitud(objetoCadena.getFrase().length());

        return objetoCadena;
    }

    public void contarVocales(cadena objetoCadena) {
        int cont = 0;

        for (int i = 0; i < objetoCadena.getLongitud(); i++) {
            if ((objetoCadena.getFrase().charAt(i) == 'a') || (objetoCadena.getFrase().charAt(i) == 'e')
                    || (objetoCadena.getFrase().charAt(i) == 'i') || (objetoCadena.getFrase().charAt(i) == 'o')
                    || (objetoCadena.getFrase().charAt(i) == 'u')) {
                cont = cont + 1;
            }

        }
        System.out.println("La cantidad de vocales es: " + cont);
    }

    public void invertirFrase(cadena objetoCadena) {

        String invertida = "";

        for (int i = objetoCadena.getLongitud() - 1; i > 0; i--) {
            invertida += objetoCadena.getFrase().charAt(i);
        }
        System.out.println("La frase invertida es://////");
        System.out.println(invertida);

    }

    public void vecesRepetido(cadena objetoCadena) {

        System.out.println("Ingrese el caracter a buscar");
        char caracter = leer.next().charAt(0);

        int cont = 0;

        for (int i = 0; i < objetoCadena.getLongitud(); i++) {
            if (objetoCadena.getFrase().charAt(i) == caracter) {
                cont = cont + 1;
            }
        }
        System.out.println("La cantidad de veces que se repite : " + caracter + " es " + cont);

    }

    public void compararLongitud(cadena objetoCadena) {

        System.out.println("Ingrese una nueva frase:");
        String nuevaFrase = leer.next();

        int longNuevaFrase = nuevaFrase.length();

        if (objetoCadena.getLongitud() == longNuevaFrase) {
            System.out.println("Las dos frases tienen la misma longitud");

        }else{
            System.out.println("Las frases son diferentes");
        }

    }

    public void unirFrase(cadena objetoCadena) {

        System.out.println("Ingrese nueva frase");
        String NewFrase = leer.next();
        System.out.println(objetoCadena.getFrase() + NewFrase);

    }

    public void reemplazarVocal(cadena objetoCadena, String letra){
        
        String cadenamod=objetoCadena.getFrase();
        cadenamod = cadenamod.replace('a', letra.charAt(0));
        cadenamod = cadenamod.replace('A', letra.charAt(0));
        System.out.println("Frase original: "+objetoCadena.getFrase());
        System.out.println("Frase modificada: "+cadenamod);
        
    }
        
        public boolean contiene(cadena objetoCadena, String letra){
        
            boolean contiene = true;
            
            System.out.println("Ingrese el caracter a encontrar");
            
            return objetoCadena.getFrase().contains(letra);
        
    
    }
}

