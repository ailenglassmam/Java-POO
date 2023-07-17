/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

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
public class NIF {
    
    private long DNI;
    private String letra;

    public NIF() {
    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
}
