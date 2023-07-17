/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.objetos;

import Entidad.Movil;
import Servicios.servicioMovil;

/**
 *
 * @author PC
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Movil nm = new Movil();
        servicioMovil ns = new servicioMovil();
        
        ns.cargarCelular(nm);
        ns.ingresarCodigo(nm);
        
        System.out.println("¡ Carga en el sistema exitosa !");
        
    }
    
}
