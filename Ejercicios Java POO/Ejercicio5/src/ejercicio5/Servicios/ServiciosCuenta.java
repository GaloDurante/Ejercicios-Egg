/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.Servicios;

import ejercicio5.Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiciosCuenta {
    private Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
    
            System.out.println("Ingrese numero de cuenta: ");
            int nroCuenta = leer.nextInt();
            
            System.out.println("Ingrese su DNI: ");
            int dni = leer.nextInt();
            
            System.out.println("Ingrese saldo inicial: ");
            int saldo = leer.nextInt();
            
     return new CuentaBancaria(nroCuenta, dni, saldo);
}
    
    public void ingresarDinero(CuentaBancaria cb, int dinero){
        System.out.println("Usted tiene: "+cb.getSaldo());
        int saldoActual = cb.getSaldo();
        saldoActual += dinero;
        cb.setSaldo(saldoActual);
        System.out.println("Usted ahora tiene: "+cb.getSaldo());
    }
   
    public void retirarDinero(CuentaBancaria cb, int dinero){
        System.out.println("Usted tenia: "+cb.getSaldo());
        int saldoActual = cb.getSaldo();
        saldoActual -= dinero;
        
        if (saldoActual < 0){
            cb.setSaldo(0);
        } else {
            cb.setSaldo(saldoActual);
        }
        System.out.println("Usted ahora tiene: "+cb.getSaldo());
    }
    
    public void extraccionRapida(CuentaBancaria cb){
        boolean bandera = false;
        do{
            System.out.println("Usted tenia: "+cb.getSaldo());
             int saldoActual = cb.getSaldo();
             int porcion = (int) (saldoActual*0.2);
             
             System.out.println("Ingrese dinero a retirar(max "+porcion+"): ");
             int dinero = leer.nextInt();
             
             if(dinero > porcion ){
                 System.out.println("Usted ingreso mas del 20% para retirar, vuelva a intentar.");
             } else{
                 saldoActual -= dinero;
                 cb.setSaldo(saldoActual);
                 bandera = true;
             }
        }while(!bandera);
    }
    
    public void consultarSaldo(CuentaBancaria cb){
        System.out.println("Su saldo es: "+cb.getSaldo());
    }
    
    public void consultarDatos(CuentaBancaria cb){
        System.out.println("Su numero de cuenta: "+cb.getNroCuenta());
        System.out.println("Su DNI: "+cb.getDni());
    }
}
