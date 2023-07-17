/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;

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
public class Persona2 {

    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona2() {
    }

    public Persona2(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate  getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate  fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
