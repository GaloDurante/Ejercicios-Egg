/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese numero 2: ");
        num2 = leer.nextInt();
        
        System.out.println("La suma es: "+(num1+num2));
    
    }
    
}
