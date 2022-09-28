package org.example.SingletonExamples;

import java.io.Serializable;

public class PreventReflection {
	private static PreventReflection instance;

	private PreventReflection(){
		if (instance != null) {
			throw new RuntimeException();
		}
	}

	public static PreventReflection getInstance(){
		if (instance == null){
			instance = new PreventReflection();
		}
		return instance;
	}
}



