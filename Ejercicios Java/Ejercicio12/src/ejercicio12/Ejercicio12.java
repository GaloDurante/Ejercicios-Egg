/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int contadorCorrectas = 0, contadorIncorrectas = 0;
        
        do{
            System.out.println("Ingrese una cadena(max 5 caracteres): ");
            cadena = leer.nextLine();
            if(cadena.length()<=5 && cadena.substring(0,1).equals("x") && cadena.substring(cadena.length()-1).equals("o")){
                contadorCorrectas++;
            } else {
                contadorIncorrectas++;
            }
        }while(!cadena.equals("&&&&&"));
        
        System.out.println("Palabras correctas: "+contadorCorrectas);
        System.out.println("Palabras incorrectas: "+contadorIncorrectas);
    }
    
}
