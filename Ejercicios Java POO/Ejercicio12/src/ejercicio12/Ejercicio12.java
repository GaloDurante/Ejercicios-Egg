/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import ejercicio12.Entidades.Persona;
import ejercicio12.Servicios.ServiciosPersona;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ServiciosPersona sp = new ServiciosPersona();
        Persona per = sp.crearPersona();
        
        int edad = sp.calcularEdad(per);
        System.out.println("Edad: "+edad);
        
        System.out.println("Ingrese edad a comparar: ");
        edad = leer.nextInt();
        boolean menor = sp.menorQue(per, edad);
        System.out.println("La edad de "+per.getNombre()+" es menor?: "+menor);
        
        sp.mostrarPersona(per);
    }
    
}
