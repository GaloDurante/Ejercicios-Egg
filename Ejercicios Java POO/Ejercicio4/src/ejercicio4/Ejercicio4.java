/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.Entidades.Rectangulo;
import ejercicio4.Servicios.ServiciosRectangulo;

/**
 *
 * @author PC
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int superficie, perimetro;
        
        ServiciosRectangulo sr = new ServiciosRectangulo();
        Rectangulo rect = sr.crearRectangulo();
        
        superficie = sr.calcularSuperficie(rect);
        System.out.println("Superficie: "+superficie);
        
        perimetro = sr.calcularPerimetro(rect);
        System.out.println("Perimetro: "+perimetro);
        
        System.out.println("RECTANGULO: ");
        sr.dibujarRectangulo(rect);
    }
    
}
