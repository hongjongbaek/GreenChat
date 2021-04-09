import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class ClientConfigPage extends JFrame{
	//폰트 생성
		Font boldFont = new Font("맑은 고딕", Font.BOLD, 16);
		Font plainFont = new Font("맑은 고딕", Font.PLAIN, 12);
		//테두리 생성
		EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
		//볼록한 버튼
		BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
			
		public ClientConfigPage() {
			//프레임 크기 지정
			setSize(384, 165);
			//프레임 이름 지정
			setTitle("GREEN Chat");
			//레이아웃 설정
			getContentPane().setLayout(null);
			//창 가운데 띄우기
			setLocationRelativeTo(null);
			//창크기 변경 불가
			setResizable(false);
			
			//라벨 공간 확보
			JLabel[] lbl = new JLabel[2];
			for(int i = 0; i < 2; i++) {
				//라벨 생성
				lbl[i] = new JLabel();
				//라벨 크기 설정
				lbl[i].setSize(60, 40);
				//라벨 위치 설정
				lbl[i].setLocation(5, 5 + (i * 40));
				//라벨 폰트 설정
				lbl[i].setFont(boldFont);
				//라벨 가운데 정렬
				lbl[i].setHorizontalAlignment(JLabel.CENTER);
				//라벨 배경 수정 가능
				lbl[i].setOpaque(true);
				//라벨 배경색 설정
				lbl[i].setBackground(Color.LIGHT_GRAY);
				//라벨 보더 설정
				lbl[i].setBorder(border1);
				//라벨 추가
				getContentPane().add(lbl[i]);
			}
			//라벨 텍스트 설정
			lbl[0].setText("이름");
			lbl[1].setText("암호");
			
			//텍스트 필드 공간 확보
			JTextField[] textfield = new JTextField[2];
			for(int i = 0; i < 2; i++) {
				//텍스트 필드 생성
				textfield[i] = new JTextField();
				//텍스트 필드 크기 설정
				textfield[i].setSize(300, 40);
				//텍스트 필드 위치 설정
				textfield[i].setLocation(65, 5 + (i * 40));
				//텍스트 필드 폰트 설정
				textfield[i].setFont(plainFont);
				//텍스트 필드 가운데 정렬
				textfield[i].setHorizontalAlignment(JLabel.CENTER);
				//텍스트 필드 보더 설정
				textfield[i].setBorder(border1);
				//텍스트 필드 추가
				getContentPane().add(textfield[i]);
			}
			
			//버튼 그룹 생성
			ButtonGroup bg = new ButtonGroup();
			
			//라디오 버튼 공간 확보
			JRadioButton[] radio = new JRadioButton[5];
			for(int i = 0; i < 5; i++) {
				//라디오 생성
				radio[i] = new JRadioButton();
				//라디오 크기 설정
				radio[i].setSize(55, 40);
				//라디오 위치 설정
				radio[i].setLocation(5 + (i * 55), 85);
				bg.add(radio[i]);
				//라디오 추가
				getContentPane().add(radio[i]);
			}
			//라디오 텍스트 설정
			radio[0].setText("2명");
			radio[1].setText("5명");
			radio[2].setText("10명");
			radio[3].setText("20명");
			radio[4].setText("30명");
			
			//초기 선택
			radio[1].setSelected(true);
			
			//버튼 생성
			RoundButton btn = new RoundButton("변경");
			//라벨 크기 설정
			btn.setSize(80, 30);
			//라벨 위치 설정
			btn.setLocation(284, 90);
			//라벨 폰트 설정
			btn.setFont(boldFont);
			//라벨 가운데 정렬
			btn.setHorizontalAlignment(JLabel.CENTER);
			//라벨 추가
			getContentPane().add(btn);
			
			//프레임 보이기
			setVisible(true);
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
}