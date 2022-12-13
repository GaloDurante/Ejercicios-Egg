/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.Servicios;

import ejercicio7.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiciosPersona {
    private Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        boolean bandera;
        String sexo;
        
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        
        bandera = false;
        do{
            System.out.println("Ingrese su sexo(H/M/O): ");
            sexo = leer.next();
            if(sexo.toLowerCase().equals("h") ||  sexo.toLowerCase().equals("m") || sexo.toLowerCase().equals("o")){
                bandera = true;
            }else{
                System.out.println("Incorrecto, vuelva a intentar.");
            }
        }while(!bandera);
        
        System.out.println("Ingrese su peso en kg: ");
        int peso = leer.nextInt();
        
        System.out.println("Ingrese su altura en metros: ");
        double altura = leer.nextDouble();
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(Persona p){
        
        double resultado = p.getPeso()/ (p.getAltura()* p.getAltura());
        
        if(resultado < 20){
            return -1;
        }else if(resultado >= 20 && resultado <= 25){
            return 0;
        }else{
            return 1;
        }
        
    } 
    
    public boolean esMayorDeEdad(Persona p){
        return p.getEdad() >= 18;
        
    }
}
