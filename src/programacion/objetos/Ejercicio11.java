/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.objetos;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Pedir al usuario el día, mes y año
        System.out.println("Ingrese el día: ");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();
        
        // Crear la fecha utilizando el constructor de la clase Date
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        
        // Obtener la fecha actual utilizando el constructor vacío de la clase Date
        Date fechaActual = new Date();
        
        // Mostrar la fecha ingresada
        System.out.println("Fecha ingresada: " + fecha);
        
        // Calcular los años de diferencia entre la fecha ingresada y la fecha actual
        int aniosDiferencia = fechaActual.getYear() - fecha.getYear();
        
        // Mostrar los años de diferencia
        System.out.println("Años de diferencia: " + aniosDiferencia);
    }
    
}
