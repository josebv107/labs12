package factory;

import model.Laptop;
import model.LaptopBasica;

public class LaptopBasicaFactory extends LaptopFactory {

    @Override
    public Laptop crearLaptop() {
        return new LaptopBasica();
    }
}
