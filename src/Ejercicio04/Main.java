//Crear una clase llamada Operacion que tenga como atributos privados el
//numero1 y numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Métodos get y set.
//c) Método para crear un objeto Operacion.
//d) Métodos para sumar, restar, multiplicar y dividir los números (atributos) y que
//devuelven el resultado al main.
package Ejercicio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Operacion op1 = new Operacion(10, 5);

//        int sumar = op1.Sumar(); puedo crear mas variables y almacenar lo que se devuelve por las dudas se necesite a futuro.
        op1.Sumar();
        op1.Restar();
        op1.Multiplicar();
        op1.Dividir();

        System.out.println("Suma= " + op1.Sumar());
        System.out.println("Resta= " + op1.Restar());
        System.out.println("Multiplicacion= " + op1.Multiplicar());
        System.out.println("Dividir= " + op1.Dividir());

    }

}
