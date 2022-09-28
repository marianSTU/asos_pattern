package org.example.abstractFactory;

public class DoubleBeefBurger implements DoubleBurger {
    @Override
    public void hasMeat() {
        System.out.println("Burger has beef meat.");
    }

    @Override
    public String writeInfo() {
        return "\nDouble beef burger.";
    }
}

