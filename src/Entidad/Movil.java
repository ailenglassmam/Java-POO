/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * Una tienda que vende teléfonos móviles quiere tener registro de cada producto
 * que posee en un sistema computacional. Para ello, crearemos un programa donde
 * se pueda almacenar cada producto con su información. Crear una entidad Movil
 * con los atributos marca, precio, modelo, memoriaRam, almacenamiento y codigo.
 * El atributo código será un arreglo numérico de dimensión 7 (siete) donde cada
 * subíndice alojará un número correspondiente al código. A continuación, se
 * implementarán los siguientes métodos:  Un constructor por defecto.  Un
 * constructor con todos los atributos como parámetro.  Métodos getters y
 * setters de cada atributo.
 */

public class Movil {
    
    private String marca;
    private int precio;
    private String modelo;
    private String memoriaRam;
    private String almacenamiento;
    private int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, int precio, String modelo, String memoriaRam, String almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
}
