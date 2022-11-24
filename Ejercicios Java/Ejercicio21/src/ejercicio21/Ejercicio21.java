/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int[][] matrizPeque = new int[3][3];
        
        rellenarMatrices(matriz, matrizPeque);
        verificarMatrizDentro(matriz, matrizPeque);
        mostrarMatrizPeque(matrizPeque);
    }
    public static void rellenarMatrices(int[][]matriz, int[][]matrizPeque){
         int num;
         Scanner leer = new Scanner(System.in);
         
        //llenar la matriz grande
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
               num = (int)(Math.random() *10); 
               matriz[i][j]=num;
            }
        }
        //mostrar la matriz grande
        System.out.println("Matriz grande: ");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(matriz[i][j]+" "); 
            }
            System.out.println("");
        }
        
        //llenar la matriz peque
        System.out.println("");
        System.out.println("Rellenar matriz peque");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Ingrese un numero: ");
                num = leer.nextInt();
                matrizPeque[i][j]=num;
            }
        }
         
    }
    
    public static void verificarMatrizDentro(int[][]matriz, int[][]matrizPeque){
        boolean bandera;
        int indiceI , indiceJ,cont=0;
        
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                            
                    if(matriz[i][j] == matrizPeque[0][0]){
                   
                        indiceI = 0;
                        bandera = false;
                        for(int z=i;z<(i+3);z++){
                            indiceJ = 0;
                            for(int x=j;x<(j+3);x++){
                            
                                if(matriz[z][x] != matrizPeque[indiceI][indiceJ]){
                                    bandera = true;
                                    
                                }
                                indiceJ++;
                            
                            }
                            indiceI++;
                        }
                        
                        if(!bandera){
                            System.out.println("Su matriz pequeña se encuentra dentro de la matriz grande");
                            System.out.println("Se encuentra en las coordenadas: "+i+","+j);
                            cont++;
                            
                        }
                        
                    }
                
            }
        }
        if(cont == 0){
            System.out.println("No se encontro la matriz pequeña :( ");
        }
       
    }
    
    public static void mostrarMatrizPeque(int[][]matrizPeque){
        
        //mostrar la matriz peque
        System.out.println("Matriz Peque: ");
            for(int h=0;h<3;h++){
                for(int l=0;l<3;l++){
                    System.out.print(matrizPeque[h][l]+" ");
                
                }
                System.out.println("");
            }
    }
    
    
    
    
}
