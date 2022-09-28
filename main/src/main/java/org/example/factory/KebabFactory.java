package org.example.factory;

public class KebabFactory extends  BaseKebabFactory{
    @Override
    public  Kebab createKebab(int type){

        Kebab kebab;
        switch (type)
        {
            case 1:
                kebab = new KebabBox();
                break;
            case 2:
                kebab = new KebabBun();
                break;
            case 3:
                kebab = new KebabTortilla();
                break;
            default: throw new IllegalArgumentException("No such org.example.factory.Kebab.");
        }

        kebab.chickenKebab();
        kebab.addingIngredients();


        return kebab;
    }


}
