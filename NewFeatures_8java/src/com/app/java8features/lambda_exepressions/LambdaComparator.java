package com.app.java8features.lambda_exepressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		// Adding Products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name...");

		Collections.sort(list, (n1, n2) -> {
			System.out.println(n1.name+"  "+n2.name);
			return n1.name.compareTo(n2.name);
		}

		);

		for (Product p : list) {
			System.out.println(p);
		}

	}
}
