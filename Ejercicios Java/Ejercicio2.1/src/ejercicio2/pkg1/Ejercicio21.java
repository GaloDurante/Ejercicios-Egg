/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int numero, contDias=0, contHoras=0, aux;
       
       System.out.println("Ingrese una cantidad de minutos: ");
       numero = leer.nextInt();
       aux = 0;
       
       for(int i=0;i<numero;i++){
           
           if(i==(aux+60)){
               contHoras++;
               aux+= 60;
           }
           if(contHoras == 24){
               contDias++;
               contHoras=0;
           }
       }
       
        System.out.println(contDias+" dias, "+contHoras+" horas");
        
    }
    
}
