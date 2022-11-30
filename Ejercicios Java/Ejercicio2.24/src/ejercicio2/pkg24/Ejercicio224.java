/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg24;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio224 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de numeros que desea de Fibonacci: ");
        int n = leer.nextInt();
        int a=0, b=1, c;
        int[]vector = new int[n];
        for (int i = 0; i < n; i++){
            vector[i] = a;
            c = a+b;
            a = b;
            b = c;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]+", ");
        }
        
    }
    
}
