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
	//��Ʈ ����
	Font font = new Font("���� ���", Font.BOLD, 16);
	//�׵θ� ����
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//������ ��ư
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
	
	public ClientJoinPage() {
		//������ ������ ����
		setSize(327, 540);
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
		
		//�� ���� 4�� Ȯ��
		JLabel lbl[] = new JLabel[9];
		for(int i = 0; i < 9; i++) {
			//�� ����
			lbl[i] = new JLabel();
			//�� ũ�� ����
			lbl[i].setSize(110, 50);
			//�� ��ġ ����
			lbl[i].setLocation(0, i * 50);
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
		//�� �ؽ�Ʈ ����
		lbl[0].setText("���̵�");
		lbl[1].setText("��й�ȣ");
		lbl[2].setText("��й�ȣ Ȯ��");
		lbl[3].setText("�̸�");
		lbl[4].setText("�г���");
		lbl[5].setText("����");
		lbl[6].setText("����");
		lbl[7].setText("�ڵ��� ��ȣ");
		lbl[8].setText("�̸��� �ּ�");
		
		//�ؽ�Ʈ �ʵ� ����
		JTextField[] textField = new JTextField[9];
		for(int i = 0; i < 9; i++) {
			//�ؽ�Ʈ �ʵ� ����
			textField[i] = new JTextField();
			//�ؽ�Ʈ �ʵ� ũ�� ����
			textField[i].setSize(200, 50);
			//�ؽ�Ʈ �ʵ� ��ġ ����
			textField[i].setLocation(110 , 50 * i);
			//�ؽ�Ʈ �ʵ� ��Ʈ ����
			textField[i].setFont(font);
			//�ؽ�Ʈ �ʵ� ��� ����
			textField[i].setHorizontalAlignment(JLabel.CENTER);
			//���� �߰�
			textField[i].setBorder(border1);
			//�ؽ�Ʈ �ʵ� �߰�
			getContentPane().add(textField[i]);
		}
		
		//��ư ����
		JButton btn = new JButton();
		//��ư ũ�� ����
		btn.setSize(310, 50);
		//��ư ��ġ ����
		btn.setLocation(0, 450);
		//��ư ��� ���� ����
		btn.setOpaque(true);
		//��ư ���� ����
		btn.setBackground(Color.LIGHT_GRAY);
		//��ư ��Ʈ ����
		btn.setFont(font);
		//��ư ��� ����
		btn.setHorizontalAlignment(JLabel.CENTER);
		//��ư �߰�
		getContentPane().add(btn);
		//��ư �ؽ�Ʈ ����
		btn.setText("ȸ������");
		
		//������ ���̰� �ϱ�
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