/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.objetos;

import Entidad.Ahorcado;
import Servicios.servicioAhorcado;

/**
 *
 * @author PC
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       servicioAhorcado ns = new servicioAhorcado();
       Ahorcado ng = ns.crearJuego();
       
        System.out.println(ng.toString());
       
       
    }

    
}
