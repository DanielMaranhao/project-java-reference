package application;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		// Methods
		// put(key, value), remove(key), containsKey(key), get(key)
		// clear(), size(), keySet(), values()
		
		Map<String, String> cookies = new LinkedHashMap<>();
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "999771122");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Age: " + cookies.get("age"));
		System.out.println("Size: " + cookies.size());
		System.out.println();
		
		System.out.println("ALL COOKIES");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}		
	}
}
