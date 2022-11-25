/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, contPares=0, contImpares=0;
        
        do{
           do{
               System.out.println("Ingrese un numero: ");
               num = leer.nextInt();
           }while(num<1);
           
           if(num%2 == 0){
               contPares++;
           }else{
               contImpares++;
           }    
       }while(num%5 != 0);
        System.out.println("Cantidad de pares: "+contPares);
        System.out.println("Cantidad de impares: "+contImpares);
    }
    
}
