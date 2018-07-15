package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("qa");
		names.add("ws");
		names.add("ed");
		names.add("rf");
		names.add("tg");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < names.size(); i ++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("\n");
		
		//4. Print all the Strings using a for-each loop
		for(String i : names) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < names.size(); i ++) {
			if(i %2 == 0) {
			System.out.println(names.get(i));
			}
		}
		
		System.out.println("\n");		
		
		//6. Print all the Strings in reverse order.
		for(int i = names.size()-1; i >= 0; i --) {
			System.out.println(names.get(i));
		}
		
		System.out.println("\n");
		
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < names.size(); i ++) {
			if(names.get(i).contains("e") == true) {
			System.out.println(names.get(i));
			}
		}
	}
}
