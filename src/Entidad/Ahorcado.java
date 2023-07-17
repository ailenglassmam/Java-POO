/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Ahorcado {
    private String[] palabra;
    private int cantidadLetras;
    private int cantidadJugadas = 6;
    private String[] palabrasRandom;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantidadLetras, int cantidadJugadas, String[] palabrasRandom) {
        this.palabra = palabra;
        this.cantidadLetras = cantidadLetras;
        this.cantidadJugadas = cantidadJugadas;
        this.palabrasRandom = palabrasRandom;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }

    public String[] getPalabrasRandom() {
        return palabrasRandom;
    }

    public void setPalabrasRandom(String[] palabrasRandom) {
        this.palabrasRandom = palabrasRandom;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", cantidadLetras=" + cantidadLetras + ", cantidadJugadas=" + cantidadJugadas + ", palabrasRandom=" + palabrasRandom + '}';
    }

}
