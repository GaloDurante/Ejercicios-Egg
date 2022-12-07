/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.Servicios;

import ejercicio3.Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServicioOperacion {
    private Scanner leer  = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
        System.out.println("Ingrese numero 1: ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese numero 2: ");
        int num2 = leer.nextInt();
        
        return new Operacion(num1, num2);
    }
    public int sumar(Operacion op){
        return op.getNum1() + op.getNum2();
    }
    
    public int restar(Operacion op){
        return op.getNum1() - op.getNum2();
    }
    
    public int multiplicar(Operacion op){
        if (op.getNum1() == 0 || op.getNum2() == 0 ){
            System.out.println("Hubo un error ya que uno de los numeros es 0.");
            return 0;
        }else{
             return op.getNum1() * op.getNum2();
        }
    }
    
    public int dividir(Operacion op){
        if (op.getNum1() == 0 || op.getNum2() == 0 ){
            System.out.println("Hubo un error ya que uno de los numeros es 0.");
            return 0;
        }else{
              return op.getNum1() / op.getNum2();
        }     
    }
    
    
}
