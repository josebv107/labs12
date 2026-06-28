package model;

public abstract class Laptop {
    protected String marca;
    protected String modelo;
    protected String anioFabricacion;
    protected String tipoProcesador;
    protected int tamanioPantalla;

    public Laptop(String marca, String modelo, String anioFabricacion, String tipoProcesador, int tamanioPantalla){
        this.marca= marca;
        this.modelo= modelo;
        this.anioFabricacion= anioFabricacion;
        this.tipoProcesador= tipoProcesador;
        this.tamanioPantalla= tamanioPantalla;
    }

    public abstract void ejecutarPrueba();

    @Override
    public String toString() {
        return "Marca y modelo: " + marca + " " + modelo +
                "\nAño de Fabricación: " + anioFabricacion +
                "\nProcesador: " + tipoProcesador +
                "\nTamaño de Pantalla: " + tamanioPantalla;
    }
}
