/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12.Servicios;

import ejercicio12.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiciosPersona {
    private Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        
        System.out.println("Ingrese fecha de nacimiento(Y/M/D):");
        int año = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        Date nacimiento = new Date(año-1900, mes-1, dia);
        return new Persona(nombre, nacimiento);
    }
    
    public int calcularEdad(Persona p){
        Date fechaActual = new Date();
        
        int edad = fechaActual.getYear()-p.getNacimiento().getYear();
        return edad;
    }
    
    public boolean menorQue(Persona p, int edad){
       
        return (edad > calcularEdad(p));
            
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("fecha de nacimiento: "+p.getNacimiento());
    }
}
