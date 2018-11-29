package com.app.java8features.methodreferences;
public class Static_MethodReference {  
	
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = Static_MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
        
        Thread t2=new Thread(Static_MethodReference::saySomething);  
        t2.start();       
    }  
}