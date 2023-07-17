/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.objetos;

import Entidad.Curso;
import Servicios.servicioCurso;

/**
 *
 * @author PC
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        Curso nc = new Curso();
        servicioCurso sc = new servicioCurso();

        sc.crearCurso(nc);
//        sc.cargarAlumnos(nc);
        sc.calcularGananciaSemanal(nc);
    }

}
