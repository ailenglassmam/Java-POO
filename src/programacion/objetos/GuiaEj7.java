/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Person;
import Servicio.PersonaService;

/**
 *
 * @author psmfa
 */
public class GuiaEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //primero se llama al class service para instanciar una nueva personaService
        PersonaService ps1 = new PersonaService();
        
     // llamas al metodo crearPersona de personaService creando nuevos objetos   
        Person p1 = ps1.crearPersona();
        Person p2 = ps1.crearPersona();
        Person p3 = ps1.crearPersona();
        
     calcularPorcentajeIMC(p1, p2, p3);   
    }
    public static void calcularPorcentajeIMC(Person p1, Person p2, Person p3){
       PersonaService ps1 = new PersonaService();
        int IMC1 = ps1.calcularIMC(p1);
        int IMC2 =ps1.calcularIMC(p2);
        int IMC3 = ps1.calcularIMC(p3);
             double bajoPeso = 0;
             double pesoIdeal = 0;
             double sobrePeso = 0;
             
        if(IMC1 == -1 && IMC2 == -1 && IMC3 == -1){
            bajoPeso += 1;
           
        }else if(IMC1 == 0 && IMC2 == 0 && IMC3 == 0){
            pesoIdeal += 1;
        }else {
            sobrePeso += 1;
        }
    
        bajoPeso *= 0.33;
        pesoIdeal *= 0.33;
        sobrePeso *= 0.33;
       
        System.out.println("las personas que tienen su peso por debajo del promedio ideal son: "+ bajoPeso);
        System.out.println("las personas que tienen su peso en promedio ideal son: "+ pesoIdeal);
        System.out.println("las personas que tienen su peso por arriba del promedio ideal son: "+ sobrePeso);
    }
}
