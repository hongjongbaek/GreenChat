import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import com.mysql.cj.x.protobuf.MysqlxNotice.Warning.Level;

public class ClientLobbyPage extends JFrame{
	//폰트 생성
	Font font = new Font("맑은 고딕", Font.BOLD, 16);
	Font lebelFont = new Font("맑은 고딕", Font.PLAIN, 12);
	//테두리 생성
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//볼록한 버튼
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
	
	public ClientLobbyPage() {
		//프레임 사이즈 설정
		setSize(565, 347);
		//프레임 이름 지정
		setTitle("GREEN Chat");
		//레이아웃 설정
		getContentPane().setLayout(null);
		//창 가운데 띄우기
		setLocationRelativeTo(null);
		//배경색 설정
		getContentPane().setBackground(new Color(227, 227, 255));
		//창크기 변경 불가
		setResizable(false);
		//x버튼시 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//좌측 버튼
		RoundButton_Orange[] leftBtn = new RoundButton_Orange[3];
		for(int i = 0 ; i < 3; i++) {
			//버튼 생성
			leftBtn[i] = new RoundButton_Orange();
			//버튼 크기 설정
			leftBtn[i].setSize(65, 65);
			//버튼 위치 설정
			leftBtn[i].setLocation(10, (i * 75) + 10);
			//버튼 폰트 설정
			leftBtn[i].setFont(font);
			//버튼 가운데 정렬
			leftBtn[i].setHorizontalAlignment(JLabel.CENTER);
			//버튼 추가
			getContentPane().add(leftBtn[i]);
		}
		//버튼 텍스트 설정
		leftBtn[0].setText("프로필");
		leftBtn[1].setText("방만들기");
		leftBtn[2].setText("새로고침");
		
		//중앙 버튼
		RoundButton_White[] centerBtn = new RoundButton_White[5];
		for(int i = 0 ; i < 5; i++) {
			//버튼 생성
			centerBtn[i] = new RoundButton_White();
			//버튼 크기 설정
			centerBtn[i].setSize(450, 50);
			//버튼 위치 설정
			centerBtn[i].setLocation(94, (i * 52) + 10);
			//버튼 폰트 설정
			centerBtn[i].setFont(font);
			//버튼 가운데 정렬
			centerBtn[i].setHorizontalAlignment(JLabel.CENTER);
			//버튼 텍스트 설정
			centerBtn[i].setText("");
			//버튼 추가
			getContentPane().add(centerBtn[i]);
		}
		
		//하단 버튼
		RoundButton_DarkGray[] bottomBtn = new RoundButton_DarkGray[2];
		for(int i = 0 ; i < 2; i++) {
			//버튼 생성
			bottomBtn[i] = new RoundButton_DarkGray();
			//버튼 크기 설정
			bottomBtn[i].setSize(25, 25);
			//버튼 위치 설정
			bottomBtn[i].setLocation(284 + (i * 35), 276);
			//버튼 폰트 설정
			bottomBtn[i].setFont(font);
			//버튼 가운데 정렬
			bottomBtn[i].setHorizontalAlignment(JLabel.CENTER);
			//버튼 추가
			getContentPane().add(bottomBtn[i]);
		}
		//버튼 텍스트 설정
		bottomBtn[0].setText("◀");
		bottomBtn[1].setText("▶");
		
		//버튼 생성
		RoundButton_DarkGray logoutBtn = new RoundButton_DarkGray();
		//버튼 크기 설정
		logoutBtn.setSize(70, 30);
		//버튼 위치 설정
		logoutBtn.setLocation(474, 273);
		//버튼 폰트 설정
		logoutBtn.setFont(font);
		//버튼 가운데 정렬
		logoutBtn.setHorizontalAlignment(JLabel.CENTER);
		//버튼 텍스트 추가
		logoutBtn.setText("로그아웃");
		//버튼 추가
		getContentPane().add(logoutBtn);
		
		//버튼 생성
		RoundButton_Text text1 = new RoundButton_Text();
		//버튼 크기 설정
		text1.setSize(65, 34);
		//버튼 위치 설정
		text1.setLocation(10, 235);
		//버튼 폰트 설정
		text1.setFont(font);
		//버튼 가운데 정렬
		text1.setHorizontalAlignment(JLabel.CENTER);
		//버튼 텍스트 추가
		text1.setText("1조");
		//버튼 비활성화
		text1.setEnabled(false);
		//버튼 추가
		getContentPane().add(text1);
		
		//라벨 생성
		JLabel text2 = new JLabel();
		//라벨 크기 설정
		text2.setSize(250, 30);
		//라벨 위치 설정
		text2.setLocation(10, 273);
		//라벨 폰트 설정
		text2.setFont(lebelFont);
		//라벨 텍스트 설정
		text2.setText("현재 접속 인원은 n명입니다.");
		//라벨 추가
		getContentPane().add(text2);
		
		//프레임 보이게 하기
		setVisible(true);
		
		//프로필 액션 리스너
		leftBtn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientProfilePage cpfp = new ClientProfilePage();
			}
		});
		
		//방만들기 액션 리스너
		leftBtn[1].addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientMakeRoom cmp = new ClientMakeRoom();
			}
		});
		
		//새로고침 액션 리스너
		leftBtn[2].addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//방 버튼 액션 리스너
		for(int i = 0; i < 5; i++) {
			centerBtn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ClientChattingRoomPage ccrp = new ClientChattingRoomPage();
				}
			});
		}
		
		//이전 페이지 액션 리스너
		bottomBtn[0].addActionListener(new ActionListener() {
							
			@Override
			public void actionPerformed(ActionEvent e) {
						
			}
		});
		
		//다음 페이지 액션 리스너
		bottomBtn[1].addActionListener(new ActionListener() {
									
			@Override
			public void actionPerformed(ActionEvent e) {
							
			}
		});
		
		//로그아웃 액션 리스너
		logoutBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientLoginPage clp = new ClientLoginPage();
				dispose();
			}
		});
	}
}
