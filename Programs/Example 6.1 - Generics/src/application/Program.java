package application;

import java.util.Locale;

import entities.Product;
import services.CalculationService;
import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		PrintService<Product> ps = new PrintService<>();
		
		ps.addValue(new Product("TV", 500.0));
		ps.addValue(new Product("Iphone", 600.0));
		ps.addValue(new Product("Notebook", 700.0));

		ps.print();
		
		Product x = ps.first();
		System.out.println("First: " + x);
		
		Product y = CalculationService.max(ps.getList());
		System.out.println("Most expensive: " + y);
		
		Product p = new Product("TV", 500.0);
		System.out.println("Equals: " + ps.first().equals(p));
	}
}

// Method that calculates the total area of all the shapes in a list, that list being of shapes or any child of shape
// public static double totalArea(List<? extends Shape> list)

// Method that copies a list with specific elements to another list with generic elements
// public static void copy(List<? extends Number> source, List<? super Number> destination)