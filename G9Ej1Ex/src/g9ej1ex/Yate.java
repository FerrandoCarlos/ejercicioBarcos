
package g9ej1ex;

/**
 * @author Carlos Ferrando
 */
public class Yate extends BarcoAMotor{
    private int nroCamarotes;

    public Yate() {
    }

    public Yate(int nroCamarotes, int potencia, String matricula, double eslora, int anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.nroCamarotes = nroCamarotes;
    }
    
    public double calculoModulo(){
        return super.calculoModulo() + nroCamarotes;
    }
}
