/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.Servicios;

import ejercicio8.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiciosCadena {
    Scanner leer = new Scanner(System.in);
    
    public void mostrarVocales(Cadena c){
        int contA=0, contE=0, contI=0, contO=0, contU=0;
        String frase = c.getFrase();
        
        for (int i = 0; i < c.getLongitud(); i++) {
            switch(frase.substring(i, i+1).toLowerCase()){
                case "a":
                    contA++;
                    break;
                case "e":
                    contE++;
                    break;
                case "i":
                    contI++;
                    break;
                case "o":
                    contO++;
                    break;
                case "u":
                    contU++;
                    break;
            }
        }
        System.out.println("Cantidad de A: "+contA);
        System.out.println("Cantidad de E: "+contE);
        System.out.println("Cantidad de I: "+contI);
        System.out.println("Cantidad de O: "+contO);
        System.out.println("Cantidad de U: "+contU);
    }
    
    public void invertirFrase(Cadena c){
        String frase = c.getFrase();
        String nuevaFrase = "";
        
        for (int i = c.getLongitud()-1; i >= 0; i--) {
            nuevaFrase += frase.substring(i, i+1);
        }
        System.out.println("Su nueva frase es: ");
        System.out.println(nuevaFrase);
    }
    
    public void vecesRepetido(Cadena c, String letra){
        String frase = c.getFrase();
        int contLetra = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
           if(frase.substring(i, i+1).equals(letra)){
               contLetra++;
           }
        }
        System.out.println("La letra "+letra.toUpperCase()+" se repite: "+contLetra);
    }
    
    public void compararLongitud(Cadena c, String cadena){
        
        if(c.getLongitud() > cadena.length()){
            System.out.println("La cadena ingresada es menor al objeto.");
        }else if(c.getLongitud() == cadena.length()){
            System.out.println("Las longitudes son iguales.");
        }else{
            System.out.println("La cadena ingresada es mayor al objeto.");
        }
    }
}
