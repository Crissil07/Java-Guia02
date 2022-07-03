//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
//sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto
//puntos usando un método crearPunto() y a través de otro método comprobar y
//devolver la distancia que existe entre los dos puntos que existen en la clase
//Puntos.
package Ejercicio05;

import java.util.Scanner;

public class Puntos {

    //Atributos
    private int x1, y1, x2, y2;

    public Puntos() {//siempre por defecto
    }

    public void crearPunto() {

        Scanner scan = new Scanner(System.in);
        int x1B, y1B, x2B, y2B;

        System.out.println("Ingresa la coordenada x1");
        x1B = scan.nextInt();
        this.x1 = x1B;
        System.out.println("Ingresa la coordenada y1");
        y1B = scan.nextInt();
        this.y1 = y1B;
        System.out.println("Ingresa la coordenada x2");
        x2B = scan.nextInt();
        this.x2 = x2B;
        System.out.println("Ingresa la coordenada y2");
        y2B = scan.nextInt();
        this.y2 = y2B;
    }

    public void distanciaPuntos() {

        double valA, valB;
        double dist;

        valA = Math.pow((x2 - x1), 2);
        valB = Math.pow((y2 - x2), 2);

        dist = Math.sqrt(valA + valB);

        System.out.println("La distancia entre los puntos es= " + dist);

    }
}
