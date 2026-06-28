package factory;

import model.Laptop;
import model.LaptopGamer;

public class LaptopGamerFactory extends LaptopFactory {

    @Override
    public Laptop crearLaptop() {
        return new LaptopGamer();
    }
}
