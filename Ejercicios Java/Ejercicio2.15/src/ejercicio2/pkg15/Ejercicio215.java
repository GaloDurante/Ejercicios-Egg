/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg15;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio215 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado;
                
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("Elija una opcion: ");
        int op = leer.nextInt();
        switch(op){
            case 1: resultado = sumar(num, num2);
                    System.out.println("El resultado es: "+resultado);
                    break;
            case 2: resultado = restar(num, num2);
                    System.out.println("El resultado es: "+resultado);
                    break;
            case 3: resultado = multiplicar(num, num2);
                    System.out.println("El resultado es: "+resultado);
                    break;
            case 4: resultado = dividir(num, num2);
                    System.out.println("El resultado es: "+resultado);
                    break;
        }
    }
    public static int sumar(int num, int num2){
        return num+num2;
    }
    
    public static int restar(int num, int num2){
        return num-num2;
    }
    
    public static int multiplicar(int num, int num2){
        return num*num2;
    }
    
    public static int dividir(int num, int num2){
        return num/num2;
    }
    
}
