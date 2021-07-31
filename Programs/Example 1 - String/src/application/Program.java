package application;

public class Program {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		String metals = "iron steel mithril";
		
		// Useful for very long text
		StringBuilder sb = new StringBuilder();
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2, 9);
		String s6 = original.replace('a', 'x');
		String s7 = original.replace("abc", "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		String[] vect = metals.split(" "); 
		
		sb.append("Original: -" + original + "-\n");
		sb.append("toLowerCase: -" + s1 + "-\n");
		sb.append("toUpperCase: -" + s2 + "-\n");
		sb.append("trim: -" + s3 + "-\n");
		sb.append("substring(2): -" + s4 + "-\n");
		sb.append("substring(2, 9): -" + s5 + "-\n");
		sb.append("replace('a', 'x'): -" + s6 + "-\n");
		sb.append("replace('abc', 'xyz'): -" + s7 + "-\n");
		sb.append("Index of 'bc': " + i + "\n");
		sb.append("Last index of 'bc': " + j + "\n\n");
		sb.append("Metals(Split):\n");
		for(String metal : vect) {
			sb.append(metal + "\n");
		}
		System.out.println(sb.toString());			
		
		// Declare in a class to be able to print its objects
		// public String toString()		
	}
}
