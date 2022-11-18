
package g9ej1ex;

/**
 * @author Carlos Ferrando
 */
public class Barco {
    private String matricula;
    private int eslora;
    private int anioFabricacion;
    
    //Constructores
    public Barco() {
    }

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    
    //Getters & Setters

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }
    
    public int calculoModulo(){
        return eslora * 10;
    }
}
