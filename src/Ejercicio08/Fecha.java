//Crear una clase Fecha con atributos para el día, mes y año. Se debe incluir al
//menos los siguientes métodos:
//• Constructor predeterminado o vacío.
//• Constructor parametrizado con día, mes y año.
//• Métodos get y set de los atributos.
//• Método crearFecha() para pedir al usuario el día (1 a 31), el mes (1 a 12) y el año (1900
//a 2050).
//• Método bisiesto() para indicar si el año es bisiesto o no.
//• Método diasMes(int) para devolver el número de días del mes indicado (para el año
//de la fecha).
//• Método crearFecha() (parte 2) : sumarle al método crearFecha() una validación para
//comprobar si la fecha es correcta (entre el 1-1-1900 y el 31-12-2050). Si el día no es
//correcto, se pondrá en 1; si el mes no es correcto se pondrá en 1; y si el año no es
//correcto lo pondrá en 1900.
//• Método aniosEntre(anio) para devolver el número de años entre la fecha ingresada
//por el usuario y otro año dado por el usuario, pasada por parámetro.
//• Método siguiente() para devolver el día siguiente del día de la fecha ingresada.
//• Método anterior() para devolver el día anterior del día de la fecha ingresada.
package Ejercicio08;

import java.util.Scanner;


public class Fecha {
    
    public int dia,mes,año;
    Scanner scan= new Scanner(System.in);

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    
    public void crearFecha(){
        System.out.println("Ingresa el dia (1 - 31).");
        dia= scan.nextInt();
        System.out.println("Ingresa el mes (1 - 12).");
        mes= scan.nextInt();
        System.out.println("Ingresa el año (1900 - 2050).");
        año= scan.nextInt();
        
        if(dia >= 1 && dia <= 31){
            System.out.println(dia);
        }else{
            System.out.println("1");
        }
        
        if(mes >= 1 && mes <= 12){
            System.out.println(mes);
        }else{
            System.out.println("1");
        }
        
        if(año >= 1900 && año <= 2050){
            System.out.println(año);
        }else{
            System.out.println("1900");
        }
    }
    
    public void bisiesto(){
        if((año%4 ==0) && (año % 100 != 0 || año % 400 == 0)){
            System.out.println("El año es bisiesto.");
        }else{
            System.out.println("El año no es bisiesto.");
        }
    }
    
    public int diasMes(){
        int diasMes = dia;
        return diasMes;        
    }
    
    public int añosEntre(){
        int añosEntre;
        int año2 = 2026;
        System.out.println("Ingrese Un año diferente(entre las variables planteadas).");
        añosEntre= año2 - año;
        System.out.println("La diferencia es "+añosEntre);
        return añosEntre;
    }
    
    public int Siguiente(){
        int Siguiente;        
        Siguiente = dia + 1;
        if(Siguiente >= 1 && Siguiente <=31){
            System.out.println("El numero que le sigue es "+Siguiente);
        }else{
            System.out.println("El numero no corresponde a una fecha ingresada.");
        }
        return Siguiente;
    }
    
    public int Anterior(){
        int Anterior;        
        Anterior = dia - 1;
        if(Anterior >= 1 && Anterior <=31){
            System.out.println("El numero que le antecede es "+Anterior);
        }else{
            System.out.println("El numero no corresponde a una fecha ingresada.");
        }
        return Anterior;
    }
}
