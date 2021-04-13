import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class ClientChattingRoomPage extends JFrame{
	//폰트 생성
	Font font = new Font("맑은 고딕", Font.BOLD, 16);
	//테두리 생성
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//볼록한 버튼
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
	//테이블 헤더 생성
	String[] head = {"닉네임", "성별"};
	//테이블 바디 생성
	String[][] body = 
		{{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", "",},
		{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", "",},
		{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", "",},
		{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", "",},
		{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", "",},
		{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", "",}};
	//참가자 버튼 확인
	boolean memberCheck = false;
	
	public ClientChattingRoomPage() {
		//프레임 사이즈 설정
		setSize(558, 866);
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
		
		//텍스트 필드 생성
		JTextArea readArea = new JTextArea();
		//스크롤 패널 생성
		JScrollPane readScroll = new JScrollPane(readArea);
		//스크롤 패널 크기 설정
		readScroll.setSize(532, 722);
		//스크롤 패널 위치 설정
		readScroll.setLocation(5, 5);
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
		writeScroll.setSize(532, 48);
		//스크롤 패널 위치 설정
		writeScroll.setLocation(5, 730);
		//스크롤바 필요시만 생성
		writeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//텍스트 필드 폰트 설정
		readArea.setFont(font);
		//스크롤 패널 추가
		getContentPane().add(writeScroll);
		
		//버튼 공간 확보
		RoundButton_DarkGray[] btn = new RoundButton_DarkGray[8];
		for(int i = 0; i < 8; i++) {
			//버튼 생성
			btn[i] = new RoundButton_DarkGray();
			//버튼 크기 설정
			btn[i].setSize(102, 35);
			//버튼 위치 설정
			btn[i].setLocation(5 + (i * 107), 785);
			//버튼 폰트 설정
			btn[i].setFont(font);
			//버튼 가운데 정렬
			btn[i].setHorizontalAlignment(JLabel.CENTER);
			//보더 추가
			btn[i].setBorder(border2);
			if(i > 4) {
				btn[i].setVisible(false);
			}
			
			//버튼 추가
			getContentPane().add(btn[i]);
		}
		//버튼 텍스트 설정
		btn[0].setText("설정");
		btn[1].setText("참가자");
		btn[2].setText("올리기");
		btn[3].setText("내려받기");
		btn[4].setText("나가기");
		btn[5].setText("프로필");
		btn[6].setText("권한이전");
		btn[7].setText("강퇴");
		
		//테이블 모델 생성
		DefaultTableModel tableModel = new DefaultTableModel(body, head) {
			//모델 수정 불가
			public boolean isCellEditable(int row, int Column) {
				return false;
			}
		};
		//테이블 생성
		JTable memberTable = new JTable();
		//테이블에 모델 추가
		memberTable.setModel(tableModel);
		//테이블 행 크기 조정
		memberTable.setRowHeight(25);
		//패널 생성
		JScrollPane tablePanel = new JScrollPane(memberTable);
		//크기와 위치 설정
		tablePanel.setBounds(542, 5, 315, 773);
		//필요시에만 스크롤바 생성
		tablePanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//패널 추가
		getContentPane().add(tablePanel);
		
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
				if(!memberCheck) {
					//프레임 사이즈 설정
					setSize(877, 866);
					for(int i = 5; i < 8 ; i++) {
						btn[i].setVisible(true);
					}
					memberCheck = true;
				} else {
					setSize(558, 866);
					for(int i = 5; i < 8 ; i++) {
						btn[i].setVisible(false);
					}
					memberCheck = false;
				}
			}
		});
		
		//올리기 액션 리스너
		btn[2].addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				//파일 추저 생성
				JFileChooser filechooser = new JFileChooser();
				//파일 추저 정의
				int chooserValue = filechooser.showSaveDialog(null);
				//파일 경로 저장
				String path = "";
				path = filechooser.getSelectedFile().getPath();
				if(path != "") {
					
				}
				
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
		
		//프로필 액션 리스너
		btn[5].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();		
			}
		});
		
		//권한이전 액션 리스너
		btn[6].addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();		
			}
		});
		
		//강퇴 액션 리스너
		btn[7].addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();		
			}
		});
	}
}