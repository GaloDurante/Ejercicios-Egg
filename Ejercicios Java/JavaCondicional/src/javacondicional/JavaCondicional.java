/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacondicional;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JavaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int tipoMotor;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese un valor entre 1 y 4: ");
            tipoMotor = leer.nextInt();
        
            switch (tipoMotor){
                case 1: 
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                default: 
                    System.out.println("No existe un valor válido ingresado, intente de nuevo");
                    break;
            } 
        }while(tipoMotor < 1 || tipoMotor > 4);
    }
}
