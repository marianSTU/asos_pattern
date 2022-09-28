package org.example.factory;

import java.util.Scanner;

public class KebabView {
	public static String kebabOrder() {
		System.out.println("Choose type of kebab\n");
		System.out.println("1: Kebab in Box");
		System.out.println("2: Kebab in Bun");
		System.out.println("3: Kebab in Tortilla");

		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		BaseKebabFactory kebabFactory = new KebabFactory();

		String order = kebabFactory.createKebab(type).typeOfKebab();

		System.out.println(order);

		return order;
	}
}
