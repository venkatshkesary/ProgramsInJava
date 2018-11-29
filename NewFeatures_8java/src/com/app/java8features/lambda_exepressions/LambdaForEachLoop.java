package com.app.java8features.lambda_exepressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEachLoop {
	
	 public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	          long start=System.currentTimeMillis();
	       list.forEach(n->System.out.println(n));
	        long end=System.currentTimeMillis();
	      //  System.out.println("foreach lambda time is : "+(end-start));
	        
	        long start1=System.currentTimeMillis();
	        for(String n:list){
	        		System.out.println(n);
	        		}
	        long end1=System.currentTimeMillis();
	        
	        System.out.println("foreach lambda time is : "+(end-start));
	        System.out.println("for time is : "+(end1-start1));
	}
   
       

}
