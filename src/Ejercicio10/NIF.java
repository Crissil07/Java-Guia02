package Ejercicio10;

import java.util.Scanner;

public class NIF {

    private long dni;
    private char letra;
    private final char[] letArray = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
        'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public NIF() {
        dni = 0;
        letra = (' ');
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void crearNif() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el DNI");
        dni = scan.nextLong();
        long resto = dni % 23;
        this.letra = letArray[(int) resto];
    }

    public void mostrar() {
        System.out.println(getDni() + "-" + getLetra());
    }
}
