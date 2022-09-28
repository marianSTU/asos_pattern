package org.example.abstractFactory;

public class ClassicBeefBurger implements ClassicBurger {
    @Override
    public void hasNormalMeat() {
        System.out.println("Burger has beef meat.");
    }

    @Override
    public String writeInfo() {
        return "\nClassic Burger with beef meat.";
    }
}
