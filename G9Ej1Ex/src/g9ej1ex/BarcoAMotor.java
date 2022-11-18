
package g9ej1ex;

/**
 * @author Carlos Ferrando
 */
public class BarcoAMotor extends Barco {
    private int potencia;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potencia, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }
    
    @Override
    public double calculoModulo(){
        return super.calculoModulo() + potencia;
    }
}
