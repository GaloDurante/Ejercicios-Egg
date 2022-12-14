/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] arreglo1 = new int[50];
        int []arreglo2 = new int[20];
        
        llenarArreglo1(arreglo1);
        mostrarArreglo1(arreglo1);
        ordenarArreglo1(arreglo1);
        mostrarArreglo1(arreglo1);
        llenarArreglo2(arreglo1, arreglo2);
        mostrarArreglo2(arreglo2);
        
    }
    
    public static void mostrarArreglo1(int[]array){
        System.out.println("Array 1: ");
        for (int i = 0; i < 50; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println("");
    }
    
    public static void mostrarArreglo2(int[]array){
        for (int i = 0; i < 20; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println("");
    }
    
    public static void llenarArreglo1(int[] array){
        
        for (int i = 0; i < 50; i++) {
            int num = (int)(Math.random()*10);
            array[i] = num;
        }
    }
    
     public static void ordenarArreglo1(int[] array){
         Arrays.sort(array);
     }
     
     public static void llenarArreglo2(int[]array, int[]array2){
         for (int i = 0; i < 10; i++) {
             array2[i] = array[i];
         }
         Arrays.fill(array2, 10, 20, (int) 99);     
     }
     
}
