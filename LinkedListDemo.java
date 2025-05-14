package linkedList;

//Demonstrate various operations of LinkedList.
import java.util.*;

class LinkedListDemo {
	public static void main(String args[]) {
		
		// Create a linked list.
		LinkedList<String> ll = new LinkedList<String>();
		
		// Add elements to the linked list.
		ll.add("Java");
		ll.add("C");
		ll.add("C++");
		ll.add("Python");
		ll.add("DJango");
		//add element at the end of the linked list
		ll.addLast("Flutter");
		//add element at the beginning of the linked list
		ll.addFirst("Ruby");
		//add element at the specified index of the linked list
		ll.add(1, "React");
		
		System.out.println("Original contents of Linked List: " + ll);
		
		// Remove elements from the linked list.
		ll.remove("Flutter");
		ll.remove(2);
		System.out.println("Contents of Linked List after deletion: " + ll);
		
		// Remove first and last elements.
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Linked List after deleting first and last: " + ll);
		
		// Get and set a value.
		String val = ll.get(2);
		ll.set(2, val + " Changed");
		System.out.println("Linked List after change: " + ll);
	}
}
