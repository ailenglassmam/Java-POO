/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.objetos;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //        clase 2: ejercicio 1

//        creo una nueva instancia de la clase libro
        Libro ingreso1;
        ingreso1 = new Libro();

//        traigo el Scanner para poder leer los valores que va a ingresar el usuario
        Scanner leer = new Scanner(System.in);

//        pido los datos por pantalla al usuario
        System.out.println("¡Hola! Bienvenido al sistema de registro de libros. Por favor, ingresá los datos a continuación:");
        System.out.println("Titulo del libro");
        ingreso1.setTitulo(leer.nextLine());
        System.out.println("Autor");
        ingreso1.setAutor(leer.nextLine());
        System.out.println("Cantidad de páginas");
        ingreso1.setNumPag(leer.nextInt());
        
        //muestro el objeto con el método to string para comparar con lo que voy a imprimir con el get
        System.out.println(ingreso1.toString());
        
        //muestro los datos con el método get
        System.out.println("El libro que ingresaste a nuestra biblioteca posee los siguientes datos: ");
        System.out.println("Número ISBN: " + ingreso1.ISBN);
        System.out.println("Título: " + ingreso1.titulo);
        System.out.println("Autor: " + ingreso1.autor);
        System.out.println("Cantidad de páginas: " + ingreso1.numPag);
    }
    
}
