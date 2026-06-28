package app;

import factory.LaptopBasicaFactory;
import factory.LaptopFactory;
import factory.LaptopGamerFactory;
import factory.LaptopProfesionalFactory;

public class main {
    static void main() {
        System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS");
        System.out.println();

        LaptopFactory factory;
        factory = new LaptopGamerFactory();
        factory.procesarLaptop();

        System.out.println();

        factory = new LaptopBasicaFactory();
        factory.procesarLaptop();

        System.out.println();

        factory = new LaptopProfesionalFactory();
        factory.procesarLaptop();
    }
}
