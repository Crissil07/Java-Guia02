//Declarar una clase llamada Circunferencia que tenga como atributo privado el
//radio de tipo real. A continuación, se deben crear los siguientes métodos:

//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crear un objeto de tipo Circunferencia.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
package Ejercicio03;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        Circunferencia c1 = new Circunferencia(15);
        
        c1.Area();
        c1.Perimetro();
    }
    
}
