/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros;
        int op;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese una cantidad de Euros €: ");
            euros = leer.nextDouble();
            
            System.out.println("1- Convertir a Dolares");
            System.out.println("2- Convertir a yenes");
            System.out.println("3- Convertir a Libras");
            System.out.println("0- Salir");
            System.out.println("Elija una opcion: ");
            op = leer.nextInt();
            ConvertirMoneda(euros, op);
        }while(op != 0);       
    }
    public static void ConvertirMoneda(double euros, int op){
        switch(op){
            case 1:
                System.out.println("Sus euros equivalen a: "+(euros*1.28661)+" dolares");
                break;
            case 2:
                System.out.println("Sus euros equivalen a: "+(euros*129.852)+" yenes");
                break;
            case 3:
                System.out.println("Sus euros equivalen a: "+(euros*0.86)+" libras");
                break;
        }
    }
    
}
