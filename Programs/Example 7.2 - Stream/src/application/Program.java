package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
				
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		System.out.println("Original list: " + list.toString());
		System.out.println();
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println("Map (multiply by 10): " + Arrays.toString(st1.toArray()));
		System.out.println();
		
		Stream<Integer> st2 = list.stream().filter(x -> x % 2 == 0);
		System.out.println("Filter (only even numbers): " + Arrays.toString(st2.toArray()));
		System.out.println();
		
		Stream<Integer> st3 = list.stream().sorted((x, y) -> x.compareTo(y));
		System.out.println("Sorted (ascending order): " + Arrays.toString(st3.toArray()));
		System.out.println();
		
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Reduce (add up all): " + sum);
		System.out.println();
		
		List<Integer> newList = list.stream()
			.filter(x -> x % 2 == 0)
			.map(x -> x * 10)
			.collect(Collectors.toList());
		System.out.println("Pipeline (only even numbers + multiply by 10): " + Arrays.toString(newList.toArray()));
	}
}
