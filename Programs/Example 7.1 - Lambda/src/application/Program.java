package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import services.ProductService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));		
		
		// Comparator: receives two elements and compares them
		System.out.println("Comparator: products ordered alphabetically");
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));	
		list.forEach(System.out::println);
		System.out.println();		
		
		// Predicate: receives an element and verifies a requirement - test()		
		System.out.println("Predicate: remove if price > 100");
		list.removeIf(p -> p.getPrice() > 100);
		list.forEach(System.out::println);
		System.out.println();		
		
		// Consumer: receives an element and operates on it - accept()
		System.out.println("Consumer: increase prices by 10%");
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		list.forEach(System.out::println);
		System.out.println();
		
		// Function: receives an element and returns another element - apply()
		System.out.println("Function: retrieve product names in upper case");
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();	
		
		// Class with a method that uses a predicate as parameter
		double sum = ProductService.filteredSum(list, p -> p.getPrice() < 100);
		System.out.println("Sum of products costing less than 100: " + String.format("%.2f", sum));
	}
}
