package sdmcet.cse.oop.sockets;

import java.net.*;
import java.io.*;

public class UDPClient {
	public static void main(String[] args) {
		String hostname = "localhost";
		int port = 12345;

		DatagramSocket socket = null;

		try {
			socket = new DatagramSocket();
			InetAddress address = InetAddress.getByName(hostname);
			byte[] buffer = new byte[1024];

			BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
			String text;

			System.out.println("Enter messages to send to the server.");
			System.out.println("Type 'bye' to exit.");

			while (true) {
				System.out.print("Enter message: ");
				text = consoleReader.readLine();

				buffer = text.getBytes();
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, port);
				socket.send(packet);

				packet = new DatagramPacket(buffer, buffer.length);
				socket.receive(packet);

				String response = new String(packet.getData(), 0, packet.getLength());
				System.out.println("Server response: " + response);

				if ("bye".equalsIgnoreCase(text)) {
					break;
				}
			}
		} catch (IOException ex) {
			System.out.println("Client error: " + ex.getMessage());
			ex.printStackTrace();
		} finally {
			if (socket != null && !socket.isClosed()) {
				socket.close();
			}
		}
	}
}
