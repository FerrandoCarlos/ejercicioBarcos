
package g9ej1ex;

/**
 * @author Carlos Ferrando
 */
public class Barco {
    private String matricula;
    private double eslora;
    private int anioFabricacion;
    
    //Constructores
    public Barco() {
    }

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    
    //Getters & Setters

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
    
    public double calculoModulo(){
        return eslora * 10;
    }
}
