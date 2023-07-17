package Servicios;

import Entidad.Matematica;

public class servicioMatematica {
    
    Matematica c1 = new Matematica();

//      se creará el objeto y se usará el Math.random para generar los dos números
//      se guardaran en el objeto con su respectivos set. 
    public void crearObjeto() {
        int n1 = (int) (Math.random() * 200);
        int n2 = (int) (Math.random() * 200);

        c1.setNum1(n1);
        c1.setNum2(n2);
    }

//      a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public int devolverMayor() {

        int mayorValor;

        if (c1.getNum1() > c1.getNum2()) {
            System.out.println("El numero 1 es " + c1.getNum1() + " y es mayor al numero 2 " + c1.getNum2());
            mayorValor = c1.getNum1();
        } else {
            System.out.println("El numero 1 es " + c1.getNum1() + " y es menor al numero 2 " + c1.getNum2());
            mayorValor = c1.getNum2();
        }

        return mayorValor;
    }

//          b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. 
//        Previamente se deben redondear ambos valores.
    public int calcularPotencia() {
        int mayorValor = devolverMayor();
        int menorValor = Math.min(c1.getNum1(), c1.getNum2());

        int potencia = (int) Math.pow(mayorValor, menorValor);
        return potencia;
    }
    
    //             c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
//             Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    
    public int calcularRaiz() {
        int menorValor = Math.min(c1.getNum1(), c1.getNum2());
        int raizCuadrada = ((int) (Math.sqrt(menorValor)));
        
        return raizCuadrada;
    }
}
