package model;

public class LaptopGamer extends Laptop {
    public LaptopGamer() {
        super(
                "Dell",
                "Alienware M15",
                "2024",
                "Intel Ultra 7",
                15
        );
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Gamer");
        System.out.println("Laptop para Gamer");
        System.out.println(this);
    }
}
