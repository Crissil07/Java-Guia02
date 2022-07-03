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


public class PersonaService {
    
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    

    public PersonaService() {
    }

    public PersonaService(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void crearPersona(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre");
        nombre = scan.next();
        System.out.println("Edad");
        edad = scan.nextInt();
        System.out.println("Sexo ('H' hombre, 'M' mujer, 'O' otro)");
        sexo = scan.next().charAt(0);
        System.out.println("Peso");
        peso = scan.nextDouble();
        System.out.println("Altura");
        altura = scan.nextDouble();        
    }
    
    public double calcularIMC(){
        double IMC,Valor = 0;
        IMC = peso / (Math.pow(altura, 2));
        if (IMC < 20) {
            Valor = -1;
        }else if (IMC >= 20 && IMC <= 25){
                Valor = 0;
        }else if (IMC > 25){
            Valor = 1;
        }
        return Valor;
    }
    
    public boolean esMayorDeEdad(){
        if (edad >= 18) {
            return true;
        }else{
            return false;
        }
    }
    
    public char comprobarSexo(){
        if (sexo == ('h') || sexo == ('m') || sexo == ('o')) {
            System.out.println(" ");
        }else{
            System.out.println("Dato incorrecto");
        }
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    
    
}
