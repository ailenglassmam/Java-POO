package Servicios;

import Entidad.Mes;
import java.util.Scanner;

/*
     * El programa debe pedir al usuario que adivine el mes secreto. Si el usuario
     * acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
     * adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser
     * este: 
    * Adivine el mes secreto. 
    * Introduzca el nombre del mes en minúsculas:
     * febrero 
        * No ha acertado. 
        * Intente adivinarlo introduciendo otro mes: 
        * agosto
     * ¡Ha acertado!
 */
public class servicioMes {

    Scanner leer = new Scanner(System.in);

    public void adivinar(Mes nm) {
        System.out.println("Juego de adivinanza: ¿Qué mes estoy pensando?");

        System.out.println("Introduzca el nombre del mes en minúscula:");
        String mesIngresado = leer.nextLine();

        while (!mesIngresado.equals(nm.getMesSecreto())) {
            System.out.println("No acertaste.");
            System.out.println("Intenta adivinarlo introduciendo otro mes:");
            mesIngresado = leer.nextLine();
        }

        System.out.println("¡Acertaste!");
    }

}
