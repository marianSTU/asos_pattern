package org.example.abstractFactory;

public class DoubleChickenBurger implements DoubleBurger {
    @Override
    public void hasMeat() {
        System.out.println("Burger ma kuracie maso.");
    }

    @Override
    public String writeInfo() {
        return "\nDvojitý burger s kuracím mäsom.";
    }
}
