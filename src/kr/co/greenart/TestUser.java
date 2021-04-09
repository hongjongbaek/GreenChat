package kr.co.greenart;

import java.util.List;

public class TestUser {
	public static void main(String[] args) {
		UserDAO.add("aaaa", "1234", "홍길동", "홍", "남", 20, "010-0000-0000"
				, "fjakfjkas@dajkdlas");
//		UserDAO.update("123123", "홍홍", "010-1111-1234", "zzz@naver.com", 2);
//		UserDAO.delete(1);
//		List<User> list = UserDAO.select();
//		System.out.println(list.get(0));
	}
}
