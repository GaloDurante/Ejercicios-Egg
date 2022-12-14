/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.Entidades;

/**
 *
 * @author PC
 */
public class Matematicas {
    private double num1;
    private double num2;

    public Matematicas() {
    }

    public Matematicas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double devolverMayor(){
        return Math.max(Math.round(num1), Math.round(num2));
    }
    
    public double calcularPotencia(){
        double num11 = Math.round(num1);
        double num22 = Math.round(num2);
        double mayor = Math.max(num11, num22);
        
        if(mayor == num11){
            return num11 * num22;
        }else return num22 * num11;
    }
    
    public double calculaRaiz(){
     
        double min = Math.min(Math.round(num1), Math.round(num2));
        if(min < 0){
            min *= (-1); 
        }
        return Math.sqrt(min);
    }
}
