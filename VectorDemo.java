package vector;

//Demonstrate various operations on Vector
import java.util.*;

class VectorDemo {
	public static void main(String args[]) {
		
		// create a vector
		// initial capacity is 3, size is 0
		Vector<Integer> v = new Vector<Integer>(3);
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());

		// add elements to vector
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);

		System.out.println("Capacity after four additions: " + v.capacity());
		v.addElement(5);

		System.out.println("Current capacity: " + v.capacity());
		v.addElement(6);
		v.addElement(7);

		System.out.println("Current capacity: " + v.capacity());
		v.addElement(8);
		v.addElement(9);
		v.addElement(10);

		System.out.println("Current capacity: " + v.capacity());
		v.addElement(11);
		v.addElement(12);
		v.addElement(13);

		System.out.println("Current capacity: " + v.capacity());

		System.out.println("First element: " + v.firstElement());
		System.out.println("Last element: " + v.lastElement());
		if (v.contains(3))
			System.out.println("Vector contains 3.");

		// remove specified element
		v.removeElement(5);
		// remove element at specified index
		v.removeElementAt(7);

		// Use an iterator to display contents.
		Iterator<Integer> vItr = v.iterator();
		System.out.println("\nElements in vector:");

		while (vItr.hasNext())
			System.out.print(vItr.next() + " ");
		System.out.println();
	}
}