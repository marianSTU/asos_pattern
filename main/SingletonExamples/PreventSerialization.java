package org.example.SingletonExamples;

import java.io.Serializable;

public class PreventSerialization implements Serializable {
	private static PreventSerialization instance;

	private PreventSerialization(){}

	public static PreventSerialization getInstance(){
		if (instance == null){
			instance = new PreventSerialization();
		}
		return instance;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
