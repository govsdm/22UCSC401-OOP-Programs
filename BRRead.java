
// Use a BufferedReader to read characters from the console.
import java.io.*;

class BRRead {
	public static void main(String args[]) {
		char c = '\0';
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit.");

		// read characters
		do {
			try {
				c = (char) br.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(c);
		} while (c != 'q');
	}
}
