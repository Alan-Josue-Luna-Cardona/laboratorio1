package biblioteca;

public class Coche extends Vehiculo{
public int numerodepuertas;
    public Coche(String marca, String modelo, int anio, int numerodepuertas){
        super(marca, modelo, anio);
        this.numerodepuertas = numerodepuertas;
    }

    @Override
    public void mostrardetalles(){
        System.out.println("Marca: "+marca+"\nModelo: "+modelo+"\nAnio: "+anio+"\nNumero de puertas: "+numerodepuertas);
    }
}
