package programacion.objetos;

import Entidad.Persona;
import java.util.Scanner;

public class JavaPOO {

    public static void main(String[] args) {

        // clase 1
        // para crear una nueva instancia de la clase creada realizamos
        // donde p1 es el nombre de esa instancia
        // IMPORTANTE: recordar importar la clase creada
        //declaración de objeto
        Persona p1;

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu nombre");

        //inicialización de objeto (instanciacion)
        //a la izquierda es donde asigno el objeto, a la derecha es donde doy inicio al objeto, nace.
        Persona p2 = new Persona("Ailen"); // en el constructor le pase un valor

        System.out.println("El valor inicial del atributo en el constructor es:");
        System.out.println("Nombre: " + p2.getNombre());

        //asignar valores a los atributos de esa clase
        p2.pasatiempo = "Leer";

        //para mostrar por consola los atributos y valores coloco "sout"
//      para, por ejemplo, modificar un dato del objeto, puedo usar el setter
        p2.setNombre("Magali");

        System.out.println("El valor final del atributo en el constructor es:");

        System.out.println("Nombre: " + p2.getNombre());

        System.out.println("Cambio realizado utilizando set y visualizado con get");

        System.out.println(p2.toString());
    }

}
