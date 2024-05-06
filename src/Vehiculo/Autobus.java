package Vehiculo;

public class Autobus extends Vehiculo {

    // Atributos

    private int numBus;
    private int numParada;

    // Constructor

    public Autobus(String marca, String modelo, String numBastidor, int numPuertas, int numBus, int numParada) {
        super(marca, modelo, numBastidor, numPuertas);
        this.numBus = numBus;
        this.numParada = numParada;
    }

    // Getters y Setters

    public int getNumBus() {
        return numBus;
    }

    public void setNumBus(int numBus) {
        this.numBus = numBus;
    }

    public int getNumParada() {
        return numParada;
    }

    public void setNumParada(int numParada) {
        this.numParada = numParada;
    }

    @Override
    public String toString() {

        return super.toString() + "; Número: " + this.getNumBus() + "; Numero de paradas: " + this.getNumParada();
    }

}
