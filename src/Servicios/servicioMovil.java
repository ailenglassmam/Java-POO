/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Movil;
import java.util.Scanner;

/**
        * Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular 
        * y poder cargarlo en nuestro programa.
        * Método ingresarCodigo(): este método permitirá ingresar el código completo de siete números de un celular. 
        * Para ello, puede utilizarse un bucle repetitivo
 */
public class servicioMovil {
    
    Scanner leer = new Scanner(System.in);
    
    public void cargarCelular(Movil nm) {
        System.out.println("Por favor, ingrese los siguientes datos del celular");
        System.out.print("Marca: ");
        String marca = leer.nextLine();
        nm.setMarca(marca);
        
        System.out.print("Modelo: ");
        String modelo = leer.nextLine();
        nm.setModelo(modelo);
        
        System.out.print("Memoria RAM: ");
        String memoria = leer.nextLine();
        nm.setMemoriaRam(memoria);
        
        System.out.print("Almacenamiento interno: ");
        String almacenamiento = leer.nextLine();
        nm.setAlmacenamiento(almacenamiento);
        
        System.out.print("Precio: ");
        int precio = leer.nextInt();
        nm.setPrecio(precio);
        
        leer.nextLine(); // Limpiar el buffer de entrada después de cada lectura de int
    }
    
    public void ingresarCodigo(Movil nm) {
    int[] codigo = new int[7]; // arreglo para almacenar los números del código

    System.out.println("Ingrese el código completo de siete números:");

    for (int i = 0; i < codigo.length; i++) {
        int numero = leer.nextInt();
        codigo[i] = numero;
    }

    nm.setCodigo(codigo);
}

    
}
