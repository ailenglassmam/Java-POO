package Entidad;

//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima 

import java.util.Scanner;

//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual 
//(la cantidad actual de café que hay en la cafetera). 
//Implemente, al menos, los siguientes métodos:
// Constructor predeterminado o vacío // listo
// Constructor con la capacidad máxima y la cantidad actual //listo
// Métodos getters y setters. //listo
// Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. // listo
// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
//y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” 
//para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y 
//de no haberse llenado en cuanto quedó la taza.
// Método vaciarCafetera(): pone la cantidad de café actual en cero.
// Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y 
//se añade a la cafetera la cantidad de café indicada.
public class Cafetera {

    Scanner leer = new Scanner(System.in);
    
//    atributos
    private int capacidadMaxima = 1000;
    private int cantidadActual;
    private int tazaVacia;
    private int cantidadCafe;

//    constructor vacio
    public Cafetera() {
    }

//    constructor con atributos
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

//    getter y setter
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

//      otros métodos
//      Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera() {
        capacidadMaxima = 1000;
        if(cantidadActual < capacidadMaxima) {
            System.out.println("Llenando el tanque...");
            cantidadActual = capacidadMaxima;
            System.out.println("Tanque completado con exito");
        } else {
            System.out.println("Tanque lleno");
        }
    }
    
    public void cantidadActual() {
        System.out.println("El tanque posee " + cantidadActual + " ml de café");
    }

//      Método servirTaza(int) : se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
//      y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” 
//      para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y 
//      de no haberse llenado en cuanto quedó la taza.
    public void servirTaza(){
        System.out.println("Ingrese el tamaño de la taza en mililitros");
        tazaVacia = leer.nextInt();
        if(tazaVacia > cantidadActual){
            System.out.println("Cantidad de café insuficiente. Llene el tanque para completar el contenido de su taza");
            tazaVacia = cantidadActual;
            System.out.println("Llenando...");
            System.out.println("Su taza contiene " + tazaVacia + " ml de café");
        } else {
            System.out.println("Llenando...");
            cantidadActual  -= tazaVacia;
            System.out.println("Su taza contiene " + tazaVacia + " ml de café");
        }
    }
    
//    Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera() {
        System.out.println("Se vaciará el tanque de su cafetera");
        cantidadActual = 0;
        System.out.println("La cantidad de café disponible es de: " + cantidadActual);
    }
    
//    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y 
//se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe() {
        System.out.println("Ingrese la cantidad de café que desea agregar a la preparación");
        cantidadCafe = leer.nextInt();
        System.out.println("Agregando el café...");
    }
    
}

