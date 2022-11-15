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
     
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli del 1 al 5 estrellas");
        opinion = leer.nextInt();
        
        if(opinion >= 1 && opinion <= 5){
            switch (opinion){
                case 1: 
                    System.out.println("Solo 1 estrellas? morite");
                    break;
                case 2:
                    System.out.println("Solo 2 estrellas? gay");
                    break;
                case 3:
                    System.out.println("Solo 3 estrellas? forro");
                    break;
                case 4:
                    System.out.println("4 estrellas gooood");
                    break;
                case 5:
                    System.out.println("PERFECT");
                    break;
            }
            
        }else if(opinion < 0) {
            System.out.println("Opinion negativa? posta morite");
        }else if(opinion == 0) {
            System.out.println("El valor "+opinion+ " no se toma en cuenta");
        }else{
            System.out.println("SUPER GOOOOOOOOOOOD");
        }
    }
    
}
