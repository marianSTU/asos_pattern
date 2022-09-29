package org.example.abstractFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BurgerView {

    public static String getBurger() {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        int choice;
        BurgerAbstractFactory factory;


        System.out.println("You chose Burger!\n");


		selectOption("Choose meat.", "Beef", "Chicken");

		try {
			choice = input.nextInt();

			if(choice == 1) {
				factory = new BeefBurgerFactory();
			} else if (choice == 2){
				factory = new ChickenBurgerFactory();
			} else {
				throw new InputMismatchException();
			}
		}
		catch(InputMismatchException e) {
			System.err.println("Wrong input! Input only integer numbers please...");
			input.nextLine();
			return "Invalid order!";
		}


		selectOption("Choose Burger size.", "Classic", "Double");

		try {
			choice = input.nextInt();

			String order;

			if(choice == 1) {
				order = factory.createClassicBurger().writeInfo();
			} else if (choice == 2){
				order = factory.createDoubleBurger().writeInfo();
			} else {
				throw new InputMismatchException();
			}
			System.out.println(order + "\n");
			return order;
		}
		catch(InputMismatchException e) {
			System.err.println("Wrong input! Input only integer numbers please...");
			input.nextLine();
			return "Invalid order!";
		}


		//return "";

	}

	private static void selectOption(String select1, String select2, String select3) {
		System.out.println("""
				╔═════════════════════════════════════╗
				╠ %s
				╠═════════════════════════════════════╝
				╠-● 1. %s
				╠-● 2. %s
				╚═════════════════════════════════════╝
				""".formatted(select1, select2, select3));

	}

}
