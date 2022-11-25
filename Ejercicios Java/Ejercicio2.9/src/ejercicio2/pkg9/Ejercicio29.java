/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg9;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int dividiendo, divisor, cociente=0,resto;
        System.out.println("Ingresar numero: ");
        dividiendo = leer.nextInt();
        System.out.println("Ingresar numero por el que desea dividir: ");
        divisor = leer.nextInt();
        
        do{
            dividiendo -= divisor;
            resto = dividiendo;
            cociente++;
        }while(resto>divisor);
        System.out.println("El cociente es: "+cociente);
        System.out.println("El resto es: "+resto);
    }
    
}
