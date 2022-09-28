package org.example.prototype;

import java.util.Objects;

public abstract class Salad {
    private String saladType;
    private String oil;
    private String dressing;

    public Salad() {
        this.saladType = "lettuce";
        this.dressing = "garlic";
        this.oil = "olive";
    }

    public Salad(Salad salad) {
        this.saladType = salad.saladType;
        this.dressing = salad.dressing;
        this.oil = salad.oil;
    }

    public Salad(String salad, String oil, String dressing) {
        this();
        this.saladType = salad;
        this.dressing = dressing;
        this.oil = oil;

    }

    public abstract Salad clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Salad salad2)) return false;
        return Objects.equals(salad2.saladType, saladType) && Objects.equals(salad2.dressing, dressing) && Objects.equals(salad2.oil, oil);
    }

    public String getSalad() {
        return saladType;
    }

    public String getDresing() {
        return dressing;
    }

    public String getOil() {
        return oil;
    }


}
