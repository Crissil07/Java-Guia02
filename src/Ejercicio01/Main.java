//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro y luego
//informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.
package Ejercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Libro L1 = new Libro(); //OBJETO

        System.out.println("Ingresa el nombre del libro.");//Setters = seteamos/ rellenamos atributos.
        String titulo = scan.next();
        L1.setTitulo(titulo);
        System.out.println("Ingresa el nombre del autor.");//Setters = seteamos/ rellenamos atributos.
        String autor = scan.next();
        L1.setAutor(autor);
        System.out.println("Ingresa el numero de paginas.");//Setters = seteamos/ rellenamos atributos.
        int Paginas = scan.nextInt();
        L1.setPaginas(Paginas);
        System.out.println("Ingresa el codigo ISBN.");//Setters = seteamos/ rellenamos atributos.
        int ISBN = scan.nextInt();
        L1.setISBN(ISBN);

        System.out.println("\n");

        System.out.println("Libro: " + L1.getTitulo());//Getters= Obtengo/ Muestro el valor atributo
        System.out.println("Autor: " + L1.getAutor());//Getters= Obtengo/ Muestro el valor atributo
        System.out.println("Paginas: " + L1.getPaginas());//Getters= Obtengo/ Muestro el valor atributo
        System.out.println("Cod. ISBN: " + L1.getISBN());//Getters= Obtengo/ Muestro el valor atributo
    }
}
