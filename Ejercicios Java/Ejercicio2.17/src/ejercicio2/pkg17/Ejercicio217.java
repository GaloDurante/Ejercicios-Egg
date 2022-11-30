/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg17;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        
        boolean primo = esPrimo(num);
        System.out.println("Su numero es primo: "+primo);       
    }
    
    public static boolean esPrimo(int num){
        
        if(num == 0 || num == 1 || num == 4){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
