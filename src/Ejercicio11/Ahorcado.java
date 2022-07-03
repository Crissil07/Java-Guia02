
package Ejercicio11;

import java.util.Scanner;


public class Ahorcado {
    
    private String pla [];
    private int chances;
    private int aciertos;
    private int largoPla;
    private String Buscar [];
    Scanner scan = new Scanner(System.in);

    public Ahorcado() {
    }

    public Ahorcado(String[] pla, int chances) {
        this.pla = pla;
        this.chances = chances;     
    }
    
    
    
    public void crearJuego(){
        System.out.println("Configuracion:");
        System.out.println("Ingrese la palabra a buscar.");
        String palabra = scan.next();                  
    }
    
    public void longiPalabra(){
    }
    
    public void buscarLetra(){
    }
}
