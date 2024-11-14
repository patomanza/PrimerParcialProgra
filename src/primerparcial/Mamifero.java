package primerparcial;


class Mamifero extends Animal implements Vacunable {
    
    private double peso;
    private Dieta tipoDieta;
    
    
    public Mamifero(String nombre,int edad, double peso, Dieta tipoDieta){
        super(nombre,edad);
        this.peso = peso;
        this.tipoDieta = tipoDieta;
    }
   
    
    @Override
    public void vacunar() {
        System.out.println("Vacunando al mamifero: " + nombre);
    }
    
    
     @Override
    public String toString() {
        return super.toString() + ", Peso: " + peso + ", Dieta: " + tipoDieta;
    }
    
}
