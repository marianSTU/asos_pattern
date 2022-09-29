package org.example.filebase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataSource implements DataSourceInterface {
	private static DataSource instance;
	private static BufferedWriter connection;
	private DataSource() {
		if (instance != null) {
			throw new RuntimeException();
		}
		try {
			connection = new BufferedWriter(new FileWriter("orders.txt", true));
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static DataSource getInstance() {
		if (instance == null){
			instance = new DataSource();
		}
		return instance;
	}

	@Override
	public void writeData(String orderName) {
		try {
			connection.write("Order created:\n " + orderName + "\n\n\n");
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public void closeFileConnection() {
		try {
			connection.close();
		} catch (IOException ignored) {}
	}


}
