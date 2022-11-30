/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg23;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][]sopa = new String[20][20];
        
        
        //inicilizarla
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
               int num = (int)(Math.random()*10);
               sopa[i][j] = Integer.toString(num);
            }
        }
        
        //poner palabras en la sopa ya inicializada
        String palabra;
        for (int i = 0; i < 5; i++) {
            do{
                System.out.println("Ingrese una palabra de 3-5 letras: ");
                palabra = leer.next();
            }while(palabra.length()<3 || palabra.length()>5);
            
            int fila = (int)(Math.random()*20);
            int col = (int)(Math.random()*15);
            int cont = 0;
            
            for (int j = col; j < (col+palabra.length()) ; j++) {
                sopa[fila][j] = palabra.substring(cont, cont+1);
                cont++;
            }
        }
        
        //mostrar sopa de letras
        System.out.println("SOPA DE LETRAS");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    
}
