/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.Entidades;

/**
 *
 * @author PC
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int numPaginas;
    private int ISBN;

    //constructores
    public Libro() {
    }

    public Libro(String titulo, String autor, int numPaginas, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

       
}
