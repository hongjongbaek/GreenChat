import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static final int PORT = 4885;
	
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(PORT)) {
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ��� ��...");
			try (Socket socket = server.accept();) {
				System.out.println("Ŭ���̾�Ʈ ���� ��...");
				DataInputStream input = new DataInputStream(socket.getInputStream());
				DataOutputStream output = new DataOutputStream(socket.getOutputStream());
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ŭ���̾�Ʈ ���� ����...");
		}
	}
}