/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.Servicios;

import ejercicio6.Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServicioCafetera {
    private Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
        System.out.println("Ingrese capacidad maxima de su cafetera(ml): ");
        int capacidadMax = leer.nextInt();
        
        System.out.println("Ingrese cantidad actual en la cafetera (ml):");
        int cantidadActual = leer.nextInt();
        
        return new Cafetera(capacidadMax, cantidadActual);
    }
    
    public void llenarCafetera(Cafetera c){
        int maximo = c.getCapacidadMax(), actual = c.getCantidadActual();
        System.out.println("Su cafetera tenia: "+actual);
        int relleno = maximo - actual;
        actual += relleno;
        c.setCantidadActual(actual);
        System.out.println("Ahora tiene: "+c.getCantidadActual());
    }
    
    public void vaciarCafetera(Cafetera c){
        System.out.println("Su cafetera tenia: "+c.getCantidadActual());
        c.setCantidadActual(0);
        System.out.println("Ahora tiene: "+c.getCantidadActual());
    }
    
    public void agregarCafe(Cafetera c){
        int maximo = c.getCapacidadMax(), actual = c.getCantidadActual();
        System.out.println("Su cafetera tiene: "+actual);
        int relleno = maximo - actual;
        System.out.println("Usted puede agregar hasta "+relleno+" ml.");
        System.out.println("Ingrese cantidad de cafe(ml): ");
        int cafe = leer.nextInt();
        
        if(cafe > relleno){
            System.out.println("Usted se pasó del maximo.");
        } else {
            actual += cafe;
            c.setCantidadActual(actual);
            System.out.println("Ahora tiene: "+c.getCantidadActual());
        }
        
    }
    
    public void servirTaza( Cafetera c, int tamaño){
        
        System.out.println("Su taza tiene un maximo de "+tamaño+" ml.");
        int actual = c.getCantidadActual();
        System.out.println("Su cafetera tiene una cantidad actual de "+actual+" ml.");
        
        if(tamaño < actual){
            System.out.println("Su taza se llenó.");
            actual -= tamaño;
            c.setCantidadActual(actual);
            System.out.println("Su cafetera ahora tiene: "+c.getCantidadActual());
        }else{
            c.setCantidadActual(0);
            System.out.println("Su taza no se llenó, solamente se pudo agregar "+actual+" ml de cafe.");
            System.out.println("Su cafetera ahora tiene: "+c.getCantidadActual());
        }
        
    }
}
