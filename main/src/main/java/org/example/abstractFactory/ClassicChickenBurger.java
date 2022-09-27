package org.example.abstractFactory;

public class ClassicChickenBurger implements ClassicBurger {
    @Override
    public void hasMeat() {

    }

    @Override
    public String writeInfo() {
        return "ClassicChickenBurger";
    }
}
