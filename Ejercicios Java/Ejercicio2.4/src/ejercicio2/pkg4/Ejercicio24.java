/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Ingrese un numero(1-10): ");
            numero = leer.nextInt();
        }while(numero<1 || numero>10);
        
        
        switch(numero){
            case 1:
                System.out.println("Su equivalencia en Romano es: I");
                break;
            case 2:
                 System.out.println("Su equivalencia en Romano es: II");
                break;
            case 3:
                 System.out.println("Su equivalencia en Romano es: III");
                break;
            case 4:
                 System.out.println("Su equivalencia en Romano es: IV");
                break;
            case 5:
                 System.out.println("Su equivalencia en Romano es: V");
                break;
            case 6:
                 System.out.println("Su equivalencia en Romano es: VI");
                break;
            case 7:
                 System.out.println("Su equivalencia en Romano es: VII");
                break;
            case 8:
                 System.out.println("Su equivalencia en Romano es: VIII");
                break;
            case 9:
                 System.out.println("Su equivalencia en Romano es: IX");
                break;
            case 10:
                 System.out.println("Su equivalencia en Romano es: X");
                break;
        }
    }
    
}
