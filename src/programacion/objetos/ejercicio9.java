package programacion.objetos;

import Servicios.servicioMatematica;

public class ejercicio9 {

public static void main(String[] args) {
    
    servicioMatematica sc = new servicioMatematica();
    
    sc.crearObjeto();
    sc.devolverMayor();
    System.out.println("La potencia resultante es: " + sc.calcularPotencia());
    System.out.println("La raíz cuadrada del valor más bajo es: " + sc.calcularRaiz());
    }
    
}
