/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.Entidades.Libro;
import ejercicio1.Servicios.ServicioLibro;

/**
 *
 * @author PC
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioLibro sl = new ServicioLibro();
        Libro miLibro = sl.crearLibro();
        sl.devolverDatos(miLibro);
        
    }
    
}
