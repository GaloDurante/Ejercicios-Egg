/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import ejercicio7.Entidades.Contadores;
import ejercicio7.Entidades.Persona;
import ejercicio7.Servicios.ServiciosPersona;

/**
 *
 * @author PC
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resp;
        boolean bandera;
        
        //crear personas
        Contadores cont = new Contadores(0, 0, 0, 0, 0);
        ServiciosPersona sp = new ServiciosPersona();
        Persona p1 = sp.crearPersona();
        Persona p2 = sp.crearPersona();
        Persona p3 = sp.crearPersona();
        Persona p4 = sp.crearPersona();
        
        //verificar datos de personas
        resp = sp.calcularIMC(p1);
        System.out.println("Datos "+p1.getNombre());
        calculoPeso(resp, cont);
        bandera = sp.esMayorDeEdad(p1);
        calculoEdad(bandera, cont);
        System.out.println("");
        
        resp = sp.calcularIMC(p2);
        System.out.println("Datos "+p2.getNombre());
        calculoPeso(resp, cont);
        bandera = sp.esMayorDeEdad(p2);
        calculoEdad(bandera, cont );
        System.out.println("");
        
        resp = sp.calcularIMC(p3);
        System.out.println("Datos "+p3.getNombre());
        calculoPeso(resp, cont);
        bandera = sp.esMayorDeEdad(p3);
        calculoEdad(bandera, cont);
        System.out.println("");
        
        resp = sp.calcularIMC(p4);
        System.out.println("Datos "+p4.getNombre());
        calculoPeso(resp, cont);
        bandera = sp.esMayorDeEdad(p4);
        calculoEdad(bandera, cont);
        System.out.println("");
   
        //mostrar datos
        System.out.println("Personas por debajo de su peso ideal: "+cont.getContDebajoPeso());
        System.out.println("Personas con peso ideal: "+cont.getContIdeal());
        System.out.println("Personas con sobrepeso: "+cont.getContSobrepeso());
        System.out.println("Personas mayores de edad: "+cont.getContMayores());
        System.out.println("Personas menores de edad: "+cont.getContMenores());
        
    }
    public static void calculoPeso(int resp, Contadores cont){
        switch(resp){
            case -1:
                System.out.println("-Por debajo de su peso ideal.");
                cont.setContDebajoPeso(cont.getContDebajoPeso()+1);
                break;
            case 0:
                System.out.println("-Peso ideal.");
                cont.setContIdeal(cont.getContIdeal()+1);
                break;
            case 1:
                System.out.println("-Sobrepeso.");
                cont.setContSobrepeso(cont.getContSobrepeso()+1);
                break;
        }
    }
    
    public static void calculoEdad(boolean bandera, Contadores cont){
        if(bandera){
            System.out.println("-Mayor de edad.");
            cont.setContMayores(cont.getContMayores()+1);
        }else{
            System.out.println("-Menor de edad.");
            cont.setContMenores(cont.getContMenores()+1);
        }
    }
}
