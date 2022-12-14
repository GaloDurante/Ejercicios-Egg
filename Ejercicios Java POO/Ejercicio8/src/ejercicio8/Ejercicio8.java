/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import ejercicio8.Entidades.Cadena;
import ejercicio8.Servicios.ServiciosCadena;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        int op;
        ServiciosCadena sc = new ServiciosCadena();
        
        Cadena frase = new Cadena();
        llenarFrase(frase);
        do{
            System.out.println("****** MENU *******");
            System.out.println("1- Mostrar Vocales");
            System.out.println("2- Invertir Frase");
            System.out.println("3- Veces Repetido");
            System.out.println("4- Comparar Longitud");
            System.out.println("5- Unir Frases");
            System.out.println("6- Reemplazar letras A");
            System.out.println("7- Contiene");
            System.out.println("0- SALIR");
            System.out.println("Ingrese una opcion: ");
            op = leer.nextInt();
            switch(op){
                case 1: 
                    sc.mostrarVocales(frase);
                    break;
                case 2:
                    sc.invertirFrase(frase);
                    break;
                case 3: 
                    System.out.println("Ingrese la letra que quiere ver repetida: ");
                    letra = leer.next();
                    sc.vecesRepetido(frase, letra);
                    break;
                case 4:
                    sc.compararLongitud(frase);
                    break;
                case 5: 
                    sc.unirFrases(frase);
                    break;
                case 6:
                    System.out.println("Ingrese una letra para ver lo que pasa: ");
                    letra = leer.next();
                    sc.reemplazarLetra(frase, letra);
                    break;
                case 7: 
                    System.out.println("Ingrese una letra para ver lo que pasa: ");
                    letra = leer.next();
                    sc.contieneLetra(frase, letra);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida, vuelva a intentar.");
            }
        }while(op != 0);
        
    }
    
    public static void llenarFrase(Cadena c){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese frase: ");
        String frase = leer.nextLine();
        c.setFrase(frase);
        c.setLongitud(frase.length());
    }
    
}
