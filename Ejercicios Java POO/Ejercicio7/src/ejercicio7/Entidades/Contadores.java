/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.Entidades;

/**
 *
 * @author PC
 */
public class Contadores {
    private int contDebajoPeso;
    private int contIdeal;
    private int contSobrepeso;
    private int contMayores;
    private int contMenores;

    public Contadores() {
    }

    public Contadores(int contDebajoPeso, int contIdeal, int contSobrepeso, int contMayores, int contMenores) {
        this.contDebajoPeso = contDebajoPeso;
        this.contIdeal = contIdeal;
        this.contSobrepeso = contSobrepeso;
        this.contMayores = contMayores;
        this.contMenores = contMenores;
    }

    public int getContDebajoPeso() {
        return contDebajoPeso;
    }

    public int getContIdeal() {
        return contIdeal;
    }

    public int getContSobrepeso() {
        return contSobrepeso;
    }

    public int getContMayores() {
        return contMayores;
    }

    public int getContMenores() {
        return contMenores;
    }

    public void setContDebajoPeso(int contDebajoPeso) {
        this.contDebajoPeso = contDebajoPeso;
    }

    public void setContIdeal(int contIdeal) {
        this.contIdeal = contIdeal;
    }

    public void setContSobrepeso(int contSobrepeso) {
        this.contSobrepeso = contSobrepeso;
    }

    public void setContMayores(int contMayores) {
        this.contMayores = contMayores;
    }

    public void setContMenores(int contMenores) {
        this.contMenores = contMenores;
    }
    
    
    
}
