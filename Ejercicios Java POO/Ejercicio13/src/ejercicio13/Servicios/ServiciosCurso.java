/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13.Servicios;

import ejercicio13.Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiciosCurso {
    private Scanner leer = new Scanner(System.in);
    
    public String[] cargarAlumnos(){
      
        String [] arreglo = new String[5];
        
         for (int i = 0; i < 5; i++) {
             System.out.println("Ingrese nombre de alumno: ");
             String nombre = leer.next();
             arreglo[i] = nombre;
        }
         return arreglo;
    }
    
    public Curso crearCurso(){
        String[] alumnos;
        
        System.out.println("Ingrese nombre del curso: ");
        String nombreCurso = leer.next();
        
        System.out.println("Ingrese cantidad de horas por dia: ");
        int cantidadHoras = leer.nextInt();
        
        System.out.println("Ingrese cantidad de dias por semana: ");
        int cantidadDias = leer.nextInt();
        
        System.out.println("Ingrese turno(mañana/tarde): ");
        String turno = leer.next();
        
        System.out.println("Ingrese un precio por hora: ");
        int precioHora = leer.nextInt();
        
        alumnos = cargarAlumnos();
        
        return new Curso(nombreCurso, cantidadHoras, cantidadDias, turno, precioHora, alumnos);
    }
    
    public void calcularGananciaSemanal(Curso c){
       
         int resultado = 5 * c.getCantidadHorasDia() * c.getPrecioPorHora() * c.getCantidadDiasSemana(); 
        
        System.out.println("Las ganancias semanales son de $ "+resultado);
    }
}
