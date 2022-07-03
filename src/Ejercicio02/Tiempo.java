//Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos
//constructores: un constructor vacío y otro con la hora, minutos y segundos.
//Deberá definir además, los métodos getters y setters correspondientes, un
//método crearTiempo() para ingresar la hora, minutos y segundos, y el método
//imprimirHoraCompleta().
package Ejercicio02;

import java.util.Scanner;

public class Tiempo {

    //Atributos
    private int hora;
    private int minutos;
    private int segundos;

    //Metodos
    public Tiempo() {//Por defecto, siempre se crea un constructor vacio + otro seteado.
    }

    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void crearTiempo() {
        int horasB, minutosB, segundosB;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa nuevamente las horas.");
        horasB = scan.nextInt();
        this.hora = horasB;

        System.out.println("Ingresa nuevamente los minutos.");
        minutosB = scan.nextInt();
        this.minutos = minutosB;

        System.out.println("Ingresa nuevamente los segundos.");
        segundosB = scan.nextInt();
        this.segundos = segundosB;
    }

    public void imprimirHoraCompleta() {

        System.out.println("HORAS: " + getHora() + " ,MINUTOS: " + getMinutos() + " ,SEGUNDOS: " + getSegundos());

    }
}
