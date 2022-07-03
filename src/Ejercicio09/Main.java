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

public class Main {

    public static void main(String[] args) {

        Cafetera cafe = new Cafetera();

        cafe.llenarCafetera();
        cafe.servirTaza();
        cafe.agregarCafe();
        cafe.vaciarCafetera();

    }
}
