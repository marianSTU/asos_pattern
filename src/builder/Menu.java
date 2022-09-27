package builder;

import java.util.Scanner;

public class Menu {

    public static void showMenu(){
        int choice;
        Pizza pizza;
        Director director = new Director();
        Scanner input = new Scanner(System.in);
        Pizza.Builder pizzaBuilder = Pizza.createPizza();


        printMainMenu();
        choice = input.nextInt();

        while (choice != 5){
            switch (choice){
                case 1:
                    boolean size = selectOption("Select Big Size","Select Small Size");
                    String s = size ? "Big" : "Small";
                    pizzaBuilder.setSize(s);
                    break;
                case 2:
                    showPizzaMenu();
                    choice = input.nextInt();
                    selectPizzaFromMenu(pizzaBuilder,director,choice);
                    break;
                case 3:
                    while (choice != 12){
                        showIngredients();
                        choice = input.nextInt();
                        selectedIngredients(pizzaBuilder, choice);
                    }
                    break;
                case 4:
                    pizza = pizzaBuilder.build();
                    System.out.println(pizza.toString());
                    break;
                default:
                    printMainMenu();
                    break;
            }

            printMainMenu();
            choice = input.nextInt();
        }
    }

    private static void selectedIngredients(Pizza.Builder builder,int choice){
        boolean add;

        switch (choice){
            case 1:
                add = selectOption("Add Tomato Sauce to pizza", "Remove Tomato Sauce from pizza");
                builder.setTomatoSauce(add);
                break;
            case 2:
                add = selectOption("Add Cheese to pizza", "Remove Cheese from pizza");
                builder.setCheese(add);
                break;
            case 3:
                add = selectOption("Add Ham to pizza", "Remove Ham from pizza");
                builder.setHam(add);
                break;
            case 4:
                add = selectOption("Add Corn to pizza", "Remove Corn from pizza");
                builder.setCorn(add);
                break;
            case 5:
                add = selectOption("Add Bacon to pizza", "Remove Bacon from pizza");
                builder.setBacon(add);
                break;
            case 6:
                add = selectOption("Add Pepperoni to pizza", "Remove Pepperoni from pizza");
                builder.setPepperoni(add);
                break;
            case 7:
                add = selectOption("Add Salami to pizza", "Remove Salami from pizza");
                builder.setSalami(add);
                break;
            case 8:
                add = selectOption("Add Pineapple to pizza", "Remove Pineapple from pizza");
                builder.setPineapple(add);
                break;
            case 9:
                add = selectOption("Add Chicken Meat to pizza", "Remove Chicken Meat from pizza");
                builder.setChickenMeat(add);
                break;
            case 10:
                add = selectOption("Add Tuna to pizza", "Remove Tuna from pizza");
                builder.setTuna(add);
                break;
            case 11:
                add = selectOption("Add Onion to pizza", "Remove Onion from pizza");
                builder.setOnion(add);
                break;
            case 12:
                break;


        }
    }

    private static void selectPizzaFromMenu(Pizza.Builder builder, Director director, int choice){
        if (choice > 0 && choice < 7 ){
            builder.reset();
        }

        switch (choice){
            case 1:
                director.setMargarita(builder);
                break;
            case 2:
                director.setCardinale(builder);
                break;
            case 3:
                director.setDiavolo(builder);
                break;
            case 4:
                director.setHawai(builder);
                break;
            case 5:
                director.setSalami(builder);
                break;
            case 6:
                director.setAllaMexicana(builder);
                break;
            case 7:
                director.setAlTonno(builder);
                break;
            default:
                break;

        }
    }

    private static Boolean selectOption(String select1, String select2){
        Scanner input = new Scanner(System.in);
        System.out.println("""
                ╔═════════════════════════════════════╗
                ╠ Choose option:
                ╠═════════════════════════════════════╝
                ╠-● 1. %s
                ╠-● 2. %s
                ╚═════════════════════════════════════╝
                """.formatted(select1,select2));
        int choice = input.nextInt();

        if (choice == 1)
            return true;
        return false;

    }

    private static void showIngredients(){
        System.out.println("""
                ╔═══════════════════════════╗
                ╠ Choose ingredient:
                ╠═══════════════════════════╝
                ╠-● 1. Select Tomato Sauce
                ╠-● 2. Select Cheese
                ╠-● 3. Select Ham
                ╠-● 4. Select Corn
                ╠-● 5. Select Bacon
                ╠-● 6. Select Pepperoni
                ╠-● 7. Select Salami
                ╠-● 8. Select Pineapple
                ╠-● 9. Select Chicken Meat
                ╠-● 10. Select Tuna
                ╠-● 11. Select Onion
                ╠-● 12. BACK
                ╚═══════════════════════════╝\s
                """);
    }

    private static void printMainMenu(){
        System.out.println("""
                ╔═════════════════════════════╗
                ╠  Choose option:
                ╠═════════════════════════════╝
                ╠-● 1. Select Pizza Size
                ╠-● 2. Select Pizza from Menu
                ╠-● 3. Edit Ingredients
                ╠-● 4. Show Pizza
                ╠-● 5. EXIT
                ╚═════════════════════════════╝\s
                """);
    }

    private static void showPizzaMenu(){
        System.out.println("""
                ╔═════════════════════════╗
                ╠  Choose pizza:
                ╠═════════════════════════╝
                ╠-● 1. Select Margarita
                ╠-● 2. Select Cardinale
                ╠-● 3. Select Diavolo
                ╠-● 4. Select Hawai
                ╠-● 5. Select Salami
                ╠-● 6. Select Alla Mexicana
                ╠-● 7. Select Al Tonno
                ╠-● 8. BACK
                ╚═════════════════════════╝\s
                """);
    }

}
