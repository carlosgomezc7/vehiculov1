package app;

import classes.Deportivo;
import classes.Furgoneta;
import classes.Turismo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa de gestión de vehículos");
        Deportivo miDeportivo = new Deportivo("1234ABC", "Ferrari", "488", "Rojo", 500.0);
        Turismo miTurismo = new Turismo("5678DEF", "Toyota", "Corolla", "Blanco", 50.0);
        Furgoneta miFurgoneta = new Furgoneta("9012GHI", "Mercedes", "Sprinter", "Gris", 80.0);

        miDeportivo.getAtributos();

    }
}
