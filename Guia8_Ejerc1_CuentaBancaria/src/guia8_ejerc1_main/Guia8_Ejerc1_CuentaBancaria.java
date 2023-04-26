
package guia8_ejerc1_main;

import entidad.CuentaBancaria;
import java.util.Scanner;
import servicio.CuentaBancaria_Servicio;


public class Guia8_Ejerc1_CuentaBancaria {

  
    public static void main(String[] args) {
        // Instanciamos la cuenta servicios
         Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CuentaBancaria_Servicio cbs = new CuentaBancaria_Servicio();
        CuentaBancaria cuenta1 = cbs.crearCuenta();
        
        int opc=0;
        do {
        System.out.println("l- Ingresar");
        System.out.println("2- Retirar");
        System.out.println("3- Extraccion rapida");
        System.out.println("4- Consultar saldo");
        System.out.println("5- Consultar datos");
        System.out.println("6- Salir");
        
        opc = leer.nextInt();
        
        
            switch (opc) {
                case 1:
                    cbs.ingresar(cuenta1);
                    break;
                case 2:
                    cbs.retirar(cuenta1);
                    break;
                case 3:
                    cbs.extraccionRapida(cuenta1);
                    break;
                case 4:
                    cbs.consultarSaldo(cuenta1);
                    break;
                case 5:
                    cbs.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Vuelva pronto");
                    break;
            }
        } while (opc != 6);

    }
}
