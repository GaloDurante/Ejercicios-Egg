/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg11;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int digitos;
        
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        digitos = devolverDigitos(num);
        System.out.println("Digitos: "+digitos);
    }
    public static int devolverDigitos(int num){
        int cont=0;
        do{
            num /=10;
            cont++;
        }while(num != 0);
        return cont;
    }
    
}
