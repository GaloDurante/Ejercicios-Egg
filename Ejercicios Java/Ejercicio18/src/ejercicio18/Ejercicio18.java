/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];
       
        llenarArreglo(matriz);
        mostrarArreglo(matriz);
    }
    
    public static void llenarArreglo(int[][] matriz){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int numero = (int)(Math.random()*10);
                matriz[i][j] = numero;
            }
        }
    }
    
    public static void mostrarArreglo(int[][] matriz){
        System.out.println("Matriz normal: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz traspuesta: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
