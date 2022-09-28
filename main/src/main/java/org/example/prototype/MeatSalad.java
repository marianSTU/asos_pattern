package org.example.prototype;

import java.util.Objects;

public class MeatSalad extends Salad {
    private String meat;

    public MeatSalad() {
    }

    public MeatSalad(String meat) {
        super();
        this.meat = meat;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public Salad clone() {
        return new MeatSalad(this.meat);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof MeatSalad meatSalad) || !super.equals(object2)) return false;
        return Objects.equals(meatSalad.meat, meat);
    }
}
