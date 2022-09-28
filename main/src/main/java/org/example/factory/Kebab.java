package org.example.factory;

public abstract class Kebab{
    public String chickenKebab()
    {
        String meat = "chicken meat added";
		System.out.println(meat);
		return meat;
    }

    public String addingIngredients()
	{
		String veggies = "veggies and sauces added";
        System.out.println(veggies);
		return veggies;
    }

    public abstract String typeOfKebab();

}
