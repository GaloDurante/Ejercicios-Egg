/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg10;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num =(int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        int resultado;
        
        System.out.println(num+" * "+num2+" = ");
        resultado = leer.nextInt();
        
        while(resultado != num*num2){
            System.out.println("Incorrecto, vuelva a intentar");
            System.out.println("");
            System.out.println(num+" * "+num2+" = ");
            resultado = leer.nextInt();
        }
        System.out.println("CORRECTO!");
        
    }
    
}
