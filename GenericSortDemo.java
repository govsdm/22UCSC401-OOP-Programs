package generics;

import java.util.Arrays;

//class Employee {
//	int rollNo;
//	String usn;
//	String name;
//
//	Employee(int r, String u, String n) {
//		rollNo = r;
//		usn = u;
//		name = n;
//	}
//
//	public String toString() {
//		return rollNo + ":" + usn + ":" + name;
//	}
//}

public class GenericSortDemo {

	private <T> void swap(T[] a, int i, int j) {
		if (i != j) {
			T temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

	public <T extends Comparable<T>> void sort(T[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// find index of smallest element
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[smallest]) > 0) {
					smallest = j;
				}
			}
			swap(a, i, smallest); // swap smallest to front
		}
	}

	public static void main(String[] args) {
		GenericSortDemo gs = new GenericSortDemo();

		Integer[] arr = { 3, 4, 1, 5 };
		System.out.println("before sorting int: " + Arrays.toString(arr));
		gs.sort(arr);
		System.out.println("After sorting int : " + Arrays.toString(arr));

		Double[] d = { 3.0, 4.0, 1.0, 5.0 };
		System.out.println("before sorting int: " + Arrays.toString(d));
		gs.sort(d);
		System.out.println("After sorting int : " + Arrays.toString(d));

		String[] str = { "acd", "ded", "dal", "bad", "cle" };
		System.out.println("before sorting String: " + Arrays.toString(str));
		gs.sort(str);
		System.out.println("After sorting String : " + Arrays.toString(str));

		Character[] ch = { 'c', 'e', 'a', 'd', 'c' };
		System.out.println("before sorting char: " + Arrays.toString(ch));
		gs.sort(ch);
		System.out.println("After sorting char : " + Arrays.toString(ch));
	}
}
