package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		// HashSet: Fast, but with random order
		// TreeSet: Slow, but ordered
		// LinkedHashSet: Intermediate, with insertion order
		
		// Methods
		// add(obj), remove(obj), contains(obj)
		// clear(), size(), removeIf(predicate)
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("Union: " + c);
		
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Intersection: " + d);
		
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("Difference: " + e);
	}
}
