package kr.co.greenart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {
	// 추가
		public static int roomadd(String room_name, String room_peoplenum
				, String room_password, String room_master) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			conn = MyConnectionProvider.getConnection();
			try {
				pstmt = conn.prepareStatement("INSERT INTO room_info"
						+ "(room_name, room_peoplenum, room_password, room_master)"
						+ " VALUE (?, ?, ?, ?)");
				pstmt.setString(1, room_name);
				pstmt.setString(2, room_peoplenum);
				pstmt.setString(3, room_password);
				pstmt.setString(4, room_master);
				
				int result = pstmt.executeUpdate();
				return result;
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				MyConnectionProvider.closeStmt(pstmt);
				MyConnectionProvider.closeConnection(conn);
			}
			return -1;
		}
	//수정
	//삭제
	//select
		public static List<Room> select() {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "SELECT * FROM room_info WHERE room_num";
			List<Room> list = new ArrayList<>();
			
		try {
			conn = MyConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String room_name = rs.getString("room_name");
				String room_peoplenum = rs.getString("room_peoplenum");
				String room_password = rs.getString("room_password");
				String room_master = rs.getString("room_master");				
				list.add(new Room(room_name, room_peoplenum
						, room_password,room_master));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MyConnectionProvider.closeRS(rs);
			MyConnectionProvider.closeStmt(pstmt);
			MyConnectionProvider.closeConnection(conn);
		}
		return list;
	}
}
