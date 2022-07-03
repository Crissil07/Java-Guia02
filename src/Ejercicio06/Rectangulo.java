//Crear una clase Rectángulo que modele rectángulos por medio de un atributo
//privado base y un atributo privado altura. La clase incluirá un método para crear
//el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá
//un método para calcular la superficie del rectángulo, un método para calcular el
//perímetro del rectángulo. 
//Y por último tendremos un método que dibujará el
//rectángulo mediante asteriscos usando la base y la altura. Se deberán además
//definir los métodos getters, setters y constructores correspondientes.
//Formulas: Superficie = base ∗ altura / Perímetro = (base + altura) ∗ 2.
package Ejercicio06;

import java.util.Scanner;

public class Rectangulo {

    private double base, altura;

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {

        double B, H;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la base del rectangulo.");
        B = scan.nextDouble();
        this.base = B;
        System.out.println("Ingresa la altura del rectangulo");
        H = scan.nextDouble();
        this.altura = H;
    }

    public void sacarPerimetro() {
        double perim;
        perim = (base * altura) / 2;
        System.out.println("El perimetro del rectangulo es " + perim);
    }

    public void sacarSuperficie() {
        double sup;
        sup = base * altura;
        System.out.println("La superficie del rectangulo es " + sup);
    }

    public void dibujoRectangulo() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || j == 0 || i == altura - 1 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
