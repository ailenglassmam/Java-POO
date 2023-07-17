package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

public class serviciosCadena {

    // método para crear objetos desde servicios
    public Cadena crearObjeto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");

        String frase = leer.nextLine();

        return new Cadena(frase, frase.length());
    }

    //      a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//          frase ingresada.
    public int mostrarVocales(Cadena p1) {
        String frase = p1.getFrase();
        int cantVocales = 0;
        String letras;
        for (int i = 0; i < p1.getLongitud(); i++) {
            letras = frase.substring(i, i + 1); // es i + 1 porque NO ES INCLUSIVE
            if ("a".equals(letras) || "e".equals(letras) || "i".equals(letras) || "o".equals(letras) || "u".equals(letras)) {
                cantVocales++;
            }
        }
        return cantVocales;
    }

    //      b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public String invertirFrase(Cadena p1) {
        String frase = p1.getFrase();
//      Método para invertir una cadena de texto:  StringBuilder.reverse().toString() (lo pasa a cadena)      
        return new StringBuilder(frase).reverse().toString();
    }

//     c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    public int vecesRepetir(Cadena p1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un caracter cualquiera");
        String letra = leer.next();
        String frase = p1.getFrase();
        int cantCarac = 0;
        String carac;
        for (int i = 0; i < p1.getLongitud(); i++) {
            carac = frase.substring(i, i + 1);
            if (carac.equals(letra)) {
                cantCarac++;
            }
        }

        return cantCarac;
    }

//    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena p1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese otra frase");
        String frase2 = leer.nextLine();
        if (p1.getLongitud() < frase2.length()) {
            System.out.println("La frase inicial posee menos caracteres que la frase nueva");
        } else {
            System.out.println("La frase nueva posee menos caracteres que la frase inicial");
        }

    }
    
    //      f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    
        public void unirFrases(Cadena p1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nuevo fragmento");
        String frase3 = leer.nextLine();
        String fraseFinal = p1.getFrase() + " " + frase3;
        
            System.out.println("La frase resultante es: " + fraseFinal );

    }
        
        //      g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
//            public String reemplazar(Cadena p1) {
//        String frase = p1.getFrase();
//        String vocalReemplazar = "a";
//        String letras;
//        String caracter;
//        caracter = "*";
//        for (int i = 0; i < p1.getLongitud(); i++) {
//            letras = frase.substring(i, i + 1); // es i + 1 porque NO ES INCLUSIVE
//            if (vocalReemplazar.equals(letras)) {
//                letras = caracter;
//            }
//        }
//        return cantVocales;
//    }
        
}
