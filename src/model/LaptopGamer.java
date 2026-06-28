package model;

public class LaptopGamer extends Laptop {
    public LaptopGamer(String marca, String modelo, String anioFabricacion, String tipoProcesador, int tamanioPantalla) {
        super(marca, modelo, anioFabricacion, tipoProcesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Gamer");
        System.out.println("Laptop para Gamer");
        System.out.println(this);
    }
}
