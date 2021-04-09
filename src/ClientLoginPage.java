import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import kr.co.greenart.UserDAO;

public class ClientLoginPage extends JFrame {
	//폰트 생성
	Font font = new Font("맑은 고딕", Font.BOLD, 16);
	//테두리 생성
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//볼록한 버튼
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
	
	public ClientLoginPage() {
		//프레임 사이즈 설정
		setSize(277, 190);
		//프레임 이름 지정
		setTitle("GREEN Chat");
		//레이아웃 설정
		getContentPane().setLayout(null);
		//창크기 변경 불가
		setResizable(false);
		//창 가운데 띄우기
		setLocationRelativeTo(null);
		//배경색 설정
		getContentPane().setBackground(new Color(227, 227, 255));
		//x버튼시 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//라벨 공간 2개 확보
		JLabel lbl[] = new JLabel[2];
		for(int i = 0; i < 2; i++) {
			//라벨 생성
			lbl[i] = new JLabel();
			//라벨 크기 설정
			lbl[i].setSize(60, 50);
			//라벨 위치 설정
			lbl[i].setLocation(0, 0 + (i * 50));
			//라벨 배경 설정 가능
			lbl[i].setOpaque(true);
			//라벨 배경색 설정
			lbl[i].setBackground(Color.LIGHT_GRAY);
			//라벨 폰트 설정
			lbl[i].setFont(font);
			//라벨 가운데 정렬
			lbl[i].setHorizontalAlignment(JLabel.CENTER);
			//보더 추가
			lbl[i].setBorder(border1);
			//라벨 추가
			getContentPane().add(lbl[i]);
		}
		lbl[0].setText("ID");
		lbl[1].setText("PW");
		
		//id 텍스트 필드 생성
		JTextField idField = new JTextField();
		//id 텍스트 필드 크기 설정
		idField.setSize(200, 50);
		//id 텍스트 필드 위치 설정
		idField.setLocation(60, 0);
		//id 텍스트 필드 폰트 설정
		idField.setFont(font);
		//id 텍스트 필드 가운데 정렬
		idField.setHorizontalAlignment(JLabel.CENTER);
		//보더 추가
		idField.setBorder(border1);
		//id 텍스트 필드 추가
		getContentPane().add(idField);
		
		//password 패스워드 필드 생성
		JPasswordField passwordField = new JPasswordField();
		//password 패스워드 필드 설정
		passwordField.setSize(200, 50);
		//password 패스워드 필드 설정
		passwordField.setLocation(60, 50);
		//password 패스워드 필드 폰트 설정
		passwordField.setFont(font);
		//password 패스워드 필드 가운데 정렬
		passwordField.setHorizontalAlignment(JLabel.CENTER);
		//보더 추가
		passwordField.setBorder(border1);
		//password 패스워드 필드 추가
		getContentPane().add(passwordField);
		
		//버튼 공간 2개 확보
		RoundButton_DarkGray btn[] = new RoundButton_DarkGray[2];
		for(int i = 0; i < 2; i++) {
			//버튼 생성
			btn[i] = new RoundButton_DarkGray();
			//버튼 크기 설정
			btn[i].setSize(126, 46);
			//버튼 위치 설정
			btn[i].setLocation(2 + (i * 130), 102);
			//버튼 폰트 설정
			btn[i].setFont(font);
			//버튼 가운데 정렬
			btn[i].setHorizontalAlignment(JLabel.CENTER);
			//보더 추가
			btn[i].setBorder(border2);
			//버튼 추가
			getContentPane().add(btn[i]);
		}
		btn[0].setText("로그인");
		btn[1].setText("회원가입");
		
		//프레임 보이게 하기
		setVisible(true);
		
		//로그인 액션 리스너
		btn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int dao = UserDAO.login(idField.getText(),
						new String(passwordField.getPassword()));
				if(dao != 1) {
					JOptionPane.showMessageDialog(
							null, "아이디 또는 비밀번호가 일치하지 않습니다.");
				} else {
					ClientLobbyPage clp = new ClientLobbyPage();
					dispose();
				}
				
			}
		});
		
		//회원가입 액션리스너
		btn[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientJoinPage cjp = new ClientJoinPage();
				dispose();
			}
		});
		
	}
}