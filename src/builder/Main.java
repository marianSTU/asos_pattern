package builder;

public class Main {

    public static void main(String[] args){
        /*
        //ukážka buildera
        Pizza pizza = Pizza.createPizza().setTomatoSauce(true).setHam(true).setCorn(true).setCheese(true).setSize("Small").build();
        System.out.println(pizza.toString());

        //ukážka directora
        Director director = new Director();
        Pizza.Builder pizzaBuilder = Pizza.createPizza();
        director.setAlTonno(pizzaBuilder);
        Pizza pizza1 = pizzaBuilder.build();
        System.out.println(pizza1);
         */

        Menu.showMenu();
    }

}
