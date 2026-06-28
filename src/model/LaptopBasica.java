package model;

public class LaptopBasica extends Laptop {

    public LaptopBasica(String marca, String modelo, String anioFabricacion, String tipoProcesador, int tamanioPantalla) {
        super(marca, modelo, anioFabricacion, tipoProcesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Basica");
        System.out.println("Laptop para Basica");
        System.out.println(this);
    }
}
