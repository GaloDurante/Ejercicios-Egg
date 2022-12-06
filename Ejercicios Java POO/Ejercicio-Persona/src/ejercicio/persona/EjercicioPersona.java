/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.persona;

import Entidad.Persona;
import java.util.Scanner;


public class EjercicioPersona {

  
    public static void main(String[] args) {
        
        //instanciar con constructor
        Persona p1 = new Persona("Messi", 0, 0);
    
        //modificar con set y llamar con get
        p1.setNombre("Leo Messi");
        System.out.println(p1.getNombre());
        //muestra todo el objeto con sus atributos
        System.out.println(p1.toString());
        
    }
}
