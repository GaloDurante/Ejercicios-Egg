/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int grados, farenheit;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados: ");
        grados = leer.nextInt();
        
        farenheit = 32 + (9*grados/5);
        
        System.out.println("Sus grados son: "+grados);
        System.out.println("En farenheit son: "+farenheit);
    }
    
}
