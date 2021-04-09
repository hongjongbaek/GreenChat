import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class ClientProfilePage extends JFrame {
	//��Ʈ ����
	Font boldFont = new Font("���� ���", Font.BOLD, 16);
	Font plainFont = new Font("���� ���", Font.PLAIN, 12);
	//�׵θ� ����
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//������ ��ư
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
	
	public ClientProfilePage() {
		//������ ������ ����
		setSize(395, 380);
		//������ �̸� ����
		setTitle("GREEN Chat");
		//���̾ƿ� ����
		getContentPane().setLayout(null);
		//âũ�� ���� �Ұ�
		setResizable(false);
		//â ��� ����
		setLocationRelativeTo(null);
		
		//���� �� ����
		JLabel photo = new JLabel();
		//�� ũ�� ����
		photo.setSize(120, 160);
		//�� ��ġ ����
		photo.setLocation(5, 5);
		//�� ��� ���� ����
		photo.setOpaque(true);
		//�� ���� ����
		photo.setBackground(Color.WHITE);
		//��ư ��Ʈ ����
		photo.setFont(boldFont);
		//��ư ��� ����
		photo.setHorizontalAlignment(JLabel.CENTER);
		//�� �ؽ�Ʈ �߰�
		photo.setText("����");
		//�� �߰�
		getContentPane().add(photo);
		
		//�� ���� Ȯ��
		JLabel[] inf = new JLabel[5];
		for(int i = 0; i < 5; i++) {
			//�� ����
			inf[i] = new JLabel();
			//�� ũ�� ����
			inf[i].setSize(100, 32);
			//�� ��ġ ����
			inf[i].setLocation(125, 5 + (i * 32));
			//�� ��� ���� ����
			inf[i].setOpaque(true);
			//�� ���� ����
			inf[i].setBackground(Color.WHITE);
			//��ư ��Ʈ ����
			inf[i].setFont(boldFont);
			//��ư ��� ����
			inf[i].setHorizontalAlignment(JLabel.CENTER);
			//�� �߰�
			getContentPane().add(inf[i]);
		}
		//�� �ؽ�Ʈ �߰�
		inf[0].setText("���̵�");
		inf[1].setText("�г���");
		inf[2].setText("�̸�");
		inf[3].setText("����");
		inf[4].setText("����");
		
		//�� ���� Ȯ��
		JLabel[] infvalue = new JLabel[5];
		for(int i = 0; i < 5; i++) {
			//�� ����
			infvalue[i] = new JLabel();
			//�� ũ�� ����
			infvalue[i].setSize(150, 32);
			//�� ��ġ ����
			infvalue[i].setLocation(225, 5 + (i * 32));
			//�� ��� ���� ����
			infvalue[i].setOpaque(true);
			//�� ���� ����
			infvalue[i].setBackground(Color.WHITE);
			//��ư ��Ʈ ����
			infvalue[i].setFont(plainFont);
			//��ư ��� ����
			infvalue[i].setHorizontalAlignment(JLabel.CENTER);
			//�� �߰�
			getContentPane().add(infvalue[i]);
		}
		//�� �ؽ�Ʈ �߰�
		infvalue[0].setText("-");
		infvalue[1].setText("-");
		infvalue[2].setText("-");
		infvalue[3].setText("-");
		infvalue[4].setText("-");
		
		//�� ���� Ȯ��
		JLabel[] adress = new JLabel[2];
		for(int i = 0; i < 2; i++) {
			//�� ����
			adress[i] = new JLabel();
			//�� ũ�� ����
			adress[i].setSize(120, 80);
			//�� ��ġ ����
			adress[i].setLocation(5, 175 + (i * 80));
			//�� ��� ���� ����
			adress[i].setOpaque(true);
			//�� ���� ����
			adress[i].setBackground(Color.WHITE);
			//��ư ��Ʈ ����
			adress[i].setFont(boldFont);
			//��ư ��� ����
			adress[i].setHorizontalAlignment(JLabel.CENTER);
			//�� �߰�
			getContentPane().add(adress[i]);
		}
		//�� �ؽ�Ʈ �߰�
		adress[0].setText("�̸���");
		adress[1].setText("��ȭ��ȣ");
		
		//�� ���� Ȯ��
		JLabel[] adressValue = new JLabel[2];
		for(int i = 0; i < 2; i++) {
			//�� ����
			adressValue[i] = new JLabel();
			//�� ũ�� ����
			adressValue[i].setSize(250, 80);
			//�� ��ġ ����
			adressValue[i].setLocation(125, 175 + (i * 80));
			//�� ��� ���� ����
			adressValue[i].setOpaque(true);
			//�� ���� ����
			adressValue[i].setBackground(Color.WHITE);
			//�� �ؽ�Ʈ �߰�
			adressValue[i].setText("-");
			//��ư ��Ʈ ����
			adressValue[i].setFont(boldFont);
			//��ư ��� ����
			adressValue[i].setHorizontalAlignment(JLabel.CENTER);
			//�� �߰�
			getContentPane().add(adressValue[i]);
		}
		
		//������ ���̰� �ϱ�
		setVisible(true);
		
	}
}