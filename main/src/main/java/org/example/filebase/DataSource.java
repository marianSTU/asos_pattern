package org.example.filebase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class DataSource implements DataSourceInterface, Serializable, Cloneable {
	private static DataSource instance;
	private DataSource() {
		if (instance != null) {
			throw new RuntimeException();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public static DataSource getInstance() {
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
			BufferedWriter myWriter = new BufferedWriter(
					new FileWriter("orders.txt", true));
			myWriter.write("Order created:\n " + orderName + "\n\n\n");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException  {
		throw new CloneNotSupportedException();
	}
}
