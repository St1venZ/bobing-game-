package boBingGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Frame4 {
	public Frame4(String data1[][],int gameNum) {
		JFrame windows2=new JFrame("查看结果");
		JLayeredPane lp1 = new JLayeredPane();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		
		windows2.setSize(350,750);

		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包   
		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸   
		int screenWidth = screenSize.width; // 获取屏幕的宽   
		int screenHeight = screenSize.height; // 获取屏幕的高   
		windows2.setLocation(screenWidth / 2 - 350 / 2, screenHeight / 2 - 750 / 2);
		
		ImageIcon imgBackground1 = new ImageIcon("images/groupbackground.JPG");
		imgBackground1.setImage(imgBackground1.getImage().getScaledInstance(350,750,Image.SCALE_DEFAULT));
		label.setIcon(imgBackground1);
		
		panel.setBounds(0,0,imgBackground1.getIconWidth(),imgBackground1.getIconHeight());
		panel.add(label);
		
		ImageIcon gamerIcon = new ImageIcon("images/gamer.png");
		gamerIcon.setImage(gamerIcon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
		
		Font font = new Font("宋体", Font.BOLD, 25);//创建1个字体实例
		for(int i=0;i<gameNum;i++) {
			if(i==0) {
				JLabel label1 = new JLabel(data1[i][0]);
				JLabel label2 = new JLabel(data1[i][1]); 
				label1.setLocation(45,65);
				label1.setSize(200,200);
				label1.setFont(font);//设置JLabel的字体
				label1.setForeground(Color.RED);//设置文字的颜色
				label1.setIcon(gamerIcon);
				label2.setLocation(200,65);
				label2.setSize(200,200);
				label2.setFont(font);//设置JLabel的字体
				label2.setForeground(Color.RED);//设置文字的颜色
				panel.add(label1);
				panel.add(label2);
				lp1.add(label1,JLayeredPane.MODAL_LAYER);
				lp1.add(label2,JLayeredPane.MODAL_LAYER);
			}
			if(i==1) {
				JLabel label3 = new JLabel(data1[i][0]);
				JLabel label4 = new JLabel(data1[i][1]);
				label3.setLocation(45,165);
				label3.setSize(200,200);
				label3.setIcon(gamerIcon);
				label4.setLocation(200,165);
				label4.setSize(200,200);
				label3.setFont(font);//设置JLabel的字体
				label3.setForeground(Color.RED);//设置文字的颜色
				label4.setFont(font);//设置JLabel的字体
				label4.setForeground(Color.RED);//设置文字的颜色
				panel.add(label3);
				panel.add(label4);
				lp1.add(label3,JLayeredPane.MODAL_LAYER);
				lp1.add(label4,JLayeredPane.MODAL_LAYER);
			}
			if(i==2) {
				JLabel label5 = new JLabel(data1[i][0]);
				JLabel label6 = new JLabel(data1[i][1]);
				label5.setLocation(45,265);
				label5.setSize(200,200);
				label5.setIcon(gamerIcon);
				label6.setLocation(200,265);
				label6.setSize(200,200);
				label5.setFont(font);//设置JLabel的字体
				label5.setForeground(Color.RED);//设置文字的颜色
				label6.setFont(font);//设置JLabel的字体
				label6.setForeground(Color.RED);//设置文字的颜色
				panel.add(label5);
				panel.add(label6);
				lp1.add(label5,JLayeredPane.MODAL_LAYER);
				lp1.add(label6,JLayeredPane.MODAL_LAYER);
			}
			if(i==3) {
				JLabel label7 = new JLabel(data1[i][0]);
				JLabel label8 = new JLabel(data1[i][1]);
				label7.setLocation(45,365);
				label7.setSize(200,200);
				label7.setIcon(gamerIcon);
				label8.setLocation(200,365);
				label8.setSize(200,200);
				label7.setFont(font);//设置JLabel的字体
				label7.setForeground(Color.RED);//设置文字的颜色
				label8.setFont(font);//设置JLabel的字体
				label8.setForeground(Color.RED);//设置文字的颜色
				panel.add(label7);
				panel.add(label8);
				lp1.add(label7,JLayeredPane.MODAL_LAYER);
				lp1.add(label8,JLayeredPane.MODAL_LAYER);
			}
		}
		
		lp1.add(panel,JLayeredPane.DEFAULT_LAYER);		
		
		windows2.setLayeredPane(lp1);

		windows2.setVisible(true);
	}

}
