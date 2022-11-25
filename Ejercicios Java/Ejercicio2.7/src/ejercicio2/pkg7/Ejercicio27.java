/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg7;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese cantidad de numeros: ");
       int limite = leer.nextInt();
        System.out.println("Ingresa al mientras.");
       mientras(limite);
        System.out.println("Ingresa al hacerMientras.");
       hacerMientras(limite);
   
    }
    
    public static void mientras(int limite){
       Scanner leer = new Scanner(System.in);
       int cont=0;
       double num, min, max=0,suma=0;
       
       System.out.println("Ingrese un numero: ");
       num = leer.nextDouble();
       min = num;
       while(cont<(limite-1)){
           
           suma+=num;
           if(num<min){
               min = num;
           }
           cont++;
           if(num>max){
               max = num;
           }
           System.out.println("Ingrese un numero: ");
           num = leer.nextDouble();
       }
       
        System.out.println("El mayor es: "+max);
        System.out.println("El menor es: "+min);
        System.out.println("El promedio es: "+(suma/cont));
    }
    
    
    public static void hacerMientras(int limite){
        Scanner leer = new Scanner(System.in);
        int cont=0;
       double num, min=9999999, max=0,suma=0;
       
       do{
           System.out.println("Ingrese un numero: ");
           num = leer.nextDouble();
           suma+=num;
           if(num<min){
               min = num;
           }
           cont++;
           if(num>max){
               max = num;
           }   
       }while(cont<limite);
       
        System.out.println("El mayor es: "+max);
        System.out.println("El menor es: "+min);
        System.out.println("El promedio es: "+(suma/cont));
    }
    
}

