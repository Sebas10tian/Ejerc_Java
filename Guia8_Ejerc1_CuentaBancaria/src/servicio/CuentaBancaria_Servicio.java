/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancaria_Servicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    public CuentaBancaria crearCuenta(){
    CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Ingrese numero de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("Ingrese saldo de cuenta");
        cuenta.setsaldoActual(leer.nextDouble());
    
        return cuenta;
    }
    
    public void ingresar(CuentaBancaria cuenta) {

        System.out.println("Ingrese el dinero que desea depositar");
        double ingreso = leer.nextDouble();
        if (ingreso > 0) {
            cuenta.setsaldoActual(ingreso + cuenta.getsaldoActual());
        } else {
            System.out.println("El dinero que quiere ingresar no es valido ");

        }
    }

    public void retirar(CuentaBancaria cuenta) {
        System.out.println("Ingrese el dinero que desea retirar");
        double retiro = leer.nextDouble();
        if (retiro >= cuenta.getsaldoActual()) {
            System.out.println("No alcanzo el saldo, se retiro " + cuenta.getsaldoActual());
            cuenta.setsaldoActual(0);
        } else {
            System.out.println("Se retiro" + retiro);
            cuenta.setsaldoActual(cuenta.getsaldoActual() - retiro);

        }

    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        
        System.out.println("Se extrajo"+ cuenta.getsaldoActual()*0.2);
        cuenta.setsaldoActual(cuenta.getsaldoActual()*0.8);
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        
        System.out.println("Su saldo es: "+cuenta.getsaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta){
        
        System.out.println("El Numero de cuenta es: "+cuenta.getNumeroCuenta());
        System.out.println("El DNI es: "+cuenta.getDniCliente());
        System.out.println("El saldo actual es: "+cuenta.getsaldoActual());
    }
}
    

