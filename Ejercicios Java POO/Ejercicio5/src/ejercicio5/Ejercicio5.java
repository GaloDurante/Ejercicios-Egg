/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.Entidades.CuentaBancaria;
import ejercicio5.Servicios.ServiciosCuenta;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero, op;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Creacion de cuenta.");
        ServiciosCuenta sc = new ServiciosCuenta();
        CuentaBancaria cb = sc.crearCuenta();
        do{
            System.out.println("******** MENU *********");
            System.out.println("1- Consultar Datos");
            System.out.println("2- Consultar Saldo");
            System.out.println("3- Ingresar Dinero");
            System.out.println("4- Retirar Dinero");
            System.out.println("5- Extraccion Rapida");
            System.out.println("0- SALIR");
            System.out.println("Seleccione una opcion: ");
            op = leer.nextInt();
            
            switch(op){
                case 1: 
                    sc.consultarDatos(cb);
                    break;
                case 2:
                    sc.consultarSaldo(cb);
                    break;
                case 3:
                    System.out.println("Ingrese monto a ingresar: ");
                    dinero = leer.nextInt();
                    sc.ingresarDinero(cb, dinero);
                    break;
                case 4:
                    System.out.println("Ingrese monto a retirar: ");
                    dinero = leer.nextInt();
                    sc.retirarDinero(cb, dinero);
                    break;
                case 5:
                    sc.extraccionRapida(cb);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opcion elegida no es valida, vuelva a intentar.");
                    break;
            }
        }while(op != 0);
       
    }
    
}
