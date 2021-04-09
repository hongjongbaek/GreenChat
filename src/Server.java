import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static final int PORT = 4885;
	
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(PORT)) {
			System.out.println("클라이언트를 기다리는 중...");
			try (Socket socket = server.accept();) {
				System.out.println("클라이언트 접속 중...");
				DataInputStream input = new DataInputStream(socket.getInputStream());
				DataOutputStream output = new DataOutputStream(socket.getOutputStream());
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("클라이언트 접속 종료...");
		}
	}
}