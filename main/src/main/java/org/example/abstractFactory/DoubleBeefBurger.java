package org.example.abstractFactory;

public class DoubleBeefBurger implements DoubleBurger {
    @Override
    public void hasMeat() {
        System.out.println("Burger ma hovadzie maso.");
    }

    @Override
    public String writeInfo() {
        return "\nDvojitý burger s hovädzím mäsom.";
    }
}
