package umg.progra2;
import biblioteca.Vehiculo;
import biblioteca.Coche;
import biblioteca.Moto;
import Conductores.Conductor;
import Conductores.ConductorDeCoche;
import Conductores.ConductorDeMoto;


public class Main {
    public static void main(String[] args) {

    Vehiculo Camaro = new Coche("Toyota", "Camaro", 2010, 2);
    Camaro.mostrardetalles();
    Vehiculo Harley = new Moto("HarleyDavidson", "Street 750", 2011, true);
    Harley.mostrardetalles();

    Conductor Simon = new ConductorDeCoche("Simon", "Sherk", 2069);
    Simon.mostrar_informacion();

    Conductor Justo = new ConductorDeMoto("Rufino", "Barrios", 2069);
    Justo.mostrar_informacion();

    }
}