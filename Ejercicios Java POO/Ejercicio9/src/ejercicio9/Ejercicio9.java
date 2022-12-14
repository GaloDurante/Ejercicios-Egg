/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import ejercicio9.Entidades.Matematicas;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Matematicas mat = new Matematicas();
        double num1 =  (Math.random() * 10);
        double num2 =  (Math.random() * 10);
        mat.setNum1(num1);
        mat.setNum2(num2);
        
        System.out.println("Primer numero: "+mat.getNum1());
        System.out.println("Segundo numero: "+mat.getNum2());
        
        double mayor = mat.devolverMayor();
        System.out.println("El mayor es: "+mayor);
        double potencia = mat.calcularPotencia();
        System.out.println("La potencia del numero mayor es: "+potencia);
        double raiz = mat.calculaRaiz();
        System.out.println("La raiz cuadrada del numero menor es: "+raiz);
         
    }
    
}
