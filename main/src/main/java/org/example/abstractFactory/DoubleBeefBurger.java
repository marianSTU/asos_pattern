package org.example.abstractFactory;

public class DoubleBeefBurger implements DoubleBurger {
    @Override
    public void hasDoubleMeat() {
        System.out.println("Burger has beef meat.");
    }

    @Override
    public String writeInfo() {
        return "\nDouble Burger with beef meat.";
    }
}
