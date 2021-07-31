package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {	
		
		List<String> list = new ArrayList<>();
		
		// Instantiate a list with some values
		// List<Integer> list = Arrays.asList(4, 2, 3, 1, 5);
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("List size: " + list.size());
		System.out.println();
		
		System.out.println("List items");
		for (String x : list) {
			System.out.println(x);
		}		
		System.out.println();
		
		System.out.println("List after removing items that start with 'M':");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println();
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println();
		
		System.out.println("List with items that start with 'A':");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println();
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println("Result after searching an item that starts with 'J': " + name);
	}		
}
