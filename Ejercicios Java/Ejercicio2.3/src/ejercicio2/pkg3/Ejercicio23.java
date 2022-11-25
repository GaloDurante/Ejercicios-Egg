/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra: ");
        letra = leer.nextLine();
        
        if(letra.toLowerCase().equals("a") || letra.toLowerCase().equals("e") || letra.toLowerCase().equals("i") || letra.toLowerCase().equals("o") || letra.toLowerCase().equals("u")){
            System.out.println("Usted ha introducido una vocal.");
        }else{
            System.out.println("La letra ingresada es una consonante");
        }
    }
    
}
