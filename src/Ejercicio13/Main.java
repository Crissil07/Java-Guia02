
package Ejercicio13;

import java.util.Scanner;


public class Main {
    
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        Cadena fra = new Cadena();
        
        System.out.println("Ingrese una palabra");
        String frase= scan.nextLine();
        fra.setFrase(frase);
        int longitud = frase.length();
        fra.setLongitud(longitud);
        
        fra.mostrarVocales();
        fra.invertirFrase();
        fra.vecesRepetido(frase);
        
        
        
        
        
        
        
    }
    
}
