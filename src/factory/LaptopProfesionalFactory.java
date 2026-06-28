package factory;

import model.Laptop;
import model.LaptopProfesional;

public class LaptopProfesionalFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop() {
        return new LaptopProfesional();
    }
}
