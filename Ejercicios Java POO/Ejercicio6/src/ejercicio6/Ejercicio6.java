/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.Entidades.Cafetera;
import ejercicio6.Servicios.ServicioCafetera;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int op, tamaño;
        ServicioCafetera sc = new ServicioCafetera();
        Cafetera c = sc.crearCafetera();
        
         do{
            System.out.println("******** MENU *********");
            System.out.println("1- Llenar cafetera");
            System.out.println("2- Vaciar cafetera");
            System.out.println("3- Agregar cafe");
            System.out.println("4- Servir taza");
            System.out.println("0- SALIR");
            System.out.println("Seleccione una opcion: ");
            op = leer.nextInt();
            
            switch(op){
                case 1: 
                    sc.llenarCafetera(c);
                    break;
                case 2:
                    sc.vaciarCafetera(c);
                    break;
                case 3:
                    sc.agregarCafe(c);
                    break;
                case 4:
                    System.out.println("Ingrese tamaño de taza: ");
                    tamaño = leer.nextInt();
                    sc.servirTaza(c, tamaño);
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
