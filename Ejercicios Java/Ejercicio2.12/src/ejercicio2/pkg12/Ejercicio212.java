/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg12;

/**
 *
 * @author PC
 */
public class Ejercicio212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0,cont1=0,cont2=0;
        
        for (int i = 0; i < 9; i++) {
            if(cont2 == 3){
                String letra = "E";
                System.out.println(cont+"-"+cont1+"-"+letra);
            }else{
                System.out.println(cont+"-"+cont1+"-"+cont2);
            }
            cont2++;
        }
        
        for (int i = 0; i < 9; i++) {
            if(cont1 == 3){
                String letra = "E";
                System.out.println(cont+"-"+letra+"-"+cont2);
            }else{
                System.out.println(cont+"-"+cont1+"-"+cont2);
            }
            cont1++;
        }
        
        for (int i = 0; i < 10; i++) {
            if(cont == 3){
                String letra = "E";
                System.out.println(letra+"-"+cont1+"-"+cont2);
            }else{
                System.out.println(cont+"-"+cont1+"-"+cont2);
            }
            cont++;
        }
    }
}
