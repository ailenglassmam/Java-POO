package Entidad;

//    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
import java.util.Scanner;

//    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). //listo
//    Las operaciones asociadas a dicha clase son:
//    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. // listo
//    b) Agregar los métodos getters y setters correspondientes // listo
//    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. // listo
//    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//    y se la sumara a saldo actual. // listo
//    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//    pondrá el saldo actual en 0. // listo
//    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//    usuario no saque más del 20%. // listo
//    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. //listo
//    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
public class Cuenta {

    Scanner leer = new Scanner(System.in);
    private int numeroCuenta;
    private long DNI;
    private String titular;
    private int saldoActual = 5000;
    private double ingreso;
    private double retiro;
    private double retiroExpress;
    private double saldoDisponible;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, String titular, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getRetiroExpress() {
        return retiroExpress;
    }

    public void setRetiroExpress(double retiroExpress) {
        this.retiroExpress = retiroExpress;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {

        System.out.println("Por favor, ingrese nombre completo del titular, número de cuenta y DNI");
        System.out.println("Nombre y apellido:");
        titular = leer.nextLine();
        System.out.print("Número de cuenta:");
        numeroCuenta = leer.nextInt();
        System.out.print("DNI:");
        DNI = leer.nextLong();
        System.out.println("Ingreso a cuenta exitoso");
    }

    public void ingresar() {
        System.out.println("Ingrese el monto a depositar");
        ingreso = leer.nextDouble();
        saldoActual += ingreso;
        System.out.println("Su saldo actual es de: $" + saldoActual);
    }

    public void retirar() {
        System.out.println("Ingrese el monto a retirar");
        retiro = leer.nextDouble();
        saldoActual -= retiro;
        if (saldoActual <= 0) {
            saldoActual = 0;
        } else {
            System.out.println("Su saldo actual es de: $" + saldoActual);
        }
    }

    public void extraccionRapida() {
        System.out.println("Ingrese el monto a retirar express");
        retiroExpress = leer.nextDouble();
        saldoDisponible = (20 * saldoActual) / 100;

        if (retiroExpress > saldoDisponible) {
            System.out.println("Lo sentimos. Este tipo de extracción solo permite retirar montos inferiores a $" + saldoDisponible);
            saldoActual -= saldoDisponible;
            System.out.println("Su saldo actual es de: $" + saldoActual);
        } else {
            saldoActual -= retiroExpress;
            System.out.println("Su saldo actual es de: $" + saldoActual);
        }
    }
    
    public void consultarSaldo() {
        System.out.println("Saldo disponible en la cuenta: $" + saldoActual);
    }
    
//    Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos() {
        System.out.println("Datos de la cuenta");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("DNI: " + DNI);
        System.out.println("Saldo disponible en la cuenta: " + saldoActual);
    }
    
    
}
