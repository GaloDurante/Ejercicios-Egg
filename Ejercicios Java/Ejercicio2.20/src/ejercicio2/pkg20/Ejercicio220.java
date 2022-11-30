/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg20;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio220 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese tamaño del vector: ");
        int n = leer.nextInt();
        int[]vector = new int[n];
        
        rellenarVector(vector, n);
        mostrarVector(vector, n);
    }
    
    public static void rellenarVector(int[]vector, int n){
        for (int i = 0; i < n; i++) {
            int numero = (int)(Math.random()*10);
            vector[i] = numero;
        }
    }
    
    public static void mostrarVector(int[]vector, int n){
        System.out.println("VECTOR");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]+", ");
        }
        
    }
    
}
