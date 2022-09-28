package org.example.SingletonExamples;

public class BillPough {

	private BillPough() {
	}

	private static class SingletonHelper {
		private static final BillPough INSTANCE = new BillPough();
	}

	public static BillPough getInstance() {
		return SingletonHelper.INSTANCE;
	}
}



