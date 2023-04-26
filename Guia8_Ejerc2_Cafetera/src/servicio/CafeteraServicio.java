/*Crear clase CafeteraServicio en el paquete
Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza
y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y
de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la
cafetera la cantidad de café indicada.

 */
package servicio;

import entidad.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
private Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
public Cafetera llenarCafetera(){
      
      Cafetera cafetera = new Cafetera();
      cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
      
      return cafetera;
  }
  
  public void servirTaza(Cafetera cafetera){
  
      int taza=0;
      System.out.println("Ingrese el tamaño de la taza");
      taza = leer.nextInt();
      if (taza>=cafetera.getCantidadActual()) {
          System.out.println("No alcanza para llenar la taza, solo pusimos " + cafetera.getCantidadActual());
          
      }else{
          System.out.println("Se lleno con , " + taza+ "cc.");
          cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
      }
  }
  public void vaciarCafereta(Cafetera cafetera){
      
      cafetera.setCantidadActual(0);
      System.out.println("La cafetera esta vacia !!!");
      
      }
         
  public void agregarCafe(Cafetera cafetera){
      System.out.println("Que cantidad de cafe desea agregar?");
      int agregar = leer.nextInt();
      
      if (cafetera.getCantidadActual()< cafetera.getCapacidadMaxima()) {
          cafetera.setCantidadActual(agregar + cafetera.getCantidadActual());
          
      }else{
          System.out.println("La cafetera esta llena.");
      }
  }
    
}
