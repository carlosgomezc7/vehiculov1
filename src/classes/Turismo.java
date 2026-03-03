package src.classes;

public class Turismo extends Vehiculo {
    private int puertas = 2;
    private boolean marchaAutomatica = true;

    public Turismo(String matricula, String marca, String modelo, String color, Double tarifa) {
        super(matricula, marca, modelo, color, tarifa);

    }

    public int getPuertas() {
        return puertas;
    }

    public boolean getMarchaAutomatica() {
        return marchaAutomatica;
    }

    @Override // Utilizamos override para utulizar los mismo atributos de la clase padre
    public String getAtributos() {
        return super.getAtributos() + "\nPuertas: " + puertas + "\nMarcha automática: " + marchaAutomatica;

    }

}