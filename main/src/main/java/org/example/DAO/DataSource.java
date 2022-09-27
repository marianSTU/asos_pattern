package org.example.DAO;

public class DataSource {
	private static DataSource instance;
	private DataSource() {
		if (instance != null) {
			throw new RuntimeException();
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

	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException  {
		throw new CloneNotSupportedException();
	}
}
