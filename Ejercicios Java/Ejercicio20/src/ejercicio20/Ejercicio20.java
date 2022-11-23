/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de filas y columnas: ");
        int n = leer.nextInt();
	int[][] matriz = new int[n][n]; 
        
	llenarMatriz(matriz, n);
	matrizMagica(matriz, n);
    }

    public static void llenarMatriz(int[][]matriz,int n){
	int num;
        Scanner leer = new Scanner(System.in);
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			do{
                            System.out.println("Ingrese un num: ");
                            num = leer.nextInt();
                        }while(num > 10);
			matriz[i][j] = num;
                }
        }
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
        }	
    }


    public static void matrizMagica(int[][] matriz,int n){
	int resultadoMagico, cont = 0;
        int[] sumaColumna = new int[n];
        int[] sumaFila = new int[n];
        int[] sumaDiagonal = new int[2];
	
	sumaDiagonal[0] = 0;
	for(int i=0;i<n;i++){
		sumaColumna[i] = 0;
		for(int j=0;j<n;j++){
			sumaColumna[i] = sumaColumna[i] + matriz[i][j];
			if(i==j){
                            sumaDiagonal[0] = sumaDiagonal[0] + matriz[i][j];
                        }
                }
                System.out.println("La suma de las columnas en la fila "+(i+1)+" es de: "+sumaColumna[i]);
		
        }
        System.out.println("La suma de la diagonal 1 es: "+sumaDiagonal[0]);
	
	for(int i=0;i<n;i++){
		if(sumaColumna[0] != sumaColumna[i]){
			cont++;
                }
        }
	
	sumaDiagonal[1] = 0;
        for(int i=n-1;i>=0;i--){
		sumaFila[i] = 0;
                for(int j=0;j<n;j++){
			sumaFila[i] = sumaFila[i] + matriz[j][i];
			if(i == j){
                            sumaDiagonal[1] = sumaDiagonal[1] + matriz[j][i];
			}
		}
                System.out.println("La suma de las filas de la columna "+(i+1)+ " es de: "+sumaFila[i]);
                
	}
        System.out.println("La suma de la diagonal 2 es: "+sumaDiagonal[1]);
	
	
	for(int i=0;i<n;i++){
		if(sumaFila[0] != sumaFila[i]){
			cont++;
		}
	}
	
	if(sumaDiagonal[0] != sumaDiagonal[1]){
		cont++;
	}
	
	if(cont == 0){
            System.out.println("ES UNA MATRIZ MAGICA");
		
	}else{ 
            System.out.println("NO ES MAGICA ;(");
		
	}
    }
    
}
