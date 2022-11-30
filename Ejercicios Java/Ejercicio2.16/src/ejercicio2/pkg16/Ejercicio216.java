/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg16;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String resp;
        
        do{
            System.out.println("Ingrese su nombre: ");
            String nombre = leer.next();
            System.out.println("Ingrese su edad: ");
            int edad = leer.nextInt();
            if(edad >= 18){
                System.out.println("Usted es mayor de 18 años.");
            }else{
                System.out.println("Usted es menor de edad.");
            }
            System.out.println("Desea seguir cargando datos(si/no): ");
            resp = leer.next();
            
        }while(resp.equals("si"));
        
    } 
}
