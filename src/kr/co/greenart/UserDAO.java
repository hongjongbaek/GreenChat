package kr.co.greenart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	// 추가
	public static int add(String user_id, String user_password, String user_name, String user_nickname,
			String user_gender, int user_age, String user_phnum, String user_email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = MyConnectionProvider.getConnection();
		try {
			pstmt = conn.prepareStatement(
					"INSERT INTO user_table " + "(user_id, user_password, user_name, user_nickname, user_gender"
							+ ",user_age, user_phnum, user_email) " + " VALUE (?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_password);
			pstmt.setString(3, user_name);
			pstmt.setString(4, user_nickname);
			pstmt.setString(5, user_gender);
			pstmt.setInt(6, user_age);
			pstmt.setString(7, user_phnum);
			pstmt.setString(8, user_email);

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

	// 수정
	public static int update(String user_password, String user_nickname, String user_phnum, String user_email,
			int user_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String query = "UPDATE user_table SET " + "user_password = ?, user_nickname = ?, "
				+ "user_phnum = ?, user_email = ? WHERE user_num = ?";

		try {
			conn = MyConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user_password);
			pstmt.setString(2, user_nickname);
			pstmt.setString(3, user_phnum);
			pstmt.setString(4, user_email);
			pstmt.setInt(5, user_num);

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

	// 삭제
	public static int delete(int user_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "DELETE FROM user_table WHERE user_num = ?";

		try {
			conn = MyConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, user_num);
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

	// select
	public static List<User> select() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "SELECT * FROM user_table";
		List<User> list = new ArrayList<>();

		try {
			conn = MyConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String user_id = rs.getString("user_id");
				String user_password = rs.getString("user_password");
				String user_name = rs.getString("user_name");
				String user_nickname = rs.getString("user_nickname");
				String user_gender = rs.getString("user_gender");
				int user_age = rs.getInt("user_age");
				String user_phnum = rs.getString("user_phnum");
				String user_eamil = rs.getString("user_email");
				list.add(new User(user_id, user_password, user_name, user_nickname, user_gender, user_age, user_phnum,
						user_eamil));
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
	
	// 로그인 
	public static int login(String id, String password) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "SELECT * FROM user_table WHERE user_id = ?" + " AND user_password = ?";
		try {
			conn = MyConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String dbid = rs.getString("user_id");
				String dbpw = rs.getString("user_password");
				if (dbid.equals(id) && dbpw.equals(password)) {
					System.out.println("로그인 완료");
					return 1;
				}
			}
			System.out.println("로그인 실패");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MyConnectionProvider.closeRS(rs);
			MyConnectionProvider.closeStmt(pstmt);
			MyConnectionProvider.closeConnection(conn);
		}
		return -1;
	}
}
