package hashSet;

//Demonstrate HashSet.
import java.util.*;

class HashSetDemo {
	public static void main(String args[]) {
		
		// Create a hash set.
		HashSet<String> hs = new HashSet<String>();
		
		// Add elements to the hash set.
		hs.add("Beta");
		hs.add("Epsilon");
		hs.add("Alpha");
		
		hs.add("Gamma");
		
		hs.add("Omega");
		hs.add("Eta");
		hs.add("Omega");
		hs.add("Greek");
		
		System.out.println(hs);
		hs.remove("Omega");
		System.out.println(hs);
	}
}
