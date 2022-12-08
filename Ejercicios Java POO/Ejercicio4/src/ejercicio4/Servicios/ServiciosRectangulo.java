/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.Servicios;

import ejercicio4.Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiciosRectangulo {
    private Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        
        System.out.println("Ingrese base del rectangulo: ");
        int base = leer.nextInt();
        
        System.out.println("Ingrese altura del rectangulo: ");
        int altura = leer.nextInt();
        
        return new Rectangulo(base, altura);
    }
    
    public int calcularSuperficie(Rectangulo r){
        return r.getBase() * r.getAltura();
    }
    
    public int calcularPerimetro(Rectangulo r){
        return (r.getBase() + r.getAltura()) * 2;
    }
    
    public void dibujarRectangulo(Rectangulo r){
        
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                
                if (i == 0 || i == r.getAltura()-1) {
                    System.out.print("*");
                } else if (j == 0 || j == r.getBase()-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
}
