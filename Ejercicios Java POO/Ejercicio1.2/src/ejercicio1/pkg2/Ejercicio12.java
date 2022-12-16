/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.pkg2;

import ejercicio1.pkg2.Entidades.Puntos;
import ejercicio1.pkg2.Servicios.ServiciosPuntos;

/**
 *
 * @author PC
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPuntos sp = new ServiciosPuntos();
        Puntos p = sp.crearPuntos();
        
        System.out.println("distancia entre los puntos ");
        System.out.println("Punto 1: "+p.getX1()+", "+p.getY1());
        System.out.println("Punto 2: "+p.getX2()+", "+p.getY2());
        double distancia = sp.distanciaEntrePuntos(p);
        System.out.println(distancia);
        
    }
    
}
