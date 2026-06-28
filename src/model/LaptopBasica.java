package model;

public class LaptopBasica extends Laptop {

    public LaptopBasica() {
        super(
                "Lenovo",
                "IdeaPad 3",
                "2023",
                "Intel Core i3",
                13
        );
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Basica");
        System.out.println("Laptop Basica");
        System.out.println(this);
    }
}
