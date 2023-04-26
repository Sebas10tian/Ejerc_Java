/*Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double).
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra,
el discriminante debe ser igual que 0.
 */
package servicio;

import entidad.Raiz;
import java.util.Scanner;

public class RaizServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Raiz raiz1 = new Raiz();

    public Raiz crearRaiz() {
        System.out.println("Ingrese el valor primer variable:");
        raiz1.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de la segunda variable:");
        raiz1.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de la tercer variable:");
        raiz1.setC(leer.nextDouble());

        return raiz1;

    }

    public static double getDiscriminante(Raiz raiz) {
        //(b^2)-4*a*c

        return Math.pow(raiz.getB(), 2) - (4 * raiz.getA()) * raiz.getC();
    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
    el discriminante debe ser mayor o igual que 0.
     */
    
    public static boolean tieneRaices(Raiz raiz){
    
        return (getDiscriminante(raiz)>0);
    }
      public static boolean tieneRaiz(Raiz raiz){
    
        return (getDiscriminante(raiz)==0);
    }
      /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
        Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se
      tenga una única solución posible.
        Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles
      soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan
      nuestros métodos y en caso de no existir solución, se mostrará un mensaje.*/
    
      
      public static void obtenerRaices(Raiz raiz){
      //(-b±√((b^2)-(4*a*c)))/(2*a)
          
      
      if (tieneRaices(raiz)) {
              double resul = Math.sqrt(getDiscriminante(raiz));
              double aux1 = (-raiz.getB()+-resul)/(2*raiz.getA());
              double aux2 = (+raiz.getB()+-resul)/(2*raiz.getA());
              
             System.out.println("El resultado es: "+aux1);
             System.out.println("El resultado es: "+aux2);
          }
      
      }
      
      public static void obtenerRaiz(Raiz raiz){
      
          if (tieneRaiz(raiz)) {
              double aux3 = -raiz.getB()/(2*raiz.getA());
              System.out.println("La unica raiz es: "+aux3);
              
          }
      }
      
      public static void calcular(Raiz raiz){
          if (tieneRaices(raiz)) {
              obtenerRaices(raiz);
              
          }else if (tieneRaiz(raiz)) {
              obtenerRaiz(raiz);
              
          }else{
              System.out.println("No hay ninguna solucion!!.");
          
          }
      
      
      }
    
}
