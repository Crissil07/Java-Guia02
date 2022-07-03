//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
//sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto
//puntos usando un método crearPunto() y a través de otro método comprobar y
//devolver la distancia que existe entre los dos puntos que existen en la clase
//Puntos.

package Ejercicio05;

public class Main {
    
    public static void main(String[] args){
        
        Puntos punto = new Puntos();
        
        punto.crearPunto();
        
        punto.distanciaPuntos();
        
    }
}
