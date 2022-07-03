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

public class CuentaBCRA {

    private long nºcuenta;
    private int dni;
    private double saldo= 186704.48;
    public double interes = 0.12;
    private double saldoF;
    
    Scanner scan = new Scanner(System.in);

    public CuentaBCRA() {
    }

    public CuentaBCRA(double saldo) {
        this.saldo = saldo;
    }

    public CuentaBCRA(long nºcuenta, int dni) {
        this.nºcuenta = nºcuenta;
        this.dni = dni;
    }

    public long getNºcuenta() {
        return nºcuenta;
    }

    public void setNºcuenta(long nºcuenta) {
        this.nºcuenta = nºcuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void Ingresar() {
        double ingreso;
        System.out.println("¿Cuanto queres depositar en la cuenta?");
        ingreso = scan.nextInt();
        saldoF = ingreso + saldo;
        System.out.println("Saldo actual: "+saldoF);
    }
    
    public void Retirar(){
        double retiro;
        System.out.println("¿Cuanto queres retirar de la cuenta?");
        retiro = scan.nextInt();
        if (retiro <= saldo){
            saldoF = saldo - retiro;
            System.out.println("Saldo actual: "+saldoF);
        }else{
            System.out.println("Saldo a retirar INSUFICIENTE.");
        }        
    }
    
    public void extraccionRapida(){
        double extraccion;
        System.out.println("Recuerde que solo puede extraer el 20% del saldo");
        extraccion = scan.nextInt();
        if (extraccion <= saldo * 0.2){
            System.out.println("El monto ingresado es correcto");
            saldoF = saldo - extraccion;
        }else{
            System.out.println("Saldo incorrecto, imposible de realizar la operacion");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo es "+saldo);
    }
    
    public void consultarDatos(){
        System.out.println("Datos de la cuenta:");
        System.out.println("Nombre: Cristian Silvestro.");
        System.out.println("DNI: "+getDni());
        System.out.println("CBU: "+getNºcuenta());
    }
    
    

}
