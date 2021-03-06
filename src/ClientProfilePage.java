import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import kr.co.greenart.User;
import kr.co.greenart.UserDAO;

public class ClientProfilePage extends JFrame {
	//폰트 생성
	Font boldFont = new Font("맑은 고딕", Font.BOLD, 16);
	Font plainFont = new Font("맑은 고딕", Font.PLAIN, 12);
	//테두리 생성
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//볼록한 버튼
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
	
	public ClientProfilePage(String id) {
		List<String> profile = UserDAO.profile(id);
		//프레임 사이즈 설정
		setSize(395, 380);
		//프레임 이름 지정
		setTitle("GREEN Chat");
		//레이아웃 설정
		getContentPane().setLayout(null);
		//배경색 설정
		getContentPane().setBackground(new Color(227, 227, 255));
		//창크기 변경 불가
		setResizable(false);
		//창 가운데 띄우기
		setLocationRelativeTo(null);
		
		//사진 라벨 생성
		JLabel photo = new JLabel();
		//라벨 크기 설정
		photo.setSize(120, 160);
		//라벨 위치 설정
		photo.setLocation(5, 5);
		//라벨 배경 설정 가능
		photo.setOpaque(true);
		//라벨 배경색 설정
		photo.setBackground(Color.WHITE);
		//버튼 폰트 설정
		photo.setFont(boldFont);
		//버튼 가운데 정렬
		photo.setHorizontalAlignment(JLabel.CENTER);
		//라벨 보더 설정
		photo.setBorder(border1);
		//라벨 텍스트 추가
		photo.setText("사진");
		//라벨 추가
		getContentPane().add(photo);
		
		//라벨 공간 확보
		JLabel[] inf = new JLabel[5];
		for(int i = 0; i < 5; i++) {
			//라벨 생성
			inf[i] = new JLabel();
			//라벨 크기 설정
			inf[i].setSize(100, 32);
			//라벨 위치 설정
			inf[i].setLocation(125, 5 + (i * 32));
			//라벨 배경 설정 가능
			inf[i].setOpaque(true);
			//라벨 배경색 설정
			inf[i].setBackground(Color.WHITE);
			//버튼 폰트 설정
			inf[i].setFont(boldFont);
			//버튼 가운데 정렬
			inf[i].setHorizontalAlignment(JLabel.CENTER);
			//버튼 보더 설정
			inf[i].setBorder(border1);
			//라벨 추가
			getContentPane().add(inf[i]);
		}
		//라벨 텍스트 추가
		inf[0].setText("아이디");
		inf[1].setText("닉네임");
		inf[2].setText("이름");
		inf[3].setText("성별");
		inf[4].setText("나이");
		
		//라벨 공간 확보
		JLabel[] infvalue = new JLabel[5];
		for(int i = 0; i < 5; i++) {
			//라벨 생성
			infvalue[i] = new JLabel();
			//라벨 크기 설정
			infvalue[i].setSize(150, 32);
			//라벨 위치 설정
			infvalue[i].setLocation(225, 5 + (i * 32));
			//라벨 배경 설정 가능
			infvalue[i].setOpaque(true);
			//라벨 배경색 설정
			infvalue[i].setBackground(Color.WHITE);
			//버튼 폰트 설정
			infvalue[i].setFont(plainFont);
			//버튼 가운데 정렬
			infvalue[i].setHorizontalAlignment(JLabel.CENTER);
			//버튼 보더 설정
			infvalue[i].setBorder(border1);
			//라벨 추가
			getContentPane().add(infvalue[i]);
		}
		//라벨 텍스트 추가
		
		infvalue[0].setText(profile.get(0));
		infvalue[1].setText(profile.get(1));
		infvalue[2].setText(profile.get(2));
		infvalue[3].setText(profile.get(3));
		infvalue[4].setText(profile.get(4));
		
		//라벨 공간 확보
		JLabel[] adress = new JLabel[2];
		for(int i = 0; i < 2; i++) {
			//라벨 생성
			adress[i] = new JLabel();
			//라벨 크기 설정
			adress[i].setSize(120, 80);
			//라벨 위치 설정
			adress[i].setLocation(5, 175 + (i * 80));
			//라벨 배경 설정 가능
			adress[i].setOpaque(true);
			//라벨 배경색 설정
			adress[i].setBackground(Color.WHITE);
			//버튼 폰트 설정
			adress[i].setFont(boldFont);
			//버튼 가운데 정렬
			adress[i].setHorizontalAlignment(JLabel.CENTER);
			//버튼 보더 설정
			adress[i].setBorder(border1);
			//라벨 추가
			getContentPane().add(adress[i]);
		}
		//라벨 텍스트 추가
		adress[0].setText("이메일");
		adress[1].setText("전화번호");
		
		//라벨 공간 확보
		JLabel[] adressValue = new JLabel[2];
		for(int i = 0; i < 2; i++) {
			//라벨 생성
			adressValue[i] = new JLabel();
			//라벨 크기 설정
			adressValue[i].setSize(250, 80);
			//라벨 위치 설정
			adressValue[i].setLocation(125, 175 + (i * 80));
			//라벨 배경 설정 가능
			adressValue[i].setOpaque(true);
			//라벨 배경색 설정
			adressValue[i].setBackground(Color.WHITE);
			//라벨 텍스트 추가
			adressValue[i].setText("-");
			//버튼 폰트 설정
			adressValue[i].setFont(boldFont);
			//버튼 가운데 정렬
			adressValue[i].setHorizontalAlignment(JLabel.CENTER);
			//버튼 보더 설정
			adressValue[i].setBorder(border1);
			//라벨 추가
			getContentPane().add(adressValue[i]);
		}
		adressValue[0].setText(profile.get(5));
		adressValue[1].setText(profile.get(6));
		//프레임 보이게 하기
		setVisible(true);
		
	}
}