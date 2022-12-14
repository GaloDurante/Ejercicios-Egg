/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fechaActual = new Date();
        System.out.println("Ingrese el año: ");
        int año = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia: ");
        int dia = leer.nextInt();

        Date fecha = new Date(año-1900, mes-1, dia);
        System.out.println("fecha: " + fecha.toString());
        System.out.println("Fecha actual: " + fechaActual.toString());
        int años = fechaActual.getYear()-fecha.getYear();
        System.out.println("Años de diferencia: "+años);
    }
    
}
