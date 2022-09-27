package org.example.abstractFactory;

public class ClassicBeefBurger implements ClassicBurger {
    @Override
    public void hasMeat() {
        System.out.println("Burger ma hovadzie maso.");
    }

    @Override
    public String writeInfo() {
        return "\nKlasický burger s hovädzím mäsom.";
    }
}
