package sdmcet.cse.oop.sockets;

import java.io.*;
import java.net.*;

public class SimpleClient {
	public static void main(String[] args) {
		String hostname = "localhost";
		int port = 9000;
		try {
			Socket socket = new Socket(hostname, port);
			OutputStream output = socket.getOutputStream();
			
			PrintWriter writer = new PrintWriter(output, true);

			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
			String text;

			do {
				System.out.print("Enter message: ");
				text = consoleReader.readLine();

				writer.println(text);

				String response = reader.readLine();
				System.out.println(response);
			} while (!text.equals("bye"));
		} catch (UnknownHostException ex) {
			System.out.println("Server not found: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("I/O error: " + ex.getMessage());
		}
	}
}
