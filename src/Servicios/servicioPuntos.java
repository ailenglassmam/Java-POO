/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Puntos;
import java.util.Scanner;

/**
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos. Para conocer como calcular la distancia entre dos
 * puntos consulte el siguiente link:
 */
public class servicioPuntos {

    Scanner leer = new Scanner(System.in);

    public void crearPuntos(Puntos p1) {
        System.out.println("Ingrese las coordenadas (x,y) de los puntos");
        System.out.print("Coordenada x1: ");
        double x1 = leer.nextDouble();
        p1.setX1(x1);

        System.out.print("Coordenada x2: ");
        double x2 = leer.nextDouble();
        p1.setX2(x2);

        System.out.print("Coordenada y1: ");
        double y1 = leer.nextDouble();
        p1.setY1(y1);

        System.out.print("Coordenada y2: ");
        double y2 = leer.nextDouble();
        p1.setY2(x1);
    }
    
    public void calcularDistancia(Puntos p1) {
        System.out.println("La distancia entre puntos es: ");
        double distancia = Math.sqrt((Math.pow((p1.getX2() - p1.getX1()), 2)) + Math.pow((p1.getY2() - p1.getY1()), 2));
        System.out.println("la distancia es: " + distancia);
    }
}
