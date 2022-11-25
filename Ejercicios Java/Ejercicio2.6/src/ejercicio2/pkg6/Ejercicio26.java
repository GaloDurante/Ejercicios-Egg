/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double altura,cont160=0, alturasT=0, alturas160=0;
        int cant;
        
        System.out.println("Ingrese cantidad de personas: ");
        cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++) {
            do{
                System.out.println("Ingrese altura en centimetros: ");
                altura = leer.nextDouble();
            }while(altura<120 || altura>230);
            
            altura /= 100;
            alturasT+=altura;
            
            if(altura<1.60){
                cont160++;
                alturas160+=altura;
            }
        }
        System.out.println("El promedio de las alturas por debajo del 1.60m es de: "+(alturas160/cont160));
        System.out.println("El promedio de las alturas totales es de: "+(alturasT/cant));
 
    }
    
}
