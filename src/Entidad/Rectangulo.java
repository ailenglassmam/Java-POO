package Entidad;

//    Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
import java.util.Scanner;

//    base y un atributo privado altura. 
//    La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
//    También incluirá un método para calcular la superficie del rectángulo
//    un método para calcular el perímetro del rectángulo.
//    Por último, tendremos un método que dibujará el rectángulo mediante
//    asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
//    setters y constructores correspondientes.
//    Superficie = base * altura / Perímetro = (base + altura) * 2.
public class Rectangulo {

    //establezco los atributos
    private double base;
    private double altura;
    private double superficie;
    private double perimetro;

    //creo el constructor vacío
    public Rectangulo() {
    }

    //creo el constructor con todos los atributos
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //creo los métodos get y set de la clase
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // creo el método que le pide al usuario los dos números y los guarda en los atributos del objeto
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese la base y altura del rectangulo para realizar los cálculos");
        base = leer.nextDouble();
        altura = leer.nextDouble();
    }

    //creo el método para Superficie = base * altura
    public double superficie() {
        this.superficie = base * altura;
        return superficie;
    }

    //creo el método para Perímetro = (base + altura) * 2.
    public double perimetro() {
        this.perimetro = (base + altura) * 2;
        return perimetro;
    }
}
