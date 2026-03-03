package src.classes;

public class Deportivo extends Vehiculo {
    private int cilindrada = 200;

    public Deportivo(String matricula, String marca, String modelo, String color, Double tarifa) {
        super(matricula, marca, modelo, color, tarifa);
        matricula = "1515ds";

    }

    public int getcilindrada() {
        return cilindrada;
    }

    @Override // Utilizamos override para utulizar los mismo atributos de la clase padre
              // Vehiculo
    public String getAtributos() {
        return super.getAtributos() + "\nCilindrada: " + cilindrada;
    }

}
