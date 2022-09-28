package org.example.abstractFactory;

public class ClassicChickenBurger implements ClassicBurger {
    @Override
    public void hasNormalMeat() {
        System.out.println("Burger has chicken meat.");
    }

    @Override
    public String writeInfo() {
        return "\nClassic Burger with chicken meat.";
    }
}
