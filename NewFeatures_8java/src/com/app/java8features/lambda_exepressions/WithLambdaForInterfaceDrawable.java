package com.app.java8features.lambda_exepressions;

public class WithLambdaForInterfaceDrawable {
	
	public static void main(String[] args) {
		int width=10;
		
		Drawable d=()->System.out.println("draw :"+width);
		d.draw();
		//String name="venky";
		
		Sayable s=(name)->{
			return "hello"+name;
			};
			System.out.println(s.say("venky"));
			s.say("venky");
	}

}
