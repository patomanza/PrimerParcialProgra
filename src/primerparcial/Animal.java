package primerparcial;

public abstract class Animal {
    
    protected String nombre;
    protected int edad;
    
    
    public Animal(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }  
    
     
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
    
    
    
    
    
}
