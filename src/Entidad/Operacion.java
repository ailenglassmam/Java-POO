package Entidad;

//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
import java.util.Scanner;

//numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
public class Operacion {

    // declaro los dos atributos como enteros
    private int numero1;
    private int numero2;
    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;

    //creo el constructor vacío
    public Operacion() {
    }

    //creo el constructor con todos los atributos
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //creo los métodos get y set de la clase
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // creo el método que le pide al usuario los dos números y los guarda en los atributos del objeto
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese dos números enteros para realizar las operaciones");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
    }

    //creo el método para calcular la suma de los números y devolver el resultado al main
    public int sumar() {
        this.suma = numero1 + numero2;
        return suma;
    }

    //creo el método para calcular la resta de los números y devolver el resultado al main
    public int restar() {
        this.resta = numero1 - numero2;
        return resta;
    }

    //creo el método para calcular la división de los números y devolver el resultado al main
    //primero valida que no se haga una división por cero, si fuera a pasar
    //una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    //informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    public int dividir() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        } else {
            division = numero1 / numero2;
        }
        return division;
    }
    
    //creo el método para calcular la multiplicación de los números y devolver el resultado al main
    //primero valida que no se haga una multiplicación por cero, si
    //fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    //Si no, se hace la multiplicación y se devuelve el resultado al main
    public int multiplicar() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        } else {
            multiplicacion = numero1 * numero2;
        }
        return multiplicacion;
    }
    
}
