package primerparcial;


public class Reptil extends Animal {
    
    private String regulacionTemperatura;
    private String tipoEscama;
    
        
    public Reptil(String nombre, int edad, String tipoEscama, String regulacionTemperatura){
        super(nombre, edad);
        this.tipoEscama = tipoEscama;
        this.regulacionTemperatura = regulacionTemperatura;
    }
    
    public String toString(){
        return super.toString() + " , Tipo de escama: " + tipoEscama + ", Regulación de temperatura: " + regulacionTemperatura;
    }

}
