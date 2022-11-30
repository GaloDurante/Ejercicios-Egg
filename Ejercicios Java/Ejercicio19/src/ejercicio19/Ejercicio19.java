/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
       
        llenarArreglo(matriz);
        mostrarArreglo(matriz);
        verificarArreglo(matriz);
    }
    
    public static void llenarArreglo(int[][] matriz){
        Scanner leer = new Scanner(System.in);
        int numero;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //int numero = (int)(Math.random()*10);
                System.out.println("Ingrese numero: ");
                numero = leer.nextInt();
                matriz[i][j] = numero;
            }
        }
    }
    
    public static void mostrarArreglo(int[][] matriz){
        System.out.println("Matriz normal: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz traspuesta: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void verificarArreglo(int[][] matriz){
        boolean bandera = false;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matriz[i][j]!= matriz[j][i]*-1){
                    System.out.println("La matriz no es anti simetrica.");
                    bandera = true;
                    break;
                }
            }
            if(bandera == true){
                    break;
                }
        }
    }
    
}
