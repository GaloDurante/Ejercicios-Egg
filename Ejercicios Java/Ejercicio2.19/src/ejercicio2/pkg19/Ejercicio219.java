/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg19;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de los vectores: ");
        int n = leer.nextInt();
        int[]vector1 = new int[n];
        int[]vector2 = new int[n];
        llenarVectores(vector1, vector2, n);
        boolean bandera = compararVectores(vector1, vector2, n);
        System.out.println("Son iguales??: "+bandera);
    }
    
    public static void llenarVectores(int[]vector1, int[]vector2, int n){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Vector 1");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero: ");
            int numero = leer.nextInt();
            vector1[i] = numero;
        }
        System.out.println("Vector 2");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero: ");
            int numero = leer.nextInt();
            vector2[i] = numero;
        }
    }
    
    public static boolean compararVectores(int[]vector1, int[]vector2,int n){
        
        for (int i = 0; i < n; i++) {
            if(vector1[i] != vector2[i]){
                return false;
            }
        }
        return true;
    }
}
