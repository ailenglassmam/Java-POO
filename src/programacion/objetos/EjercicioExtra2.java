/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.objetos;

import Entidad.Puntos;
import Servicios.servicioPuntos;

/**
 *
 * @author PC
 */
public class EjercicioExtra2 {

    
    public static void main(String[] args) {
        
        servicioPuntos sc = new servicioPuntos();
        Puntos p1 = new Puntos();
        
        sc.crearPuntos(p1);
        sc.calcularDistancia(p1);
        
    }
    
}
