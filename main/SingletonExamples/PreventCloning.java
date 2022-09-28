package org.example.SingletonExamples;

import java.io.Serializable;

public class PreventCloning implements Cloneable {
	private static PreventCloning instance;

	private PreventCloning(){}

	public static PreventCloning getInstance(){
		if (instance == null){
			instance = new PreventCloning();
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException  {
		throw new CloneNotSupportedException();
	}
}



