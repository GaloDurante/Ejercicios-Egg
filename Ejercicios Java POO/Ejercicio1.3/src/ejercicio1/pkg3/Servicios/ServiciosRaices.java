/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.pkg3.Servicios;

import ejercicio1.pkg3.Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiciosRaices {
    private Scanner leer = new Scanner(System.in);
    
    public Raices crearRaices(){
        System.out.println("Usted va a ingresar los coeficientes A, B y C");
        System.out.println("Ingrese A: ");
        double a = leer.nextDouble();
        
        System.out.println("Ingrese B: ");
        double b = leer.nextDouble();
        
        System.out.println("Ingrese C: ");
        double c = leer.nextDouble();
        
        return new Raices(a, b, c);
    }
    
    public double getDiscriminante(Raices c){
        return (Math.pow(c.getB(), 2)- 4 * c.getA() * c.getC() );
    }
    
    public boolean tieneRaices(Raices c){
        double discriminante = getDiscriminante(c);
        if(discriminante >0){
            return true;
        }else return false;
    }
    
    public boolean tieneRaiz(Raices c){
        double discriminante = getDiscriminante(c);
        if(discriminante == 0){
            return true;
        }else return false;
    }
    
    //metodo mejorado que calcula directamente sin usar 2 metodos al pedo
    public void calcular(Raices c){
        boolean raices = tieneRaices(c);
        
        if(raices){
            double raiz1;
            double raiz2;
            raiz1 = ((-1* c.getB()) + Math.sqrt(getDiscriminante(c))) / (2*c.getA());
            raiz2 = ((-1* c.getB()) - Math.sqrt(getDiscriminante(c))) / (2*c.getA());
            
            System.out.println("Raiz 1: "+raiz1);
            System.out.println("Raiz 2: "+raiz2);
        } else{
            
            boolean raiz = tieneRaiz(c);
            
            if(raiz){
                double raizUnica;
                raizUnica = ((-1* c.getB()) + Math.sqrt(getDiscriminante(c))) / (2*c.getA());
                System.out.println("Unica raiz: "+raizUnica);
            } else{
                System.out.println("No existe solucion.");
            }
        }
        
    }
}
