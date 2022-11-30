/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg21;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio221 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contAprobados = 0, contReprobados = 0;
        
        double[]vector = new double[2];
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese nota del primer trabajo practico: ");
            double practico1 = leer.nextInt();
            System.out.println("Ingrese nota del segundo trabajo practico: ");
            double practico2 = leer.nextInt();
            System.out.println("Ingrese nota del primer integrador: ");
            double integrador1 = leer.nextInt();
            System.out.println("Ingrese nota del segundo integrador: ");
            double integrador2 = leer.nextInt();
            
            practico1 *= 0.10;
            practico2 *= 0.15;
            integrador1 *= 0.25;
            integrador2 *= 0.50;
            
            double promedio =  practico1 +  practico2 + integrador1 + integrador2;
            if(promedio >= 7){
                contAprobados++;
            }else{
                contReprobados++;
            }
            vector[i] = promedio;
        }
        System.out.println("Los aprobados son: "+contAprobados);
        System.out.println("Los reprobados son: "+contReprobados);
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Promedio alumno "+(i+1)+": "+vector[i]);
        }
    }
    
    
    
}
