//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
//atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual
//y el interés anual que se aplica a la cuenta (porcentaje). Las operaciones
//asociadas a dicha clase son:
//• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//• Agregar los métodos getters y setters correspondientes
//• Metodo para crear un objeto Cuenta, pidendole los datos al usuario.
//• Método ingresar(doublé ingreso): permitirá ingresar una cantidad en la cuenta
//bancaria.
//• Método retirar(doublé retiro): permitirá sacar una cantidad de la cuenta (si hay
//saldo).
//• Método extraccionRapida(doublé extraccion): le permitirá sacar solo un 20% de
//lo que tiene como saldo. Validar que el usuario no saque más del 20%.
//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
package Ejercicio07;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){//uso metodo main para pedir datos de cuenta
        
        CuentaBCRA cuenta = new CuentaBCRA();
        
        Scanner scan = new Scanner(System.in);
        String op;
        
        System.out.println("Por favor, a continuacion ingrese los datos del usuario.");
        System.out.println("\n");
        System.out.println("--------------------------");
        System.out.println("Ingresar numero de cuenta.");
        long nºcuenta = scan.nextInt();
        cuenta.setNºcuenta(nºcuenta);
        System.out.println("Ingresa tu DNI.");
        int dni = scan.nextInt();
        cuenta.setDni(dni);
        System.out.println("--------------------------");
        System.out.println("\n");
        
        System.out.println("Ingrese al menu y elija una opcion.");
        System.out.println("A- Ingresar dinero.");
        System.out.println("B- Retirar dinero.");
        System.out.println("C- Extraccion rapida.");
        System.out.println("D- Consultar saldo.");
        System.out.println("E- Consultar datos.");
        op = scan.next();
        
        switch(op){
            case "A":
                cuenta.Ingresar();
                break;
            case "B":
                cuenta.Retirar();
                break;
            case "C":
                cuenta.extraccionRapida();
                break;
            case "D":
                cuenta.consultarSaldo();
                break;
            case "E":
                cuenta.consultarDatos();
                break;
        }
    }
}
