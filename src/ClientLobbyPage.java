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

public class ClientLobbyPage extends JFrame{
	//��Ʈ ����
	Font font = new Font("���� ���", Font.BOLD, 16);
	Font lebelFont = new Font("���� ���", Font.PLAIN, 12);
	//�׵θ� ����
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//������ ��ư
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
	
	public ClientLobbyPage() {
		//������ ������ ����
		setSize(565, 342);
		//������ �̸� ����
		setTitle("GREEN Chat");
		//���̾ƿ� ����
		getContentPane().setLayout(null);
		//â ��� ����
		setLocationRelativeTo(null);
		//âũ�� ���� �Ұ�
		setResizable(false);
		//x��ư�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//���� ��ư
		RoundButton[] leftBtn = new RoundButton[3];
		for(int i = 0 ; i < 3; i++) {
			//��ư ����
			leftBtn[i] = new RoundButton();
			//��ư ũ�� ����
			leftBtn[i].setSize(80, 80);
			//��ư ��ġ ����
			leftBtn[i].setLocation(5, (i * 89) + 5);
			//��ư ��Ʈ ����
			leftBtn[i].setFont(font);
			//��ư ��� ����
			leftBtn[i].setHorizontalAlignment(JLabel.CENTER);
			//��ư �߰�
			getContentPane().add(leftBtn[i]);
		}
		//��ư �ؽ�Ʈ ����
		leftBtn[0].setText("������");
		leftBtn[1].setText("�游���");
		leftBtn[2].setText("���ΰ�ħ");
		
		//�߾� ��ư
		RoundButton[] centerBtn = new RoundButton[5];
		for(int i = 0 ; i < 5; i++) {
			//��ư ����
			centerBtn[i] = new RoundButton();
			//��ư ũ�� ����
			centerBtn[i].setSize(450, 50);
			//��ư ��ġ ����
			centerBtn[i].setLocation(94, (i * 52) + 5);
			//��ư ��Ʈ ����
			centerBtn[i].setFont(font);
			//��ư ��� ����
			centerBtn[i].setHorizontalAlignment(JLabel.CENTER);
			//��ư �ؽ�Ʈ ����
			centerBtn[i].setText("");
			//��ư �߰�
			getContentPane().add(centerBtn[i]);
		}
		
		//�ϴ� ��ư
		RoundButton[] bottomBtn = new RoundButton[2];
		for(int i = 0 ; i < 2; i++) {
			//��ư ����
			bottomBtn[i] = new RoundButton();
			//��ư ũ�� ����
			bottomBtn[i].setSize(50, 30);
			//��ư ��ġ ����
			bottomBtn[i].setLocation(257 + (i * 60), 268);
			//��ư ��Ʈ ����
			bottomBtn[i].setFont(font);
			//��ư ��� ����
			bottomBtn[i].setHorizontalAlignment(JLabel.CENTER);
			//��ư �߰�
			getContentPane().add(bottomBtn[i]);
		}
		//��ư �ؽ�Ʈ ����
		bottomBtn[0].setText("����");
		bottomBtn[1].setText("����");
		
		//��ư ����
		RoundButton logoutBtn = new RoundButton();
		//��ư ũ�� ����
		logoutBtn.setSize(70, 30);
		//��ư ��ġ ����
		logoutBtn.setLocation(474, 268);
		//��ư ��Ʈ ����
		logoutBtn.setFont(font);
		//��ư ��� ����
		logoutBtn.setHorizontalAlignment(JLabel.CENTER);
		//��ư �ؽ�Ʈ �߰�
		logoutBtn.setText("�α׾ƿ�");
		//��ư �߰�
		getContentPane().add(logoutBtn);
		
		//�� ����
		JLabel text = new JLabel();
		//�� ũ�� ����
		text.setSize(250, 30);
		//�� ��ġ ����
		text.setLocation(5, 268);
		//�� ��Ʈ ����
		text.setFont(lebelFont);
		//�� ��� ����
		text.setHorizontalAlignment(JLabel.CENTER);
		//�� �ؽ�Ʈ ����
		text.setText("���� ���� �ο��� n���Դϴ�.");
		//�� �߰�
		getContentPane().add(text);
		
		//������ ���̰� �ϱ�
		setVisible(true);
		
		//������ �׼� ������
		leftBtn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientProfilePage cpfp = new ClientProfilePage();
			}
		});
		
		//�游��� �׼� ������
		leftBtn[1].addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientMakeRoom cmp = new ClientMakeRoom();
			}
		});
		
		//���ΰ�ħ �׼� ������
		leftBtn[2].addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//�� ��ư �׼� ������
		for(int i = 0; i < 5; i++) {
			centerBtn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ClientChattingRoomPage ccrp = new ClientChattingRoomPage();
				}
			});
		}
		
		//���� ������ �׼� ������
		bottomBtn[0].addActionListener(new ActionListener() {
							
			@Override
			public void actionPerformed(ActionEvent e) {
						
			}
		});
		
		//���� ������ �׼� ������
		bottomBtn[1].addActionListener(new ActionListener() {
									
			@Override
			public void actionPerformed(ActionEvent e) {
							
			}
		});
		
		//�α׾ƿ� �׼� ������
		logoutBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientLoginPage clp = new ClientLoginPage();
				dispose();
			}
		});
	}
}
