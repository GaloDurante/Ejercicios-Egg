/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        
        Coincide(frase);
    }
    public static void Coincide(String frase){
        if(frase.equals("eureka")){
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto!");
        }
    }
}
