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
		JButton singleButton =new JButton();//设置开始单人游戏按钮
		JButton mulButton =new JButton();//设置开始多人游戏按钮
		JButton ruleButton = new JButton();//设置查看规则按钮
		
		MyActionListener1 listener1=new MyActionListener1();
		singleButton.addActionListener(listener1);
		
		MyActionListener3 listener3=new MyActionListener3();
		mulButton.addActionListener(listener3);
		
		MyActionListener2 listener2=new MyActionListener2();
		ruleButton.addActionListener(listener2);
		
		windows1.setSize(350,750);
		
		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包   
		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸   
		int screenWidth = screenSize.width; // 获取屏幕的宽   
		int screenHeight = screenSize.height; // 获取屏幕的高   
		windows1.setLocation(screenWidth / 2 - 350 / 2, screenHeight / 2 - 750 / 2);
		
		//导入并设置开始界面背景图
		ImageIcon imgBackground1 = new ImageIcon("images/背景图1.jpg");
		imgBackground1.setImage(imgBackground1.getImage().getScaledInstance(350,750,Image.SCALE_DEFAULT));
		label.setIcon(imgBackground1);
		
		//导入并设置开始游戏按钮背景图
		ImageIcon imgBackground2 = new ImageIcon("images/自娱自乐.png");
		imgBackground2.setImage(imgBackground2.getImage().getScaledInstance(110,50,Image.SCALE_DEFAULT));
		singleButton.setContentAreaFilled(false);
		singleButton.setBorder(BorderFactory.createEmptyBorder());
		singleButton.setIcon(imgBackground2);
		
		ImageIcon imgBackground3 = new ImageIcon("images/多人对战.png");
		imgBackground3.setImage(imgBackground3.getImage().getScaledInstance(110,50,Image.SCALE_DEFAULT));
		mulButton.setContentAreaFilled(false);
		mulButton.setBorder(BorderFactory.createEmptyBorder());
		mulButton.setIcon(imgBackground3);
		
		//导入并设置查看游戏规则背景图
		ImageIcon imgRule = new ImageIcon("images/游戏规则.png");
		imgRule.setImage(imgRule.getImage().getScaledInstance(110,50,Image.SCALE_DEFAULT));
		ruleButton.setContentAreaFilled(false);
		ruleButton.setBorder(BorderFactory.createEmptyBorder());
		ruleButton.setIcon(imgRule);
		
		//具体设置开始游戏按钮
		singleButton.setSize(110,50);
		singleButton.setLocation(115,375);
		singleButton.setIcon(imgBackground2);
		
		mulButton.setSize(110,50);
		mulButton.setLocation(115,475);
		mulButton.setIcon(imgBackground3);
		
		//具体设置查看规则按钮
		ruleButton.setSize(110,50);
		ruleButton.setLocation(115,575);
		ruleButton.setIcon(imgRule);
		
		//设置中间面板
		panel.setBounds(0,0,imgBackground1.getIconWidth(),imgBackground1.getIconHeight());
		panel.add(label);
		panel.add(singleButton);
		panel.add(mulButton);
		panel.add(ruleButton);
		
		//将panel添加到lp中，并设置在最底层。
		lp1.add(panel,JLayeredPane.DEFAULT_LAYER);
		//将button添加到lp中，并设置在上一层。
		lp1.add(singleButton,JLayeredPane.MODAL_LAYER);
		lp1.add(ruleButton,JLayeredPane.MODAL_LAYER);
		lp1.add(mulButton,JLayeredPane.MODAL_LAYER);
		windows1.setLayeredPane(lp1);

		windows1.setVisible(true);
	}
	
	private class MyActionListener1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			new Frame2("单人游戏",1);
			
		}
	}
	
	private class MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GameRule("游戏规则");
			
		}
	}
	
	private class MyActionListener3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new Frame3("设置游戏人数");
		}
	}
	


}
