package sdmcet.cse.oop.sockets;

import java.io.IOException;
import java.net.*;

public class UDPServer {
	public static void main(String[] args) {
		int port = 12345;

		DatagramSocket socket = null;

		try {
			socket = new DatagramSocket(port);
			byte[] buffer = new byte[1024];

			System.out.println("Server is listening on port " + port);

			while (true) {
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
				socket.receive(packet);

				String received = new String(packet.getData(), 0, packet.getLength());
				System.out.println("Received: " + received);

				String response = "Echo: " + received;
				byte[] responseData = response.getBytes();

				DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length,
						packet.getAddress(), packet.getPort());

				socket.send(responsePacket);
			}
		} catch (IOException ex) {
			System.out.println("Server exception: " + ex.getMessage());
			ex.printStackTrace();
		} finally {
			if (socket != null && !socket.isClosed()) {
				socket.close();
			}
		}
	}
}
