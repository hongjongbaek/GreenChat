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
	//��Ʈ ����
	Font font = new Font("���� ���", Font.BOLD, 16);
	//�׵θ� ����
	EtchedBorder border1 = new EtchedBorder(EtchedBorder.RAISED);
	//������ ��ư
	BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
		
	public ClientChattingRoomPage() {
		//������ ������ ����
		setSize(747, 736);
		//������ �̸� ����
		setTitle("GREEN Chat");
		//���̾ƿ� ����
		getContentPane().setLayout(null);
		//â ��� ����
		setLocationRelativeTo(null);
		//âũ�� ���� �Ұ�
		setResizable(false);
		
		//�ؽ�Ʈ �ʵ� ����
		JTextArea readArea = new JTextArea();
		//��ũ�� �г� ����
		JScrollPane readScroll = new JScrollPane(readArea);
		//��ũ�� �г� ũ�� ����
		readScroll.setSize(531, 600);
		//��ũ�� �г� ��ġ ����
		readScroll.setLocation(0, 0);
		//��ũ�ѹ� �ʿ�ø� ����
		readScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//�ؽ�Ʈ �ʵ� ��Ʈ ����
		readArea.setFont(font);
		//�ؽ�Ʈ �ʵ� ���� �Ұ� ����
		readArea.setEditable(false);
		//��ũ�� �г� �߰�
		getContentPane().add(readScroll);
		
		//�ؽ�Ʈ �ʵ� ����
		JTextArea writeArea = new JTextArea();
		//��ũ�� �г� ����
		JScrollPane writeScroll = new JScrollPane(writeArea);
		//��ũ�� �г� ũ�� ����
		writeScroll.setSize(531, 50);
		//��ũ�� �г� ��ġ ����
		writeScroll.setLocation(0, 600);
		//��ũ�ѹ� �ʿ�ø� ����
		writeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//�ؽ�Ʈ �ʵ� ��Ʈ ����
		readArea.setFont(font);
		//��ũ�� �г� �߰�
		getContentPane().add(writeScroll);
		
		//��ư ���� Ȯ��
		RoundButton[] btn = new RoundButton[5];
		for(int i = 0; i < 5; i++) {
			//��ư ����
			btn[i] = new RoundButton();
			//��ư ũ�� ����
			btn[i].setSize(100, 35);
			//��ư ��ġ ����
			btn[i].setLocation(5 + (i * 105), 655);
			//��ư ��Ʈ ����
			btn[i].setFont(font);
			//��ư ��� ����
			btn[i].setHorizontalAlignment(JLabel.CENTER);
			//���� �߰�
			btn[i].setBorder(border2);
			//��ư �߰�
			getContentPane().add(btn[i]);
		}
		btn[0].setText("����");
		btn[1].setText("������");
		btn[2].setText("�ø���");
		btn[3].setText("�����ޱ�");
		btn[4].setText("������");
		
		//������ ���̰� �ϱ�
		setVisible(true);
		
		//���� �׼� ������
		btn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientConfigPage ccp = new ClientConfigPage();
			}
		});
		
		//������ �׼� ������
		btn[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//�ø��� �׼� ������
		btn[2].addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//�����ޱ� �׼� ������
		btn[3].addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		//������ �׼� ������
		btn[4].addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}