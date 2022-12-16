
package ejercicio13;

import ejercicio13.Entidades.Curso;
import ejercicio13.Servicios.ServiciosCurso;
import java.util.Arrays;


public class Ejercicio13 {

    
    public static void main(String[] args) {
      
        ServiciosCurso sc = new ServiciosCurso();
        Curso c = sc.crearCurso();
        
        System.out.println("Calculo semanal.");
        sc.calcularGananciaSemanal(c);
        
        System.out.println("Alumnos: "+Arrays.toString(c.getAlumnos()));
    }
    
}
