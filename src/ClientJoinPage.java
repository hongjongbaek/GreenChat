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

public class ClientJoinPage extends JFrame{
	//폰트 생성
	Font font = new Font("맑은 고딕", Font.BOLD, 16);
	//테두리 생성
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//볼록한 버튼
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
	
	public ClientJoinPage() {
		//프레임 사이즈 설정
		setSize(327, 540);
		//프레임 이름 지정
		setTitle("GREEN Chat");
		//레이아웃 설정
		getContentPane().setLayout(null);
		//창 가운데 띄우기
		setLocationRelativeTo(null);
		//창크기 변경 불가
		setResizable(false);
		//x버튼시 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//라벨 공간 4개 확보
		JLabel lbl[] = new JLabel[9];
		for(int i = 0; i < 9; i++) {
			//라벨 생성
			lbl[i] = new JLabel();
			//라벨 크기 설정
			lbl[i].setSize(110, 50);
			//라벨 위치 설정
			lbl[i].setLocation(0, i * 50);
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
		//라벨 텍스트 설정
		lbl[0].setText("아이디");
		lbl[1].setText("비밀번호");
		lbl[2].setText("비밀번호 확인");
		lbl[3].setText("이름");
		lbl[4].setText("닉네임");
		lbl[5].setText("성별");
		lbl[6].setText("나이");
		lbl[7].setText("핸드폰 번호");
		lbl[8].setText("이메일 주소");
		
		//텍스트 필드 생성
		JTextField[] textField = new JTextField[9];
		for(int i = 0; i < 9; i++) {
			//텍스트 필드 생성
			textField[i] = new JTextField();
			//텍스트 필드 크기 설정
			textField[i].setSize(200, 50);
			//텍스트 필드 위치 설정
			textField[i].setLocation(110 , 50 * i);
			//텍스트 필드 폰트 설정
			textField[i].setFont(font);
			//텍스트 필드 가운데 정렬
			textField[i].setHorizontalAlignment(JLabel.CENTER);
			//보더 추가
			textField[i].setBorder(border1);
			//텍스트 필드 추가
			getContentPane().add(textField[i]);
		}
		
		//버튼 생성
		JButton btn = new JButton();
		//버튼 크기 설정
		btn.setSize(310, 50);
		//버튼 위치 설정
		btn.setLocation(0, 450);
		//버튼 배경 설정 가능
		btn.setOpaque(true);
		//버튼 배경색 설정
		btn.setBackground(Color.LIGHT_GRAY);
		//버튼 폰트 설정
		btn.setFont(font);
		//버튼 가운데 정렬
		btn.setHorizontalAlignment(JLabel.CENTER);
		//버튼 추가
		getContentPane().add(btn);
		//버튼 텍스트 설정
		btn.setText("회원가입");
		
		//프레임 보이게 하기
		setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientLoginPage clp = new ClientLoginPage();
				dispose();
			}
		});
		
	}
		
}