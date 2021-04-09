import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.UserDAO;

public class Server {
	private static final int PORT = 1239;
	private static List<PrintWriter> list = new ArrayList<>();
	static UserDAO dao = new UserDAO();
	
	public synchronized static void addSocket(PrintWriter socket) {
		list.add(socket);
	}
	public synchronized static void removeSocket(PrintWriter socket) {
		list.remove(socket);
	}
	public synchronized static void output(String message) {
		for(PrintWriter writer : list) {
			writer.println(message);
			writer.flush();
		}
	}
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(PORT)) {
			while (true) {
				System.out.println("클라이언트를 기다리는 중...");
				Socket socket = server.accept();
				
				System.out.println("클라이언트 접속 중...");
//				Socket client = server.accept();
				ChatThread chatThread = new ChatThread(socket);
				chatThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("클라이언트 접속 종료...");
		}
	}
}

class ChatThread extends Thread {
	private Socket socket;
	private BufferedReader reader;
	private PrintWriter writer;
	
	public ChatThread(Socket socket) {
		super();
		this.socket = socket;
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
						Server.addSocket(writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		try {
			String message = null;
			while ((message = reader.readLine()) != null) {
				Server.output(message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				Server.removeSocket(writer);
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}