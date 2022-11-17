/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        System.out.println("El doble del numero es: "+num*2);
        System.out.println("El triple del numero es: "+num*3);
        System.out.println("La raiz cuadrada es: "+Math.sqrt(num));
    }
    
}
