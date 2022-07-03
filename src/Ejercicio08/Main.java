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


public class Main {
    
    public static void main(String[] args){
        
        Fecha fecha = new Fecha();
        
        fecha.crearFecha();
        fecha.bisiesto();
        
        fecha.diasMes();
        fecha.añosEntre();
        fecha.Siguiente();
        fecha.Anterior();
    }
}
