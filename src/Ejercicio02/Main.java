//Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos
//constructores: un constructor vacío y otro con la hora, minutos y segundos.
//Deberá definir además, los métodos getters y setters correspondientes, un
//método crearTiempo() para ingresar la hora, minutos y segundos, y el método
//imprimirHoraCompleta().
package Ejercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int horas, minutos, segundos;

        Scanner scan = new Scanner(System.in);

        Tiempo tiempo = new Tiempo(); //Objeto
        //Le doy valor a las horas minutos y segundos con los setters
        System.out.println("Ingresa las horas");
        horas = scan.nextInt();
        tiempo.setHora(horas);

        System.out.println("Ingresa los minutos");
        minutos = scan.nextInt();
        tiempo.setMinutos(minutos);

        System.out.println("Ingresa los segundos");
        segundos = scan.nextInt();
        tiempo.setSegundos(segundos);

        System.out.println("Cambie los valores ingresados, por favor.");

        tiempo.crearTiempo(); //Instancio aca del metodo crearTiempo
        tiempo.imprimirHoraCompleta();//Instancio aca del metodo imprimirHoraCompleta

    }
}
