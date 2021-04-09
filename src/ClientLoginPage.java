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

public class ClientLoginPage extends JFrame {
	//��Ʈ ����
	Font font = new Font("���� ���", Font.BOLD, 16);
	//�׵θ� ����
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//������ ��ư
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
	
	public ClientLoginPage() {
		//������ ������ ����
		setSize(277, 190);
		//������ �̸� ����
		setTitle("GREEN Chat");
		//���̾ƿ� ����
		getContentPane().setLayout(null);
		//âũ�� ���� �Ұ�
		setResizable(false);
		//â ��� ����
		setLocationRelativeTo(null);
		//x��ư�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�� ���� 2�� Ȯ��
		JLabel lbl[] = new JLabel[2];
		for(int i = 0; i < 2; i++) {
			//�� ����
			lbl[i] = new JLabel();
			//�� ũ�� ����
			lbl[i].setSize(60, 50);
			//�� ��ġ ����
			lbl[i].setLocation(0, 0 + (i * 50));
			//�� ��� ���� ����
			lbl[i].setOpaque(true);
			//�� ���� ����
			lbl[i].setBackground(Color.LIGHT_GRAY);
			//�� ��Ʈ ����
			lbl[i].setFont(font);
			//�� ��� ����
			lbl[i].setHorizontalAlignment(JLabel.CENTER);
			//���� �߰�
			lbl[i].setBorder(border1);
			//�� �߰�
			getContentPane().add(lbl[i]);
		}
		lbl[0].setText("ID");
		lbl[1].setText("PW");
		
		//id �ؽ�Ʈ �ʵ� ����
		JTextField idField = new JTextField();
		//id �ؽ�Ʈ �ʵ� ũ�� ����
		idField.setSize(200, 50);
		//id �ؽ�Ʈ �ʵ� ��ġ ����
		idField.setLocation(60, 0);
		//id �ؽ�Ʈ �ʵ� ��Ʈ ����
		idField.setFont(font);
		//id �ؽ�Ʈ �ʵ� ��� ����
		idField.setHorizontalAlignment(JLabel.CENTER);
		//���� �߰�
		idField.setBorder(border1);
		//id �ؽ�Ʈ �ʵ� �߰�
		getContentPane().add(idField);
		
		//password �н����� �ʵ� ����
		JPasswordField passwordField = new JPasswordField();
		//password �н����� �ʵ� ����
		passwordField.setSize(200, 50);
		//password �н����� �ʵ� ����
		passwordField.setLocation(60, 50);
		//password �н����� �ʵ� ��Ʈ ����
		passwordField.setFont(font);
		//password �н����� �ʵ� ��� ����
		passwordField.setHorizontalAlignment(JLabel.CENTER);
		//���� �߰�
		passwordField.setBorder(border1);
		//password �н����� �ʵ� �߰�
		getContentPane().add(passwordField);
		
		//��ư ���� 2�� Ȯ��
		RoundButton btn[] = new RoundButton[2];
		for(int i = 0; i < 2; i++) {
			//��ư ����
			btn[i] = new RoundButton();
			//��ư ũ�� ����
			btn[i].setSize(126, 46);
			//��ư ��ġ ����
			btn[i].setLocation(2 + (i * 130), 102);
			//��ư ��Ʈ ����
			btn[i].setFont(font);
			//��ư ��� ����
			btn[i].setHorizontalAlignment(JLabel.CENTER);
			//���� �߰�
			btn[i].setBorder(border2);
			//��ư �߰�
			getContentPane().add(btn[i]);
		}
		btn[0].setText("�α���");
		btn[1].setText("ȸ������");
		
		//������ ���̰� �ϱ�
		setVisible(true);
		
		//�α��� �׼� ������
		btn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientLobbyPage clp = new ClientLobbyPage();
				dispose();
			}
		});
		
		//ȸ������ �׼Ǹ�����
		btn[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientJoinPage cjp = new ClientJoinPage();
				dispose();
			}
		});
		
	}
}