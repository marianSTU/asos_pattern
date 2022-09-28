package org.example.abstractFactory;

public class ClassicChickenBurger implements ClassicBurger {
    @Override
    public void hasMeat() {
        System.out.println("Burger has chicken meat.");
    }

    @Override
    public String writeInfo() {
        return "\nClassic chicken burger.";
    }
}
