/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg13;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de la escalera: ");
        int largo = leer.nextInt();
        
        for (int i = 2; i < largo+2; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
