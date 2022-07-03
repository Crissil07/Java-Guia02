//Declarar una clase llamada Circunferencia que tenga como atributo privado el
//radio de tipo real. A continuación, se deben crear los siguientes métodos:

//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crear un objeto de tipo Circunferencia.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
package Ejercicio03;


public class Circunferencia {
    
    private double radio;
    public double pi = 3.14;
    public double perimetro;
    public double area;
  

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void Area(){
        area = pi * (Math.pow(radio, 2));
        System.out.println("Area= "+ area);
    }
    
    public void Perimetro(){
        perimetro = 2 * pi * radio;
        System.out.println("Perimetro= "+ perimetro);        
    }
    
}

