package Entidad;

//        Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 

import java.util.Scanner;

//        A continuación, se deben crear los siguientes métodos:
//        a) Método constructor que inicialice el radio pasado como parámetro. 
//        b) Métodos get y set para el atributo radio de la clase Circunferencia. 
//        c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
//        d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐). 
//        e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).

public class Circunferencia {
    
    //declaro el atributo
    private double radio;
    private double area;
    private double perimetro;
    
    //Método constructor que inicialice el radio pasado como parámetro.
    public void Circunferencia(double radio) {
        this.radio = radio;
    }

//    Método set
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
//    Método get
    public double getRadio() {
        return radio;
    }
    
    //creo el método crearCircunferencia() que va a pedirle al usuario que ingrese el dato y luego lo va a almacenar en la variable radio previamente creada
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = leer.nextDouble();
    }
    
    //creo el método de tipo get para calcular el area de la circunferencia
    public double area() {
        this.area = Math.PI * (radio * radio);
        return area;
    }
    
    //creo el método para calcular el perímetro de la circunferencia
    public double perimetro() {
        this.perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
