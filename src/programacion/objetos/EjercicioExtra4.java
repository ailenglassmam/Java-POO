/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.objetos;

import Entidad.NIF;
import Servicios.servicioNIF;

/**
 *
 * @author PC
 */
public class EjercicioExtra4 {
    
    public static void main(String[] args) {
        
        NIF n1 = new NIF();
        servicioNIF sc = new servicioNIF();
        
        sc.crearNif(n1);
        sc.mostrar(n1);
        
    }
    
}
