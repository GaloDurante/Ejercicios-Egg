/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.Entidades.Operacion;
import ejercicio3.Servicios.ServicioOperacion;

/**
 *
 * @author PC
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma, resta, multi, division;
        ServicioOperacion so = new ServicioOperacion();
        Operacion op = so.crearOperacion();
        
       suma = so.sumar(op);
        System.out.println("La suma es: "+suma);
       resta = so.restar(op);
       System.out.println("La resta es: "+resta);
       multi = so.multiplicar(op);
       System.out.println("La multiplicacion es: "+multi);
       division = so.dividir(op);
       System.out.println("La division es: "+division);
       
    }
    
}
