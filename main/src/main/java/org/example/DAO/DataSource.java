package org.example.DAO;

import java.io.FileWriter;
import java.io.IOException;

public class DataSource implements DataSourceInterface {
	private static DataSource instance;
	private DataSource() {}

	public static DataSource getInstance() {
		// The approach taken here is called double-checked locking (DCL). It
		// exists to prevent race condition between multiple threads that may
		// attempt to get singleton instance at the same time, creating separate
		// instances as a result.
		//
		// It may seem that having the `result` variable here is completely
		// pointless. There is, however, a very important caveat when
		// implementing double-checked locking in Java, which is solved by
		// introducing this local variable.
		//
		// You can read more info DCL issues in Java here:
		// https://refactoring.guru/java-dcl-issue
		DataSource result = instance;
		if (result != null) {
			return result;
		}
		synchronized(DataSource.class) {
			if (instance == null) {
				instance = new DataSource();
			}
			return instance;
		}
	}

	@Override
	public void writeData(String orderName) {
		try {
			FileWriter myWriter = new FileWriter("orders.txt");
			myWriter.write("Order created: " + orderName + "\n");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
