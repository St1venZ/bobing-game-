package boBingGame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Frame3 {
	public Frame3(String name) {
		JFrame InputWindows=new JFrame(name);
		JLayeredPane lp1 = new JLayeredPane();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("请输入游玩人数"); 
		JTextField textField = new JTextField(16);
		JButton button = new JButton();
		
		 class MyActionListener1 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					String str=textField.getText();
					int	gamerNum=Integer.valueOf(str);	
					new Frame2("多人游戏",gamerNum);
			}	
		}
		 
		InputWindows.setSize(350,750);

		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包   
		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸   
		int screenWidth = screenSize.width; // 获取屏幕的宽   
		int screenHeight = screenSize.height; // 获取屏幕的高   
		InputWindows.setLocation(screenWidth / 2 - 350 / 2, screenHeight / 2 - 750 / 2);
		
		ImageIcon imgBackground2 = new ImageIcon("images/gears.png");
		imgBackground2.setImage(imgBackground2.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
		
		Font font = new Font("宋体", Font.BOLD, 25);//创建1个字体实例
		
		textField.setLocation(85,485);
		textField.setSize(100,30);
		button.setLocation(215,475);
		button.setSize(50,50);
		button.setIcon(imgBackground2);
		button.setContentAreaFilled(false);
		button.setBorder(BorderFactory.createEmptyBorder());
		label.setLocation(95,475);
		label.setSize(250,150);
		label.setFont(font);//设置JLabel的字体
		label.setForeground(Color.PINK);//设置文字的颜色
		
		JLabel label1=new JLabel();
		
		ImageIcon imgBackground1 = new ImageIcon("images/房间创建.JPG");
		imgBackground1.setImage(imgBackground1.getImage().getScaledInstance(350,750,Image.SCALE_DEFAULT));
		label1.setIcon(imgBackground1);
		
		MyActionListener1 listener1=new MyActionListener1();
		button.addActionListener(listener1);
		
		panel.setBounds(0,0,imgBackground1.getIconWidth(),imgBackground1.getIconHeight());
		panel.add(label1);
		panel.add(textField);
		panel.add(button);
		panel.add(label);
		
		lp1.add(panel,JLayeredPane.DEFAULT_LAYER);
		lp1.add(textField,JLayeredPane.MODAL_LAYER);
		lp1.add(button,JLayeredPane.MODAL_LAYER);
		lp1.add(label,JLayeredPane.MODAL_LAYER);
		InputWindows.setLayeredPane(lp1);
		
		InputWindows.setVisible(true);
		
	
		
	}
	
	
	
	}
