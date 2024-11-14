package primerparcial;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    
    private List<Animal> animales; 
    
    public Zoologico(){
        this.animales = new ArrayList<>();
    }
  
    
    public void agregarAnimal(Animal animal){
        for(Animal a : animales){
            if(a.nombre.equals(animal.nombre) && a.edad == animal.edad){
                throw new IllegalArgumentException("Ya existe un animal con el mismo nombre ");
            }
                
        }
        animales.add(animal);               
    }
    
    public void mostrarAnimales(){
        for (Animal animal : animales){
            System.out.println(animal);
        }
    }
    
    public void vacunarAnimales(){
        for(Animal animal : animales){
            if(animal instanceof Vacunable){
                ((Vacunable) animal).vacunar();
            }
            else
            {
                System.out.println(animal.nombre + " no puede ser vacunado.");
            }
        }
    }

}
