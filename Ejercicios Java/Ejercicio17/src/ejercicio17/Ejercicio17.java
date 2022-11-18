/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector: ");
        n = leer.nextInt();
        double[] vector = new double[n];
       
        
        for(int i = 0; i<n; i++){
            vector[i] = Math.round(Math.random()*99999);
        }
        for(int i = 0; i<n; i++){
            System.out.println(vector[i]+", ");
        }
        
        ContarDigitos(vector, n);
    }
    public static void ContarDigitos(double[] vector, int n){
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, contAux;
        double numAux;
        
        for(int i = 0; i<n; i++){
            
            contAux = 0;
            numAux = (vector[i]);
            do{
                numAux = Math.round(numAux / 10);
                contAux++;
                
            }while(numAux != 0);
            
            switch(contAux){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
        }
        System.out.println("Numeros de 1 digito: "+cont1);
        System.out.println("Numeros de 2 digito: "+cont2);
        System.out.println("Numeros de 3 digito: "+cont3);
        System.out.println("Numeros de 4 digito: "+cont4);
        System.out.println("Numeros de 5 digito: "+cont5);
    }
    
}
