/** Remove Duplicates From List
 *  Shahzore Qureshi
 *  October 8, 2016
 **/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("abdc");
		list.add("test");
		list.add("abc");
		list.add("test2");
		list.add("help");
		list.add("test");
		list.add("helppp");

		//Assume list above is the user input.

		//Print out old list for visual sake.
		System.out.println("Old List:\n========");
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("");

		//Create a Hash Table and transfer values to it.
		//Only transfer values that do not already exist
		//in the Hash Table. Let's weed out the duplicates.
		HashMap<String, ArrayList<String>> table = new HashMap<>();
		for(String s : list) {
			ArrayList<String> values = table.get(s);
			if(values == null) {
				values = new ArrayList<String>();
				values.add(s);
				table.put(s, values);
			} else {
				//Since the hash table result is not null,
				//that means there is a duplicate here.
				//There is no need to add the current
				//string to the hash table.
				//System.out.println("Duplicate found: " + s); 
			}
		}

		//Create new list without duplicates.
		ArrayList<String> newList = new ArrayList<>();
		for(Map.Entry<String, ArrayList<String>> entry : table.entrySet()) {
			String entryString = entry.getKey();
			newList.add(entryString);
		}

		//Go through new list.
		System.out.println("New List:\n========");
		for(String s : newList) {
			System.out.println(s);
		}
	}
}
