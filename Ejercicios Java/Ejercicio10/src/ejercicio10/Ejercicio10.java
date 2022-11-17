/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite, suma = 0, numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite(numero): ");
        limite = leer.nextInt();
        
        for(int i = 0; suma<limite; i++){
            System.out.println("Ingrese un numero: ");
            numero = leer.nextInt();
            suma+= numero;
        }
        System.out.println("La sumatoria total es de: "+suma);
    }
    
}
