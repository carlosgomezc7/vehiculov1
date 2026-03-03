package src.classes;

public class Furgoneta extends Vehiculo {
    private int carga = 1000;
    private int volumen = 100;

    public Furgoneta(String matricula, String marca, String modelo, String color, Double tarifa) {
        super(matricula, marca, modelo, color, tarifa);

    }

    public int getCarga() {
        return carga;
    }

    public int getVolumen() {
        return volumen;
    }

    @Override // Utilizamos override para utulizar los mismo atributos de la clase padre
              // Vehiculo
    public String getAtributos() {
        return super.getAtributos() + "\nCarga: " + carga + "\nVolumen: " + volumen;
    }

}
