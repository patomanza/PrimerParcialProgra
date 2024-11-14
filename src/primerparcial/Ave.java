package primerparcial;

public class Ave extends Animal implements Vacunable{

    private double envergaduraAlas;

    public Ave(String nombre, int edad,double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }

   @Override
    public void vacunar() {
        System.out.println("Vacunando al ave: " + nombre);
    }

    @Override
    public String toString() {
        return super.toString() + ", Envergadura de alas: " + envergaduraAlas;
    }


    


    
}
