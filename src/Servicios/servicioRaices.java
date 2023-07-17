package Servicios;

import Entidad.Raices;

//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
public class servicioRaices {

    Raices p1 = new Raices(3, -10, 6);
    
//    (-b±√((b^2)-(4*a*c)))/(2*a)
    
    // (-10 + √ (100) - (72)) / 6
    // -10 + √28 / 6
    // -10 + 5,29 / 6
    
//    Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public static double getDiscriminante(Raices p1) {
//        System.out.println((Math.pow(p1.getB(), 2)) - 4 * p1.getA() * p1.getC());
        return (Math.pow(p1.getB(), 2)) - 4 * p1.getA() * p1.getC();
    }

    //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices() {
        if (getDiscriminante(p1) > 0.0) {
            return true;
        }
        return false;

    }

    // Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz() {
        if (getDiscriminante(p1) == 0) {
            return true;
        }
        return false;
    }

    // Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//posibles soluciones.
    public void obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("Resultado 1:  " + (-p1.getB() + Math.sqrt(getDiscriminante(p1))) / 2 * p1.getA());
            System.out.println("");
            System.out.println("Resultado 2:  " + (-p1.getB() - Math.sqrt(getDiscriminante(p1))) / 2 * p1.getA());
        }
    }

    // Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz() {
        if (tieneRaiz()) {
            System.out.println("Resultado 1:  " + (-p1.getB() + Math.sqrt(getDiscriminante(p1))) / 2 * p1.getA());
        }
    }

    // Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    public void calcular() {
        System.out.println(tieneRaices());
        obtenerRaices();
        System.out.println("Cálculo cuando solo tiene 1 solución posible");
        System.out.println(tieneRaiz());
        obtenerRaiz();
    }
}
