package org.example.abstractFactory;

import java.util.Scanner;

public class BurgerFactory {

    public static String getBurger() {
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        int choice;
        BurgerAbstractFactory factory;


        System.out.println("Vybral si si Burger!\n");
        System.out.println("Aké chceš mäso?");
        System.out.println("1: Hovädzie");
        System.out.println("2: Kuracie");

        choice = myScanner.nextInt();

        if(choice == 1) {
            factory = new BeefBurgerFactory();
        } else {
            factory = new ChickenBurgerFactory();
        }


        System.out.println("\nAký veľký burger chceš?");
        System.out.println("1: Klasický");
        System.out.println("2: Dvojitý");

        choice = myScanner.nextInt();

        if(choice == 1) {
            return factory.createClassicBurger().writeInfo();
        } else {
            return factory.createDoubleBurger().writeInfo();
        }

    }
}
