package programacion.objetos;

import Entidad.Circunferencia;

public class ejercicio2 {

    public static void main(String[] args) {
        // clase 2: ejercicio 2

        Circunferencia intento1 = new Circunferencia();

        intento1.crearCircunferencia();

        //guardo en variables los resultados obtenidos en las clases
        double area = intento1.area();
        double perimetro = intento1.perimetro();

        System.out.println("El área de la circunferencia ingresada es: " + area);
        System.out.println("El perímetro de la circunferencia ingresada es: " + perimetro);
    }

}
