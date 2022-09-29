package org.example;

import org.example.abstractFactory.BurgerView;
import org.example.builder.PizzaView;
import org.example.factory.KebabView;
import org.example.filebase.DataSource;
import org.example.prototype.SaladView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		printMainMenu();
		Scanner input = new Scanner(System.in);
		int choice;
		try {
			String order = "";
			choice = input.nextInt();
			while (choice != 5) {

				switch (choice) {
					case 1 :
						order = BurgerView.getBurger();
						break;
					case 2 :
						SaladView s = new SaladView();
						order = s.saladOrder();
						break;
					case 3 :
						order = KebabView.kebabOrder();
						break;
					case 4 :
						order = PizzaView.showMenu();
						break;
				}


				DataSource ds = DataSource.getInstance();
				ds.writeData(order);


				printMainMenu();
				try {
					choice = input.nextInt();
				}
				catch(InputMismatchException e) {
					System.err.println("Wrong input! Input only integer numbers please...");
					input.nextLine();
				}
			}

		} catch(InputMismatchException e) {
			System.err.println("Wrong input! Input only integer numbers please...");
			input.nextLine();
		}
		DataSource ds = DataSource.getInstance();
		ds.closeFileConnection();
	}

	private static void printMainMenu(){
		System.out.println("""
                ╔═════════════════════════════╗
                ╠  Choose option:
                ╠═════════════════════════════╝
                ╠-● 1. Order Burgir
                ╠-● 2. Order Salad
                ╠-● 3. Order Kebab
                ╠-● 4. Order Pizza
                ╠-● 5. EXIT
                ╚═════════════════════════════╝\s
                """);
	}
}
