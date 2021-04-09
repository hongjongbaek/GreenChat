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
	//��Ʈ ����
		Font boldFont = new Font("���� ���", Font.BOLD, 16);
		Font plainFont = new Font("���� ���", Font.PLAIN, 12);
		//�׵θ� ����
		EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
		//������ ��ư
		BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
			
		public ClientConfigPage() {
			//������ ũ�� ����
			setSize(384, 165);
			//������ �̸� ����
			setTitle("GREEN Chat");
			//���̾ƿ� ����
			getContentPane().setLayout(null);
			//â ��� ����
			setLocationRelativeTo(null);
			//âũ�� ���� �Ұ�
			setResizable(false);
			
			//�� ���� Ȯ��
			JLabel[] lbl = new JLabel[2];
			for(int i = 0; i < 2; i++) {
				//�� ����
				lbl[i] = new JLabel();
				//�� ũ�� ����
				lbl[i].setSize(60, 40);
				//�� ��ġ ����
				lbl[i].setLocation(5, 5 + (i * 40));
				//�� ��Ʈ ����
				lbl[i].setFont(boldFont);
				//�� ��� ����
				lbl[i].setHorizontalAlignment(JLabel.CENTER);
				//�� ��� ���� ����
				lbl[i].setOpaque(true);
				//�� ���� ����
				lbl[i].setBackground(Color.LIGHT_GRAY);
				//�� ���� ����
				lbl[i].setBorder(border1);
				//�� �߰�
				getContentPane().add(lbl[i]);
			}
			//�� �ؽ�Ʈ ����
			lbl[0].setText("�̸�");
			lbl[1].setText("��ȣ");
			
			//�ؽ�Ʈ �ʵ� ���� Ȯ��
			JTextField[] textfield = new JTextField[2];
			for(int i = 0; i < 2; i++) {
				//�ؽ�Ʈ �ʵ� ����
				textfield[i] = new JTextField();
				//�ؽ�Ʈ �ʵ� ũ�� ����
				textfield[i].setSize(300, 40);
				//�ؽ�Ʈ �ʵ� ��ġ ����
				textfield[i].setLocation(65, 5 + (i * 40));
				//�ؽ�Ʈ �ʵ� ��Ʈ ����
				textfield[i].setFont(plainFont);
				//�ؽ�Ʈ �ʵ� ��� ����
				textfield[i].setHorizontalAlignment(JLabel.CENTER);
				//�ؽ�Ʈ �ʵ� ���� ����
				textfield[i].setBorder(border1);
				//�ؽ�Ʈ �ʵ� �߰�
				getContentPane().add(textfield[i]);
			}
			
			//��ư �׷� ����
			ButtonGroup bg = new ButtonGroup();
			
			//���� ��ư ���� Ȯ��
			JRadioButton[] radio = new JRadioButton[5];
			for(int i = 0; i < 5; i++) {
				//���� ����
				radio[i] = new JRadioButton();
				//���� ũ�� ����
				radio[i].setSize(55, 40);
				//���� ��ġ ����
				radio[i].setLocation(5 + (i * 55), 85);
				bg.add(radio[i]);
				//���� �߰�
				getContentPane().add(radio[i]);
			}
			//���� �ؽ�Ʈ ����
			radio[0].setText("2��");
			radio[1].setText("5��");
			radio[2].setText("10��");
			radio[3].setText("20��");
			radio[4].setText("30��");
			
			//�ʱ� ����
			radio[1].setSelected(true);
			
			//��ư ����
			RoundButton btn = new RoundButton("����");
			//�� ũ�� ����
			btn.setSize(80, 30);
			//�� ��ġ ����
			btn.setLocation(284, 90);
			//�� ��Ʈ ����
			btn.setFont(boldFont);
			//�� ��� ����
			btn.setHorizontalAlignment(JLabel.CENTER);
			//�� �߰�
			getContentPane().add(btn);
			
			//������ ���̱�
			setVisible(true);
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
}