/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona2;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Y los siguientes métodos:  Agregar un método de creación del objeto que
 * respete la siguiente firma: crearPersona(). Este método rellena el objeto
 * mediante un Scanner y le pregunta al usuario el nombre y la fecha de
 * nacimiento de la persona a crear, recordemos que la fecha de nacimiento debe
 * guardarse en un Date y los guarda en el objeto.  Escribir un método
 * calcularEdad() a partir de la fecha de nacimiento ingresada. Tener en cuenta
 * que para conocer la edad de la persona también se debe conocer la fecha
 * actual.  Agregar a la clase el método menorQue(int edad) que recibe como
 * parámetro otra edad y retorna true en caso de que el receptor tenga menor
 * edad que la persona que se recibe como parámetro, o false en caso contrario.
 *  Metodo mostrarPersona(): este método muestra la persona creada en el método
 * anterior.
 */
public class servicioPersona2 {

    public void crearPersona(Persona2 np) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        np.setNombre(nombre);

        System.out.println("Ingrese la fecha de nacimiento: ");
        // Pedir al usuario el día, mes y año
        System.out.println("Día: ");
        int dia = leer.nextInt();

        System.out.println("Mes: ");
        int mes = leer.nextInt();

        System.out.println("Año: ");
        int anio = leer.nextInt();

        // Crear la fecha utilizando LocalDate
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        np.setFechaNacimiento(fecha);
    }

    public int calcularEdad(Persona2 np) {
        // Obtener la fecha actual utilizando LocalDate
        LocalDate fechaActual = LocalDate.now();

        // Calcular los años de diferencia entre la fecha ingresada y la fecha actual
        int aniosDiferencia = Period.between(np.getFechaNacimiento(), fechaActual).getYears();

        return aniosDiferencia;
    }

    public void menorEdad(Persona2 np) {
        int edad = calcularEdad(np);

        if (edad < 18) {
            System.out.println("Sos menor de edad");
        } else {
            System.out.println("Sos mayor de edad. Podes manejar.");
        }
    }
    
    public void mostrarPersona(Persona2 np) {
        System.out.println("Nombre: " + np.getNombre());
        System.out.println("Fecha de nacimiento: " + np.getFechaNacimiento());
        int edad = calcularEdad(np);
        System.out.println("Edad: " + edad + " años");
    }
}
