/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2;
        int opcion = 0;
        
        do{
            System.out.println("Ingrese el primer numero: ");
            num1 = leer.nextDouble();
        
            System.out.println("Ingrese el segundo numero: ");
            num2 = leer.nextDouble();
        
            System.out.println("*** MENU ***");
            System.out.println("1- Sumar");
             System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Salir");
            System.out.println("Elija una opcion: ");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La suma es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("La division es: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }   
        }while(opcion != 5);
    }
}
