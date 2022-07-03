
package Ejercicio13;

import java.util.Scanner;


public class Cadena {
    
    String Frase;
    int Longitud;
    Scanner scan= new Scanner(System.in);

    public Cadena() {
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }
    
    public void mostrarVocales(){
        int vocales= 0;
        for (int i = 0; i < Longitud ; i++) {
            if (Frase.charAt(i) == 'a'|| Frase.charAt(i)=='e'||Frase.charAt(i)=='i'||Frase.charAt(i)=='o'||Frase.charAt(i)=='u') {
                vocales++;
            }
        }
        System.out.println("Total de vocales: "+vocales);        
    }
    
    public void invertirFrase(){
        String rev = " ";
        for (int i = Longitud-1; i>=0; i--) {
            rev = rev + Frase.charAt(i);
        }
        System.out.println(rev);
    }
    
    public void vecesRepetido(String letra){
        int cLet= 0;
        System.out.println("Ingresa una letra");
        letra = scan.next();
        for (int i = 0; i < Longitud ; i++) {
            String L = Frase.substring(i, (i+1));
            if (L.equals(letra)) {
                cLet++;                
            }
        }
        System.out.println("La letra"+letra+" se repite "+cLet+" veces");
    }
    
    public void compararLongitud(String frase){
        
    }
    
    public void unirFrases(String frase){
        
    }
    
    public void reemplazar(String letra){
        
    }
    
    public void contiene(String letra){
        
    }
}
