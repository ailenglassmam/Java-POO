package programacion.objetos;

import Entidad.Cuenta;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        // Clase 4: Ejercicio 5
        Scanner leer = new Scanner(System.in);
        int opcion;

        Cuenta ingreso1 = new Cuenta();

        ingreso1.crearCuenta();
        System.out.println("----- & -----");

        do {
            System.out.println("Ingrese la opción que desea consultar");
            System.out.println("1. Depositar");
            System.out.println("2. Extraer dinero");
            System.out.println("3. Extraer dinero express");
            System.out.println("4. Consultar saldo disponible");
            System.out.println("5. Consultar datos de la cuenta");
            System.out.println("6. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ingreso1.ingresar();
                    break;
                case 2:
                    ingreso1.retirar();
                    break;
                case 3:
                    ingreso1.extraccionRapida();
                    break;
                case 4:
                    ingreso1.consultarSaldo();
                    break;
                case 5:
                    ingreso1.consultarDatos();
                    break;
                case 6:
                    System.out.println("Gracias por usar nuestro sistema. Que tenga una buena semana");
                    break;
                default:
                    System.out.println("Opción incorrecta. Vuelva a intentarlo");
            }
            System.out.println(" ");
        } while (opcion != 6);

    }
}
