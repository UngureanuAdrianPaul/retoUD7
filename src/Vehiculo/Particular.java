package Vehiculo;

public class Particular extends Turismo implements Iniciable {

    // Atributos

    private String propietario;
    private boolean conAireAcondicionado;

    // Constructor
    public Particular(String marca, String modelo, String numBastidor, int numPuertas, Asiento asiento,
            String propietario, boolean conAireAcondicionado) {
        super(marca, modelo, numBastidor, numPuertas, asiento);
        this.propietario = propietario;
        this.conAireAcondicionado = conAireAcondicionado;
    }

    // Getters y Setters

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public boolean isConAireAcondicionado() {
        return conAireAcondicionado;
    }

    public void setConAireAcondicionado(boolean conAireAcondicionado) {
        this.conAireAcondicionado = conAireAcondicionado;
    }

    @Override
    public String toString() {

        return super.toString() + "; Propietario: " + this.getPropietario()
                + "; Aire Acondicionado: " + this.isConAireAcondicionado();

    }

    // METODOS A IMPLEMENTAR

    @Override

    public void reiniciarContador(double kilometros) {
        System.out.println("El Particular tiene acumulados un total de " + kilometros + "km.");
    }

    @Override
    
    public double calcularPrecioAlquiler(int numDias){
        return (numDias * 30.00);
    }

    @Override

    public int getMaxVelocidad(){
        return 220;
    }
}
