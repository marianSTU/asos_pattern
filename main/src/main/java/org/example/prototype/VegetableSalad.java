package org.example.prototype;

import java.util.Objects;

public class VegetableSalad extends Salad {

    private String vegetable;

    public VegetableSalad() {
    }

    public VegetableSalad(String vegetable) {
        super();
        this.vegetable = vegetable;

    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    @Override
    public Salad clone(){
        return new VegetableSalad(this.vegetable);
    }

    @Override
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof VegetableSalad vegetableSalad) || !super.equals(obj2)) return false;
        return Objects.equals(vegetableSalad.vegetable, vegetable);
    }
}
