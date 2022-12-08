/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.Entidades;

/**
 *
 * @author PC
 */
public class CuentaBancaria {
    private int nroCuenta;
    private int dni;
    private int saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int nroCuenta, int dni, int saldo) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}
