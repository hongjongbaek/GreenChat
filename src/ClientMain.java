import java.io.DataInputStream;
import java.io.DataOutputStream;
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
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("사용자 들어가욧!");
			String chk = scanner.nextLine();
			
			dos.writeUTF(chk);
			dos.flush();
			
			Thread readServerThread = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						String fromServer = null;
						while((fromServer = dis.readUTF()) != null ) {
							System.out.println(fromServer);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
//			readServerThread.setDaemon(true);
			readServerThread.start();
			while(true) {
				String message = scanner.nextLine();
				dos.writeUTF(message);
				dos.flush();
			} 
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