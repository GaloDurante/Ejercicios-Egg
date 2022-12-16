
package ejercicio14.Servicios;

import ejercicio14.Entidades.Movil;
import java.util.Scanner;


public class ServiciosMovil {
    private Scanner leer = new Scanner(System.in);
    
    public int[] ingresarCodigo(){
        int []cod = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese codigo "+(i+1)+" del numero del movil: ");
            cod[i] = leer.nextInt();
        }
        return cod;
    }
    
    public Movil cargarCelular(){
        int[]codigo;
        System.out.println("Ingrese marca de su telefono: ");
        String marca = leer.next();
        
        System.out.println("Ingrese el precio: ");
        int precio = leer.nextInt();
        
        System.out.println("Ingrese el modelo: ");
        String modelo = leer.next();
        
        System.out.println("Ingrese Gb de ram: ");
        int ram = leer.nextInt();
        
        System.out.println("Ingrese cantidad de almacenamiento en Gb: ");
        int almacenamiento = leer.nextInt();
        
        codigo = ingresarCodigo();
        
        return new Movil(marca, precio, modelo, ram, almacenamiento, codigo);
    }
}
