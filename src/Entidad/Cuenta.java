package Entidad;

//    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
import java.util.Scanner;

//    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
//    Las operaciones asociadas a dicha clase son:
//    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. // listo
//    b) Agregar los métodos getters y setters correspondientes // listo
//    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//    y se la sumara a saldo actual.
//    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//    pondrá el saldo actual en 0.
//    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//    usuario no saque más del 20%.
//    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
public class Cuenta {

    private int numeroCuenta;
    private long DNI;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
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
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese su número de cuenta y DNI");
        numeroCuenta = leer.nextInt();
        DNI = leer.nextLong();
    }

}
