package model;

public class LaptopProfesional extends Laptop {
    public LaptopProfesional(String marca, String modelo, String anioFabricacion, String tipoProcesador, int tamanioPantalla) {
        super(marca, modelo, anioFabricacion, tipoProcesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Profesional");
        System.out.println("Laptop para Profesional");
        System.out.println(this);
    }
}
