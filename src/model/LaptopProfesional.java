package model;

public class LaptopProfesional extends Laptop {
    public LaptopProfesional() {
        super(
                "Apple",
                "MacBook Pro",
                "2026",
                "M5 Pro",
                14
        );
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Profesional");
        System.out.println("Laptop para Profesional");
        System.out.println(this);
    }
}
