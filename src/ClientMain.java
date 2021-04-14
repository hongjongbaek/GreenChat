import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
 
public class ClientMain {
	private static final int PORT = 1239;
	
	public static void main(String[] args) {
		ClientLoginPage clp = new ClientLoginPage();
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", PORT);
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			System.out.println("사용자 들어가욧!");
			Thread readServerThread = new Thread(
					new Runnable() {
						@Override
						public void run() {
							try {
								String fromServer = null;
								while ((fromServer = ois
										.readUTF()) != null) {
									System.out
											.println(fromServer);
								}
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					});

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