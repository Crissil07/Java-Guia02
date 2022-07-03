//Crear una clase llamada Operacion que tenga como atributos privados el
//numero1 y numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Métodos get y set.
//c) Método para crear un objeto Operacion.
//d) Métodos para sumar, restar, multiplicar y dividir los números (atributos) y que
//devuelven el resultado al main.
package Ejercicio04;

public class Operacion {

    private int num1, num2;

    public Operacion() {

    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }
    
    public int Sumar(){ //pongo int porque tengo que devolver un valor para ser impreso, de lo contrario lo creo como void, e imprimo dentro del mismo metodo.
        int sumar = num1 + num2;
        return sumar;
    }
    
    public int Restar(){
        int restar = num1 - num2; 
        return restar;
    }
    
    public int Multiplicar(){
        int multiplicar = num1 * num2;
        return multiplicar;
    }
    
    public double Dividir(){
        int dividir = num1 / num2;
        return dividir;
    }

}
