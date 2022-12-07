
package Entidad;


public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    //constructor vacio

    public Persona() {
        
    }
    //constructor con parametros
    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    //setters
     public void setNombre(String nombre){
         this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    //devuelve todo el objeto con sus atributos
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }
    
    //metodo
   public void mostrarAtributos(Persona p){
        System.out.println("nombre: "+p.getNombre());
        System.out.println("edad: "+p.getEdad());
        System.out.println("dni: "+p.getDni());
    }
    
}
