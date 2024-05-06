package Vehiculo;

public abstract class Turismo extends Vehiculo {

    private Asiento tipoAsiento;

    // CONSTRUCTOR
    public Turismo(String marca, String modelo, String numBastidor, int numPuertas, Asiento tipoAsiento) {
        super(marca, modelo, numBastidor, numPuertas);
        this.tipoAsiento = tipoAsiento;
    }

    // GETTERS Y SETTERS
    public Asiento getAsiento() {
        return tipoAsiento;
    }

    public void setAsiento(Asiento asiento) {
        this.tipoAsiento = asiento;
    }

    // ToString
    @Override
    public String toString() {

        return super.toString() + "; TipoAsiento: " + this.getAsiento();
    }

    // Metodos abstractos

    public abstract double calcularPrecioAlquiler(int numDias);

    public abstract int getMaxVelocidad();
}
