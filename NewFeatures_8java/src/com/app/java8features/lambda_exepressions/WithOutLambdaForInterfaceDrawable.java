package com.app.java8features.lambda_exepressions;

public class WithOutLambdaForInterfaceDrawable {
	
	public static void main(String[] args) {
		int width=10;
		
		//without  lambda , Drawable implementation by using anonymous class
		
		Drawable draw=new Drawable() {

			@Override
			public void draw() {
				System.out.println("Drawing :"+width+i);
				
			}

		};
		
		draw.draw();
		Drawable.getI();
	//	draw.getI();
	}

}
