/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.pkg2.Servicios;

import ejercicio1.pkg2.Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiciosPuntos {
    private Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        
        System.out.println("Ingrese coordenada x del punto 1: ");
        int x1 = leer.nextInt();
        
        System.out.println("Ingrese coordenada y del punto 1: ");
        int y1 = leer.nextInt();
        
        System.out.println("Ingrese coordenada x del punto 2: ");
        int x2 = leer.nextInt();
        
        System.out.println("Ingrese coordenada x del punto 2: ");
        int y2 = leer.nextInt();
        
        
        return new Puntos(x1, y1, x2, y2);
    }
    
    public double distanciaEntrePuntos(Puntos p){
        double distancia = Math.sqrt((p.getX2()-p.getX1()) * (p.getX2()+p.getX1()) - (p.getY2()-p.getY1()) * (p.getY2()+p.getY1()));
        return distancia;
    }
}
