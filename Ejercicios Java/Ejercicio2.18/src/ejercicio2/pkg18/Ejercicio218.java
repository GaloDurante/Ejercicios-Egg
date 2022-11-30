/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg18;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio218 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector: ");
        int n = leer.nextInt();
        int[]vector = new int[n];
        int suma=0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            vector[i] = num;
            suma += vector[i];
        }
        System.out.println("Vector:");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]+", ");
        }
 
        System.out.println("");
        System.out.println("La suma de los numeros del vector es: "+suma);
    }
    
}
