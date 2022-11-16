/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabucles;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JavaBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
        Scanner leer = new Scanner(System.in);

        for(int i = 0; i<4; i++){
            System.out.println("Ingrese numero "+(i+1)+": ");
            num = leer.nextInt();
            System.out.print(num);
            for(int j = 0; j<num; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
           
    }
    
}
