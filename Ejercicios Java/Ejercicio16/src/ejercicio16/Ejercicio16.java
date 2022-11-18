/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector: ");
        n = leer.nextInt();
        double[] vector = new double[n];
       
        
        for(int i = 0; i<n-1; i++){
            vector[i] = Math.round(Math.random()*100);
        }
        MostrarVector(vector, n);
        BuscarNumero(vector, n);
    }
    public static void MostrarVector(double[] vector, int n){
        
        System.out.println("Vector: ");
        for(int i = 0; i<n-1; i++){
            System.out.print(vector[i]+", ");
        }
        System.out.println("");
    }
    public static void BuscarNumero(double[] vector, int n){
        double numero;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero a buscar: ");
        numero = leer.nextDouble();
       
        
        for(int i = 0; i<n-1; i++){
            if(numero == vector[i]){
                System.out.println("Se encuentra en la posicion: "+i);
            }
        }   
    }
}
