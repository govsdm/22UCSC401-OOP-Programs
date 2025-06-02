package sdmcet.cse.oop.sockets;

import java.io.*;
import java.net.*;

public class SimpleServer {
	public static void main(String[] args) {
		int port = 9000;
		try {
			ServerSocket serverSocket = new ServerSocket(port);

			while (true) {
				Socket socket = serverSocket.accept();

				InputStream input = socket.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));

				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output, true);

				String text;

				while ((text = reader.readLine()) != null) {
					System.out.println("Received: " + text);
					writer.println("Echo: " + text);
				}
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
