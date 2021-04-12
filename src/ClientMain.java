import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
 
public class ClientMain {
	private static final int PORT = 1239;

	public static void main(String[] args) {
		ClientLoginPage clp = new ClientLoginPage(); 
		Socket socket = null;
		try {
			socket = new Socket("localhost", PORT);
			
			System.out.println("사용자 들어가욧!");
			
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