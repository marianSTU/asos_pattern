package org.example.SingletonExamples;

import org.example.Filebase.DataSource;

public class MultiThreadLazy {
	private static MultiThreadLazy instance;
	private MultiThreadLazy(){}

	public static MultiThreadLazy getInstance() {
		if (instance != null) {
			return instance;
		}
		synchronized(DataSource.class) {
			if (instance == null) {
				instance = new MultiThreadLazy();
			}
			return instance;
		}
	}
}



