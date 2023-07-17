/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Curso;
import java.util.Scanner;

/**
 *  Método cargarAlumnos(): este método le permitirá al usuario ingresar los
 * alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta
 * información en un arreglo e iterar con un bucle, solicitando en cada
 * repetición que se ingrese el nombre de cada alumno.  Método crearCurso(): el
 * método crear curso, le pide los valores de los atributos al usuario y después
 * se le asignan a sus respectivos atributos para llenar el objeto Curso. En
 * este método invocaremos al método cargarAlumnos() para asignarle valor al
 * atributo alumnos  Método calcularGananciaSemanal(): este método se encarga
 * de calcular la ganancia en una semana por curso. Para ello, se deben
 * multiplicar la cantidad de horas por día, el precio por hora, la cantidad de
 * alumnos y la cantidad de días a la semana que se repite el encuentro.
 */
public class servicioCurso {

    Scanner leer = new Scanner(System.in);

    public void cargarAlumnos(Curso nc) {
        String[] alumnos = new String[5]; // arreglo para almacenar los nombres de los alumnos

        System.out.println("Ingrese los nombres de los alumnos:");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            String nombre = leer.nextLine();
            alumnos[i] = nombre;
        }

        nc.setAlumnos(alumnos);
    }

    /**
     * Método crearCurso(): el método crear curso, le pide los valores de los
     * atributos al usuario y después se le asignan a sus respectivos atributos
     * para llenar el objeto Curso. En este método invocaremos al método
     * cargarAlumnos() para asignarle valor al atributo alumnos
     *
     * @param nc
     */
    public void crearCurso(Curso nc) {
        System.out.println("A continuación, ingrese los datos solicitados:");

        System.out.print("Nombre del curso: ");
        String nombreCurso = leer.nextLine();
        nc.setNombreCurso(nombreCurso);

        System.out.print("Cantidad de horas por día: ");
        int cantidadHorasDia = leer.nextInt();
        nc.setCantidadHorasPorDia(cantidadHorasDia);

        leer.nextLine(); // Limpiar el buffer de entrada

        System.out.print("Cantidad de días por semana: ");
        int cantidadDiasSemana = leer.nextInt();
        nc.setCantidadDiasPorSemana(cantidadDiasSemana);

        leer.nextLine(); // Limpiar el buffer de entrada

        System.out.print("Turno: ");
        String turno = leer.nextLine();
        nc.setTurno(turno);

        System.out.print("Precio por hora: ");
        int precioHora = leer.nextInt();
        nc.setPrecioPorHora(precioHora);

        leer.nextLine(); // Limpiar el buffer de entrada

        System.out.print("Alumnos del curso: ");
        cargarAlumnos(nc);
    }

    /**
     * Método calcularGananciaSemanal(): este método se encarga de calcular la
     * ganancia en una semana por curso. Para ello, se deben multiplicar la
     * cantidad de horas por día, el precio por hora, la cantidad de alumnos y
     * la cantidad de días a la semana que se repite el encuentro.
     * @param nc
     */
    public void calcularGananciaSemanal(Curso nc) {
        int cantidadHorasDia = nc.getCantidadHorasPorDia();
        int precioHora = nc.getPrecioPorHora();
        int cantidadAlumnos = 5;
        int cantidadDiasSemana = nc.getCantidadDiasPorSemana();
        int ganancia = cantidadHorasDia * precioHora * cantidadAlumnos * cantidadDiasSemana;

        System.out.println("Ganancia: " + ganancia);
    }
}
