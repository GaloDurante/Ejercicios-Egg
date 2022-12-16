/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.pkg1;

import ejercicio1.pkg1.Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion can = new Cancion();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nombre de la cancion: ");
        String nombreCan = leer.next();
        can.setTitulo(nombreCan);
        System.out.println("Ingrese autor: ");
        String autor = leer.next();
        can.setAutor(autor);
        
        System.out.println("Cancion: "+can.getTitulo());
        System.out.println("Autor: "+can.getAutor());
    }
    
}
