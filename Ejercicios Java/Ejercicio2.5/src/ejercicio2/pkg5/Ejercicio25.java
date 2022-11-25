/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg5;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        double importe;
        
        System.out.println("Ingrese clase de socio(A/B/C): ");
        letra = leer.nextLine();
        System.out.println("Ingrese importe del tratamiento: ");
        importe = leer.nextDouble();
        
        switch(letra.toLowerCase()){
            case "a":
                importe -= (importe*50)/100;
                System.out.println("Usted debe abonar: "+importe);
                break;
            case "b":
                importe -= (importe*35)/100;
                System.out.println("Usted debe abonar: "+importe);
                break;
            case "c":
                System.out.println("Usted debe abonar: "+importe);
                break;
        }
        
    }
    
}
