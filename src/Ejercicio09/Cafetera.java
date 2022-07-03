//Programa Nespresso. Desarrolle una clase Cafetera con los atributos
//capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
//y cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente,
//al menos, los siguientes métodos:
//• Constructor predeterminado o vacío: establece la capacidad máxima en 1000 (c.c.) y
//la actual en cero (cafetera vacía).
//• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de
//café igual a la capacidad máxima.
//• Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
//mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
//• Métodos getters y setters.
//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
package Ejercicio09;

import java.util.Scanner;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;
    private int taza;
    Scanner scan = new Scanner(System.in);

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = this.capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        if (cantidadActual > capacidadMaxima) {
            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = this.capacidadMaxima;
        } else {
            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = cantidadActual;
        }
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera tiene " + cantidadActual + " c.c");
    }

    public void servirTaza() {
        System.out.println("CAFE en cc: chico 240 - mediano 300 - grande 500.");
        int taza = scan.nextInt();
        this.taza = taza;
        int servido;
        if (taza < cantidadActual) {
            servido = taza;
            System.out.println("Se ha servido " + servido);
        } else {
            if (taza > cantidadActual) {
                servido = taza;
                System.out.println("No se ha llenado la taza.");
            }
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera no tiene cafe.");
    }

    public void agregarCafe() {
        System.out.println("Cantidad actual " + (cantidadActual - taza));
        System.out.println("Ingrese la cantidad de cafe que quiere agregar.");
        int Agregar = scan.nextInt();
        if ((Agregar + cantidadActual) == capacidadMaxima) {
            System.out.println("La cafetera se ha llenado");
        } else {
            if ((Agregar + cantidadActual) < capacidadMaxima) {
                System.out.println("Falta cafe,hay " + (Agregar + cantidadActual));
            }
        }
    }
}
