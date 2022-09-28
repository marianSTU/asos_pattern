package org.example.prototype;

import java.util.Objects;

public class CheeseSalad extends Salad {
    private String cheese;

    public CheeseSalad() {
    }

    public CheeseSalad(String cheese) {
        super();
        this.cheese = cheese;
    }

    public CheeseSalad(String saladType, String oil, String dresing, String cheese) {
        super(saladType,oil,dresing);
        this.cheese = cheese;
    }

    public CheeseSalad(CheeseSalad cheeseSalad) {
        super(cheeseSalad);
        this.cheese = cheeseSalad.cheese;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public Salad clone() {
        return new CheeseSalad(this.cheese);
    }

    @Override
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof CheeseSalad cheeseSalad) || !super.equals(obj2)) return false;
        return Objects.equals(cheeseSalad.cheese, cheese);
    }
}
