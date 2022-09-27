package builder;

public class Main {

    public static void main(String[] args){
        Pizza pizza = Pizza.createPizza().setTomatoSauce(true).setHam(true).setCorn(true).setCheese(true).setSize("Small").build();
        System.out.println(pizza.toString());
    }

}
