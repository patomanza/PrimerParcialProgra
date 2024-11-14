package primerparcial;


public class Main {

    
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        
        Mamifero leon = new Mamifero("Leon", 5, 190.5, Dieta.CARNIVORO);
        Mamifero delfin = new Mamifero("Leon", 5, 190.5, Dieta.CARNIVORO);
        Ave aguila = new Ave("Aguila", 3, 2.1);
        Reptil cocodrilo = new Reptil("Cocodrilo", 12, "Escamas Duras", "Ectotermia");
        
        try{
            
            zoo.agregarAnimal(leon);
            zoo.agregarAnimal(aguila);
            zoo.agregarAnimal(cocodrilo);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        zoo.mostrarAnimales();
        
        zoo.vacunarAnimales();
    }
    
}
