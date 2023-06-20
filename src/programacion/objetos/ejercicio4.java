package programacion.objetos;

import Entidad.Rectangulo;

public class ejercicio4 {

public static void main(String[] args) {
        // Clase 3: Ejercicio 4
        
        Rectangulo intento1 = new Rectangulo();

        intento1.crearRectangulo();

        //guardo en variables los resultados obtenidos en las clases
        double superficie = intento1.superficie();
        double perimetro = intento1.perimetro();

        System.out.println("La superficie del rectángulo ingresado es: " + superficie);
        System.out.println("El perímetro del rectángulo ingresado es: " + perimetro);
    }
    
}
