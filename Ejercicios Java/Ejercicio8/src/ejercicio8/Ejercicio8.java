/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        
        Correcto(frase);
    }
    
    public static void Correcto(String frase){
        if(frase.length() == 8){
            System.out.println("Longitud correcta!");
        } else {
            System.out.println("mal mal");
        }
    }
}
