/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.Servicios;

import ejercicio2.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServicioCircunferencia {
    private Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Ingrese el tamaño del radio: ");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
    }
    
    public double area(Circunferencia c){
        return 3.14 * (c.getRadio()*c.getRadio());
    }
    
    public double perimetro(Circunferencia c){
        return 2 * 3.14 * c.getRadio();
    }
}
