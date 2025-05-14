package arrayList;

//This program demonstrates various operations on ArrayList.
import java.util.*;

class ArrayListDemo {
	public static void main(String args[]) {

		// Create an array list.
		ArrayList<String> al = new ArrayList<String>();

		System.out.println("Initial size of Array List: " + al.size());

		// Add elements to the array list.
		al.add("ISE");
		al.add("CSE");
		al.add("CHE");
		al.add("MECH");
		al.add("ECE");
		al.add("AIML");
		al.add("ECE");
		// add elements at specified index
		al.add(1, "EEE");

		System.out.println("Size of Array List after additions: " + al.size());
		// Display the array list using toString()
		System.out.println("Contents of Array List: " + al);

		// Remove specified element from the array list.
		al.remove("ECE");
		// remove the element at specified index
		al.remove(2);

		System.out.println("Size of Array List after deletions: " + al.size());
		System.out.println("Contents of Array List: " + al);

		// display the contents of array list using
		// foreach styled for loop
		System.out.println("Displaying contents using foreach styled for loop");
		for (String str : al) {
			System.out.println(str);
		}
		System.out.println("Displaying contents using iterator object");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
	}
}