package biblioteca;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    public void mostrardetalles(){
        System.out.println("Marca: " + marca + "\n Modelo: " + modelo + "\n Anio: " + anio);}
}
