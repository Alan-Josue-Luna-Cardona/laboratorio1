package biblioteca;

public class Moto extends Vehiculo{
    public boolean Sidecar;
    public Moto(String marca, String modelo, int anio, boolean Sidecar){
        super(marca, modelo, anio);
        this.Sidecar = Sidecar;
    }

    @Override
    public void mostrardetalles(){
        System.out.println("Marca: "+marca+"\nModelo: "+modelo+"\nAnio: "+anio+"\nTiene Sidecar?: "+Sidecar);
    }
}
