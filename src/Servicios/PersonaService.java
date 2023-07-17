/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Person;
import java.util.Scanner;

/**
 *
 * @author psmfa
 */
public class PersonaService {
   
    public Person crearPersona(){
   Scanner leer = new Scanner(System.in);
        Person p1 = new Person();
        System.out.println("ingrese el nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("ingrese la edad");
        p1.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("ingrese el sexo");
        p1.setSexo(leer.nextLine());
         do {System.out.println("El sexo ingresado no es correcto. Ingrese H, M, O para elegir el sexo");
            System.out.println("ingrese el sexo");
            p1.setSexo(leer.nextLine());
        }
        while (!"H".equals(p1.getSexo()) && !"M".equals(p1.getSexo()) && !"O".equals(p1.getSexo()));
            
        
        
        System.out.println("ingrese el peso");
        p1.setPeso(leer.nextDouble());
        
         System.out.println("ingrese la altura");
        p1.setAltura(leer.nextDouble());
       
       
     return p1;  
   }
    
    public int calcularIMC(Person p1){
        double IMC;
        IMC = p1.getPeso()/Math.pow(p1.getAltura(), 2);
        if(IMC < 20){
            System.out.println("Esta por debajo de su peso ideal");
            return -1;
        }else if(IMC >= 20 && IMC <= 25){
            System.out.println("Su peso es ideal");
            return 0;
            
        }else{
            System.out.println("Ud tiene sobrepeso. Comience la dieta!!!!! asi no llega al verano!!!");
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Person p1){
        if(p1.getEdad() >= 18){
            System.out.println("Ud es mayor de edad");
            return true;
        }else {
            System.out.println("Ud no puede acceder a la informacion porque es menor de edad. LLAME A SUS PADRES!!!!");
          return false;
        }
    }  
    
}
