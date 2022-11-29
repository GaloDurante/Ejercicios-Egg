/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg14;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de familias: ");
        int n = leer.nextInt();
        System.out.println("Ingrese cantidad de hijos: ");
        int hijos = leer.nextInt();
        int[][]familias = new int[n][hijos];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Familia "+(i+1));
            int sumaEdades=0;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese edad de su hijo "+(j+1)+": ");
                int edad = leer.nextInt();
                sumaEdades += edad;
                
            }
            System.out.println("El promedio de edad de sus hijos es: "+(sumaEdades/hijos));
            System.out.println("");
        }
        
    }
    
}
