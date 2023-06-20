package programacion.objetos;

import Entidad.Operacion;

public class ejercicio3 {

    public static void main(String[] args) {
        // Clase 3: Ejercicio 3

        Operacion intento1 = new Operacion();

        intento1.crearOperacion();

        //guardo en variables los resultados obtenidos en las clases
        int suma = intento1.sumar();
        int resta = intento1.restar();
        int multiplicacion = intento1.multiplicar();
        int division = intento1.dividir();

        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("La resta de los números ingresados es: " + resta);
        System.out.println("La multiplicación de los números ingresados es: " + multiplicacion);
        System.out.println("La división de los números ingresados es: " + division);
    }

}
