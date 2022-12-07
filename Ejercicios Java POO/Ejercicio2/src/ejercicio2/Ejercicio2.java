/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.Entidades.Circunferencia;
import ejercicio2.Servicios.ServicioCircunferencia;

/**
 *
 * @author PC
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double area, perimetro;
        
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia circun = sc.crearCircunferencia();

       
        area = sc.area(circun);
        perimetro = sc.perimetro(circun);
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
    }
    
}
