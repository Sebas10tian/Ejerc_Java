/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)* and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Chiva
 */
public class Paises {
    
    private String pais;

    public Paises(String pais) {
        this.pais = pais;
    }

    public Paises() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Paises{" + "pais=" + pais + '}';
    }
    
}
