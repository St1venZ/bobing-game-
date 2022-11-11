package boBingGame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Container;
public class Frame1 {
	public Frame1(String name){
		JFrame windows1 = new JFrame(name);
		JLayeredPane lp1 = new JLayeredPane();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JButton singleButton =new JButton();//���ÿ�ʼ������Ϸ��ť
		JButton mulButton =new JButton();//���ÿ�ʼ������Ϸ��ť
		JButton ruleButton = new JButton();//���ò鿴����ť
		
		MyActionListener1 listener1=new MyActionListener1();
		singleButton.addActionListener(listener1);
		
		MyActionListener3 listener3=new MyActionListener3();
		mulButton.addActionListener(listener3);
		
		MyActionListener2 listener2=new MyActionListener2();
		ruleButton.addActionListener(listener2);
		
		windows1.setSize(350,750);
		
		Toolkit kit = Toolkit.getDefaultToolkit(); // ���幤�߰�   
		Dimension screenSize = kit.getScreenSize(); // ��ȡ��Ļ�ĳߴ�   
		int screenWidth = screenSize.width; // ��ȡ��Ļ�Ŀ�   
		int screenHeight = screenSize.height; // ��ȡ��Ļ�ĸ�   
		windows1.setLocation(screenWidth / 2 - 350 / 2, screenHeight / 2 - 750 / 2);
		
		//���벢���ÿ�ʼ���汳��ͼ
		ImageIcon imgBackground1 = new ImageIcon("images/����ͼ1.jpg");
		imgBackground1.setImage(imgBackground1.getImage().getScaledInstance(350,750,Image.SCALE_DEFAULT));
		label.setIcon(imgBackground1);
		
		//���벢���ÿ�ʼ��Ϸ��ť����ͼ
		ImageIcon imgBackground2 = new ImageIcon("images/��������.png");
		imgBackground2.setImage(imgBackground2.getImage().getScaledInstance(110,50,Image.SCALE_DEFAULT));
		singleButton.setContentAreaFilled(false);
		singleButton.setBorder(BorderFactory.createEmptyBorder());
		singleButton.setIcon(imgBackground2);
		
		ImageIcon imgBackground3 = new ImageIcon("images/���˶�ս.png");
		imgBackground3.setImage(imgBackground3.getImage().getScaledInstance(110,50,Image.SCALE_DEFAULT));
		mulButton.setContentAreaFilled(false);
		mulButton.setBorder(BorderFactory.createEmptyBorder());
		mulButton.setIcon(imgBackground3);
		
		//���벢���ò鿴��Ϸ���򱳾�ͼ
		ImageIcon imgRule = new ImageIcon("images/��Ϸ����.png");
		imgRule.setImage(imgRule.getImage().getScaledInstance(110,50,Image.SCALE_DEFAULT));
		ruleButton.setContentAreaFilled(false);
		ruleButton.setBorder(BorderFactory.createEmptyBorder());
		ruleButton.setIcon(imgRule);
		
		//�������ÿ�ʼ��Ϸ��ť
		singleButton.setSize(110,50);
		singleButton.setLocation(115,375);
		singleButton.setIcon(imgBackground2);
		
		mulButton.setSize(110,50);
		mulButton.setLocation(115,475);
		mulButton.setIcon(imgBackground3);
		
		//�������ò鿴����ť
		ruleButton.setSize(110,50);
		ruleButton.setLocation(115,575);
		ruleButton.setIcon(imgRule);
		
		//�����м����
		panel.setBounds(0,0,imgBackground1.getIconWidth(),imgBackground1.getIconHeight());
		panel.add(label);
		panel.add(singleButton);
		panel.add(mulButton);
		panel.add(ruleButton);
		
		//��panel��ӵ�lp�У�����������ײ㡣
		lp1.add(panel,JLayeredPane.DEFAULT_LAYER);
		//��button��ӵ�lp�У�����������һ�㡣
		lp1.add(singleButton,JLayeredPane.MODAL_LAYER);
		lp1.add(ruleButton,JLayeredPane.MODAL_LAYER);
		lp1.add(mulButton,JLayeredPane.MODAL_LAYER);
		windows1.setLayeredPane(lp1);

		windows1.setVisible(true);
	}
	
	private class MyActionListener1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			new Frame2("������Ϸ",1);
			
		}
	}
	
	private class MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GameRule("��Ϸ����");
			
		}
	}
	
	private class MyActionListener3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new Frame3("������Ϸ����");
		}
	}
	


}
