/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.pkg5;

import ejercicio1.pkg5.Entidades.RegistroMeses;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String resp;
        RegistroMeses rm = new RegistroMeses();
        rellenarArray(rm);
        llenarMesSecreto(rm);
        do{
            System.out.println("Ingrese un mes: ");
            resp = leer.next();
            if (resp.equals(rm.getMesSecreto())){
                System.out.println("ACERTASTE EL MES SECRETO.");
            }else{
                System.out.println("No has acertado, intente de nuevo.");
            }
        }while(!resp.equals(rm.getMesSecreto()));
        
    }
    public static void rellenarArray(RegistroMeses rm){
        String[] meses = new String[12];
        
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";
        
        rm.setMeses(meses);
    }
    
    public static void llenarMesSecreto(RegistroMeses rm){
        int num = (int)(Math.random() * 12);
        //para saber el mes secreto y corroborar que funciona
        System.out.println("num: "+num);
        switch(num){
            case 1: rm.setMesSecreto("enero");
                break;
            case 2: rm.setMesSecreto("febrero");
                break; 
            case 3: rm.setMesSecreto("marzo");
                break;
            case 4: rm.setMesSecreto("abril");
                break;
            case 5: rm.setMesSecreto("mayo");
                break;
            case 6: rm.setMesSecreto("junio");
                break;                
            case 7: rm.setMesSecreto("julio"); 
                break; 
            case 8: rm.setMesSecreto("agosto");;
                break;
            case 9: rm.setMesSecreto("septiembre");
                break;
            case 10: rm.setMesSecreto("octubre");
                break;
            case 11: rm.setMesSecreto("noviembre");
                break;
            case 12: rm.setMesSecreto("diciembre");
                break;
        }
    }
    
    
}
