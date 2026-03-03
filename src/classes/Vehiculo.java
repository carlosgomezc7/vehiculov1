package src.classes;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Double tarifa;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, String color, Double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = true; // Por defecto, el vehículo está disponible
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;

    }

    public String getAtributos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nColor: " + color
                + "\nTarifa: " + tarifa + "\nDisponible: " + disponible;
    }

}
