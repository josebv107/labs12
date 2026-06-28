package factory;

import model.Laptop;

public abstract class LaptopFactory {
    public abstract Laptop crearLaptop();

    public void procesarLaptop() {
        Laptop laptop = crearLaptop();
        laptop.ejecutarPrueba();
    }
}
