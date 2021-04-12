import java.io.IOException;
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
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(PORT)) {
			while (true) {
				System.out.println("클라이언트를 기다리는 중...");
				Socket socket = server.accept();
				
				System.out.println("클라이언트 접속 중...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("클라이언트 접속 종료...");
		}
	}
}
