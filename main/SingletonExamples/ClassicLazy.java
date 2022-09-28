package org.example.SingletonExamples;

public class ClassicLazy{
	private static ClassicLazy instance;
	private ClassicLazy(){}
	public static ClassicLazy getInstance(){
		if (instance == null){
			instance = new ClassicLazy();
		}
		return instance;
	}
}



