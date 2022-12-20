/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.pkg3;

import ejercicio1.pkg3.Entidades.Raices;
import ejercicio1.pkg3.Servicios.ServiciosRaices;

/**
 *
 * @author PC
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosRaices sr = new ServiciosRaices();
        Raices c = sr.crearRaices();
        
        System.out.println("Resolvemos...");
        sr.calcular(c);
            
    }
    
}
