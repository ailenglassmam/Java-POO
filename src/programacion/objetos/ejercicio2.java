package programacion.objetos;

import Entidad.Circunferencia;

public class ejercicio2 {

    public static void main(String[] args) {
        // clase 2: ejercicio 2

        // creo una instancia del objeto/clase creado
        Circunferencia intento1 = new Circunferencia();

        //llamo al primer método (ese con el que puedo iniciar/calcular/emplear los métodos restantes)
        // en general es el método de tipo void que recibe y asigna un valor
        intento1.crearCircunferencia();

        //guardo en variables los resultados obtenidos en las clases
        double area = intento1.area(); //el valor proviene del método get
        double perimetro = intento1.perimetro(); //el valor proviene del método get

        //recordá que el método get es para:
        //poder tomar el valor del atributo y mostrarlo (imprimirlo)
        //mientras que el set es para ingresar el dato que va a pasar el usuario en el main
        
        // finalmente imprimo en pantalla
        System.out.println("El área de la circunferencia ingresada es: " + area);
        System.out.println("El perímetro de la circunferencia ingresada es: " + perimetro);
    }

}
