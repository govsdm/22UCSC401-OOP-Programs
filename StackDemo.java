package stack;

//Demonstrate the Stack class.
import java.util.*;

class StackDemo {
	static void showpush(Stack<Integer> st, int a) {
		// push an element into stack
		st.push(a);

		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}

	static void showpop(Stack<Integer> st) {

		System.out.print("pop -> ");
		// remove an element from the top of the stack
		Integer a = st.pop();

		System.out.println(a);
		System.out.println("stack: " + st);
	}

	public static void main(String args[]) {
		// create a stack
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("stack: " + st);

		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
		showpop(st);
		showpop(st);
		showpop(st);

		try {
			showpop(st);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}
}