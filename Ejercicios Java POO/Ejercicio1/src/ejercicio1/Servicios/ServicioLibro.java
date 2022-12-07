/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.Servicios;

import ejercicio1.Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServicioLibro {
    
        private Scanner leer = new Scanner(System.in);
        
        public Libro crearLibro(){
            
            System.out.println("Ingrese titulo del libro: ");
            String titulo = leer.next();
        
            System.out.println("Ingrese autor del libro: ");
            String autor = leer.next();
        
             System.out.println("Ingrese numero de paginas del libro: ");
             int pags = leer.nextInt();
        
            System.out.println("Ingrese numero ISBN del libro: ");
            int ISBN = leer.nextInt();
        
            return  new Libro(titulo, autor, pags, ISBN);
        }
        
        public void devolverDatos(Libro l){
            System.out.println("Autor: "+l.getAutor());
            System.out.println("Titulo: "+l.getTitulo());
            System.out.println("Numero de paginas: "+l.getNumPaginas());
            System.out.println("ISBN: "+l.getISBN());
    }
}
