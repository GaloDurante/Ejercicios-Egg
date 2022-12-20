/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.pkg4.Entidades;

/**
 *
 * @author PC
 */
public class NIF {
    private String dni;
    private String letra;

    public NIF() {
    }

    public NIF(String dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public String getDni() {
        return dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
}
