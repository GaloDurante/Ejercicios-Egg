/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,d, aux;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese valor A: ");
        a = leer.nextInt();
        System.out.println("Ingrese valor B: ");
        b = leer.nextInt();
        System.out.println("Ingrese valor C: ");
        c = leer.nextInt();
        System.out.println("Ingrese valor D: ");
        d = leer.nextInt();
        
        //cambiar valores
        aux = a;
        a = d;
        d = b;
        b = c;
        c = aux;
        
        System.out.println("Los valores cambiados son: ");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
        System.out.println("D: "+d);
        
    }
    
}
