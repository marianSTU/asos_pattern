package org.example.abstractFactory;

public class DoubleChickenBurger implements DoubleBurger {
    @Override
    public void hasMeat() {

    }

    @Override
    public String writeInfo() {
        return "DoubleChickenBurger";
    }
}
