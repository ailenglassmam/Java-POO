/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class servicioAhorcado {

    Scanner leer = new Scanner(System.in);

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
    vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
    de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
    máximas, el valor que ingresó el usuario y encontradas en 0.
     */

    public Ahorcado crearJuego() {
        Ahorcado ng = new Ahorcado();
        ng.setPalabrasRandom(listaPalabra());
        ng.setPalabra(palabraAleatoria(ng));
        return ng;
    }

    public String[] listaPalabra() {
        String[] listaPalabras = {"aeropuerto", "tornado", "celular", "otorrinolaringologia"};
        return listaPalabras;
    }

    public String[] palabraAleatoria(Ahorcado ng) {
        int indice = (int) (Math.random() * 10);
        String[] palabrasAgregadas = ng.getPalabrasRandom();
        String palabraElegida = palabrasAgregadas[indice];

        char[] arregloPalabra = palabraElegida.toCharArray();
        String[] arregloPalabraString = new String[palabraElegida.length()];

        for (int i = 0; i < palabraElegida.length(); i++) {
            arregloPalabraString[i] = String.valueOf(arregloPalabra[i]);
        }
        
        return arregloPalabraString;
    }

}
