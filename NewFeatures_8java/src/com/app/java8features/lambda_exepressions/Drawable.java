package com.app.java8features.lambda_exepressions;

@FunctionalInterface
public interface Drawable {
	static int i=10;
	
	
	public static int getI() {
		System.out.println(i);
		return i;
	}
	 void draw();
	 //void cancel();
	 

}
