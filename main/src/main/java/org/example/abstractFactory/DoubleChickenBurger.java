package org.example.abstractFactory;

public class DoubleChickenBurger implements DoubleBurger {
    @Override
    public void hasMeat() {
        System.out.println("Burger has chicken meat.");
    }

    @Override
    public String writeInfo() {
        return "\nDouble chicken burger.";
    }
}

