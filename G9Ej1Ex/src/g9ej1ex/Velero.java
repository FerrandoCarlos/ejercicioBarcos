package g9ej1ex;

/**
 * @author Carlos Ferrando
 */
public class Velero extends Barco {

    private int nroMastiles;

    //Constructores
    public Velero() {
    }

    public Velero(int nroMastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }

    @Override
    public int calculoModulo() {
        return super.calculoModulo() + nroMastiles;
    }
}
