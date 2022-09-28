package org.example.abstractFactory;

public class ClassicChickenBurger implements ClassicBurger {
    @Override
    public void hasMeat() {
        System.out.println("Burger ma kuracie maso.");
    }

    @Override
    public String writeInfo() {
        return "\nKlasický burger s kuracím mäsom.";
    }
}
