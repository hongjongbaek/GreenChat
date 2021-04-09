import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class ClientChattingRoomPage extends JFrame{
	//폰트 생성
	Font font = new Font("맑은 고딕", Font.BOLD, 16);
	//테두리 생성
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//볼록한 버튼
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
		
	public ClientChattingRoomPage() {
		//프레임 사이즈 설정
		setSize(747, 736);
		//프레임 이름 지정
		setTitle("GREEN Chat");
		//레이아웃 설정
		getContentPane().setLayout(null);
		//창 가운데 띄우기
		setLocationRelativeTo(null);
		//창크기 변경 불가
		setResizable(false);
		
		//텍스트 필드 생성
		JTextArea readArea = new JTextArea();
		//스크롤 패널 생성
		JScrollPane readScroll = new JScrollPane(readArea);
		//스크롤 패널 크기 설정
		readScroll.setSize(531, 600);
		//스크롤 패널 위치 설정
		readScroll.setLocation(0, 0);
		//스크롤바 필요시만 생성
		readScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//텍스트 필드 폰트 설정
		readArea.setFont(font);
		//텍스트 필드 수정 불가 설정
		readArea.setEditable(false);
		//스크롤 패널 추가
		getContentPane().add(readScroll);
		
		//텍스트 필드 생성
		JTextArea writeArea = new JTextArea();
		//스크롤 패널 생성
		JScrollPane writeScroll = new JScrollPane(writeArea);
		//스크롤 패널 크기 설정
		writeScroll.setSize(531, 50);
		//스크롤 패널 위치 설정
		writeScroll.setLocation(0, 600);
		//스크롤바 필요시만 생성
		writeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//텍스트 필드 폰트 설정
		readArea.setFont(font);
		//스크롤 패널 추가
		getContentPane().add(writeScroll);
		
		//버튼 공간 확보
		RoundButton[] btn = new RoundButton[5];
		for(int i = 0; i < 5; i++) {
			//버튼 생성
			btn[i] = new RoundButton();
			//버튼 크기 설정
			btn[i].setSize(100, 35);
			//버튼 위치 설정
			btn[i].setLocation(5 + (i * 105), 655);
			//버튼 폰트 설정
			btn[i].setFont(font);
			//버튼 가운데 정렬
			btn[i].setHorizontalAlignment(JLabel.CENTER);
			//보더 추가
			btn[i].setBorder(border2);
			//버튼 추가
			getContentPane().add(btn[i]);
		}
		btn[0].setText("설정");
		btn[1].setText("참가자");
		btn[2].setText("올리기");
		btn[3].setText("내려받기");
		btn[4].setText("나가기");
		
		//프레임 보이게 하기
		setVisible(true);
		
		//설정 액션 리스너
		btn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientConfigPage ccp = new ClientConfigPage();
			}
		});
		
		//참가자 액션 리스너
		btn[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//올리기 액션 리스너
		btn[2].addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//내려받기 액션 리스너
		btn[3].addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		//나가기 액션 리스너
		btn[4].addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}