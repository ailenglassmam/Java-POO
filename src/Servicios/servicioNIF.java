/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.NIF;
import java.util.Scanner;

/**
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente 
* letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra (String o char) 
* que le corresponde. Dispondrá de los siguientes métodos:
 Métodos getters y setters para el número de DNI y la letra.
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
* Una vez calculado, le asigna la letra que le corresponde según el resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; 
* por ejemplo: 00395469-F).
 */

public class servicioNIF {
    
    public void crearNif(NIF n1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su DNI");
        long numDNI = leer.nextLong();
        n1.setDNI(numDNI);
        
        int calcularNIF = (int) (numDNI % 23);
        
        String[] letraNif = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        
        String letra = letraNif[calcularNIF];
        n1.setLetra(letra);

    }
    
    public void mostrar(NIF n1) {
        System.out.println("Su codigo NIF es: " + n1.getDNI() + "-" + n1.getLetra());
    }
    
}
