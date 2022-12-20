/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.pkg4;

import ejercicio1.pkg4.Entidades.NIF;
import ejercicio1.pkg4.Servicios.ServiciosNIF;

/**
 *
 * @author PC
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiciosNIF sn = new ServiciosNIF();
        NIF ni = sn.crearNif();
        
        sn.mostrar(ni);
    }
    
}
