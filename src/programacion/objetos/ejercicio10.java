package programacion.objetos;
import java.util.Arrays;
import java.util.Random;

public class ejercicio10 {
    public static void main(String[] args) {
        int[] arregloA = new int[10];
        int[] arregloB = new int[5];

        // Inicializar arregloA con números aleatorios
        Random random = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextInt() * 10; // Generar números aleatorios entre 0 y 10
        }

        // Mostrar arregloA por pantalla
        System.out.println("Arreglo A antes de ordenar:");
        mostrarArreglo(arregloA);

        // Ordenar arregloA de menor a mayor
        Arrays.sort(arregloA);

        // Copiar los primeros 10 elementos de arregloA a arregloB
        System.arraycopy(arregloA, 0, arregloB, 0, 3);

        // Rellenar los últimos 10 elementos de arregloB con el valor 0.5
        Arrays.fill(arregloB, 3, arregloB.length, 1);

        // Mostrar arregloA y arregloB por pantalla
        System.out.println("Arreglo A después de ordenar:");
        mostrarArreglo(arregloA);
        System.out.println("Arreglo B:");
        mostrarArreglo(arregloB);
    }

    private static void mostrarArreglo(int[] arreglo) {
        for (double elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    public Object numeros;
}


