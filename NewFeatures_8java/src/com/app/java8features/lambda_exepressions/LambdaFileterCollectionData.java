package com.app.java8features.lambda_exepressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaFileterCollectionData {
	
	  public static void main(String[] args) {  
	        List<Product> list=new ArrayList<Product>();  
	        list.add(new Product(1,"Sam99sung A5",17000f));  
	        list.add(new Product(3,"Iphone 6S",65000f));  
	        list.add(new Product(2,"Sony Xperia",25000f));  
	        list.add(new Product(4,"Nokia Lumia",15000f));  
	        list.add(new Product(5,"Red99mi4 ",26000f));  
	        list.add(new Product(6,"Lenevo Vibe",19000f));  
	        
	      List<Product> filterdata=  list.stream().filter(p->p.name.contains("99")).collect(Collectors.toList());
	      System.out.println(list);
	     System.out.println(filterdata);
	          
	  }
	  

}
