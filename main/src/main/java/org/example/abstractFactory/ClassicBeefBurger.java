package org.example.abstractFactory;

public class ClassicBeefBurger implements ClassicBurger {
    @Override
    public void hasMeat() {

    }

    @Override
    public String writeInfo() {
        return "ClassicBeefBurger";
    }
}
