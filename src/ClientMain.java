import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
 
public class ClientMain {
	private static final int PORT = 1239;

	public static void main(String[] args) {
		Socket socket = null;
		ClientLoginPage clp = new ClientLoginPage();
		try {
			socket = new Socket("localhost", PORT);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}