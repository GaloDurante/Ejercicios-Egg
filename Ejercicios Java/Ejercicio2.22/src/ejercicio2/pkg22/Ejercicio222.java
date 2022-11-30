/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg22;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio222 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese tamaño de filas: ");
        int filas = leer.nextInt();
        System.out.println("Ingrese tamaño de columnas: ");
        int columnas = leer.nextInt();
        int suma=0;
        int[][]matriz = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numero = (int)(Math.random()*10);
                matriz[i][j]=numero;
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de los valores de la matriz es: "+suma);
        System.out.println("");
        System.out.println("Matriz ingresada");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
