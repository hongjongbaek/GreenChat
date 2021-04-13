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
   
   //여기서부터 수정임
   private static int memberAmount = 0;
   private static ArrayList<Integer> pageOn = new ArrayList<>();
   /*
   0 = 로그인 페이지
   1 = 회원가입 페이지
   2 = 로비 페이지
   3 = 프로필 페이지
   4 = 방만들기 페이지
   5 = 채팅방 페이지
   */
   //여기까지가 수정임
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
            
            //여기서부터 수정임
            memberAmount++;
            pageOn.add(0);
            //여기까지가 수정임
            
            System.out.println("클라이언트 접속 중...");
            System.out.println(memberAmount);
         }
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         System.out.println("서버 종료");
      }
   }
}