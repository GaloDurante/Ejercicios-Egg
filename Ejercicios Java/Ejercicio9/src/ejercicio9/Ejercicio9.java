/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        
        ValidarFrase(frase);
    }
    
    public static void ValidarFrase(String frase){
        if(frase.substring(0, 1).equals("a")){
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto papu");
        }
    }
}
