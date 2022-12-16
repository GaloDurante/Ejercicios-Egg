
package ejercicio14;

import ejercicio14.Entidades.Movil;
import ejercicio14.Servicios.ServiciosMovil;
import java.util.Arrays;


public class Ejercicio14 {

    
    public static void main(String[] args) {
        
        ServiciosMovil sm = new ServiciosMovil();
        Movil cel = sm.cargarCelular();
        
        System.out.println("Codigo: "+Arrays.toString(cel.getCodigo()));
        
    }
    
}
