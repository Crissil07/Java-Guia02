//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre,
//edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir
//algún otro atributo, puede hacerlo
//.
//Se implementarán tres constructores:
//• Un constructor por defecto.
//• Un constructor con todos los atributos como parámetro.
//Los métodos que se implementarán son:
//• Metodo crearPersona(): el método crear persona, utiliza la clase Scanner para pedirle
//los valores de los atributos al usuario y después se le asignan a sus respectivos
//atributos para llenar el objeto Persona.
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
//función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
//(incluidos), significa que el peso está por debajo de su peso ideal y la función
//devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
//significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
//hacer uso de constantes para devolver estos valores.18
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
//• Método comprobarSexo(char sexo): comprueba que el sexo introducido sea
//correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje.
//• Métodos getters y setters de cada atributo.
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por último guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
//en distintas variables, para después en el main, calcular un porcentaje de cuantas
//personas están por debajo de su peso, cuantas en su peso ideal y cuantos por encima,
//y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos
//menores.
package Ejercicio12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //creacion del objeto (ficha del paciente).
        PersonaService perServ = new PersonaService();
        //creacion de variables
        double auxPesoI = 0, auxPesoB = 0, auxSP = 0;
        double auxMayor = 0, auxMenor = 0;

        //Creo los 4 objetos.
        PersonaService per1 = new PersonaService();
        PersonaService per2 = new PersonaService();
        PersonaService per3 = new PersonaService();
        PersonaService per4 = new PersonaService();

        //Llamo a los metodos 
        System.out.println("Bienbenido, ingrese los datos del paciente.");
        System.out.println("\n");
        per1.crearPersona();
        per1.calcularIMC();
        per1.esMayorDeEdad();
        per1.comprobarSexo();

        if (per1.calcularIMC() == -1) {
            System.out.println("Peso ideal");
            auxPesoI++;
        } else if (per1.calcularIMC() == 0) {
            System.out.println("Por debajo del peso ideal");
            auxPesoB++;
        } else if (per1.calcularIMC() == 1) {
            System.out.println("Sobrepeso");
            auxSP++;
        }

        if (per1.esMayorDeEdad()) {
            auxMayor++;
        } else {
            auxMenor++;
        }

        per2.crearPersona();
        per2.calcularIMC();
        per2.esMayorDeEdad();
        per2.comprobarSexo();

        if (per2.calcularIMC() == -1) {
            System.out.println("Peso ideal");
            auxPesoI++;
        } else if (per2.calcularIMC() == 0) {
            System.out.println("Por debajo del peso ideal");
            auxPesoB++;
        } else if (per2.calcularIMC() == 1) {
            System.out.println("Sobrepeso");
            auxSP++;
        }

        if (per2.esMayorDeEdad()) {
            auxMayor++;
        } else {
            auxMenor++;
        }

        per3.crearPersona();
        per3.calcularIMC();
        per3.esMayorDeEdad();
        per3.comprobarSexo();

        if (per3.calcularIMC() == -1) {
            System.out.println("Peso ideal");
            auxPesoI++;
        } else if (per3.calcularIMC() == 0) {
            System.out.println("Por debajo del peso ideal");
            auxPesoB++;
        } else if (per3.calcularIMC() == 1) {
            System.out.println("Sobrepeso");
            auxSP++;
        }

        if (per3.esMayorDeEdad()) {
            auxMayor++;
        } else {
            auxMenor++;
        }

        per4.crearPersona();
        per4.calcularIMC();
        per4.esMayorDeEdad();
        per4.comprobarSexo();

        if (per4.calcularIMC() == -1) {
            System.out.println("Peso ideal");
            auxPesoI++;
        } else if (per4.calcularIMC() == 0) {
            System.out.println("Por debajo del peso ideal");
            auxPesoB++;
        } else if (per4.calcularIMC() == 1) {
            System.out.println("Sobrepeso");
            auxSP++;
        }

        if (per3.esMayorDeEdad()) {
            auxMayor++;
        } else {
            auxMenor++;
        }

        double prPI = (auxPesoI * 100) / 4;
        double prPesoB = (auxPesoB * 100) / 4;
        double prSP = (auxSP * 100) / 4;
        double prMayor = (auxMayor * 100) / 4;
        double prMenor = (auxMenor * 100) / 4;

        System.out.println("Personas con PESO IDEAL: " + prPI + "%");
        System.out.println("Personas con PESO BAJO: " + prPesoB + "%");
        System.out.println("Personas con SOBRE PESO: " + prSP + "%");
        System.out.println("Personas MENORES: " + prMenor + "%");
        System.out.println("Personas MAYORES: " + prMayor + "%");

    }
}
