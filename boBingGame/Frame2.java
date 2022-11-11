package boBingGame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame2 {
	public Frame2(String name,int gamerNum) {
		JFrame windows2=new JFrame(name);
		JLayeredPane lp1 = new JLayeredPane();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JLabel label7=new JLabel();
		JButton gameButton=new JButton();
		JButton checkButton =new JButton();
		int data[]=new int [6];
		String data1[][]=new String [gamerNum][2];
		for(int i=0;i<gamerNum;i++) {
			if(i==0) {
			data1[i][0]="玩家1";
			}
			if(i==1) {
				data1[i][0]="玩家2";
				}
			if(i==2) {
				data1[i][0]="玩家3";
				}
			if(i==3) {
				data1[i][0]="玩家4";
				}
			data1[i][1]="无";
		}

		
		
		windows2.setSize(350,750);

		Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包   
		Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸   
		int screenWidth = screenSize.width; // 获取屏幕的宽   
		int screenHeight = screenSize.height; // 获取屏幕的高   
		windows2.setLocation(screenWidth / 2 - 350 / 2, screenHeight / 2 - 750 / 2);
		
		ImageIcon imgBackground1 = new ImageIcon("images/背景图2.jpg");
		imgBackground1.setImage(imgBackground1.getImage().getScaledInstance(350,750,Image.SCALE_DEFAULT));
		label.setIcon(imgBackground1);
		
		ImageIcon imgBackground2 = new ImageIcon("images/开始博饼.png");
		imgBackground2.setImage(imgBackground2.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		gameButton.setContentAreaFilled(false);
		gameButton.setBorder(BorderFactory.createEmptyBorder());
		gameButton.setIcon(imgBackground2);
		
		gameButton.setSize(120,80);
		gameButton.setLocation(115,475);
		gameButton.setIcon(imgBackground2);
		
		ImageIcon imgBackground3 = new ImageIcon("images/treasure.png");
		imgBackground3.setImage(imgBackground3.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
		checkButton.setContentAreaFilled(false);
		checkButton.setBorder(BorderFactory.createEmptyBorder());
		checkButton.setIcon(imgBackground3);
		
		checkButton.setSize(50,50);
		checkButton.setLocation(145,575);
		checkButton.setIcon(imgBackground3);
		
		ImageIcon dttz1=new ImageIcon("images/色子1.gif");
		JLabel label1=new JLabel(dttz1);
		label1.setSize(50,50);
		label1.setLocation(90,50);
		label1.setVisible(true);
		
		ImageIcon dttz2=new ImageIcon("images/色子2.gif");
		JLabel label2=new JLabel(dttz2);
		label2.setSize(50,50);
		label2.setLocation(150,50);
		label2.setVisible(true);
		
		ImageIcon dttz3=new ImageIcon("images/色子3.gif");
		JLabel label3=new JLabel(dttz3);
		label3.setSize(50,50);
		label3.setLocation(210,50);
		label3.setVisible(true);
		
		ImageIcon dttz4=new ImageIcon("images/色子4.gif");
		JLabel label4=new JLabel(dttz4);
		label4.setSize(50,50);
		label4.setLocation(90,120);
		label4.setVisible(true);
		
		ImageIcon dttz5=new ImageIcon("images/色子5.gif");
		JLabel label5=new JLabel(dttz5);
		label5.setSize(50,50);
		label5.setLocation(150,120);
		label5.setVisible(true);
		
		ImageIcon dttz6=new ImageIcon("images/色子6.gif");
		JLabel label6=new JLabel(dttz6);
		label6.setSize(50,50);
		label6.setLocation(210,120);
		label6.setVisible(true);
		
		ImageIcon tz1=new ImageIcon("images/色子1.jpg");
		ImageIcon tz2=new ImageIcon("images/色子2.jpg");
		ImageIcon tz3=new ImageIcon("images/色子3.jpg");
		ImageIcon tz4=new ImageIcon("images/色子4.jpg");
		ImageIcon tz5=new ImageIcon("images/色子5.jpg");
		ImageIcon tz6=new ImageIcon("images/色子6.jpg");
		
		ImageIcon aw1=new ImageIcon("images/答案0.png");
		aw1.setImage(aw1.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw2=new ImageIcon("images/答案1.png");
		aw2.setImage(aw2.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw3=new ImageIcon("images/答案2.png");
		aw3.setImage(aw3.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw4=new ImageIcon("images/答案3.png");
		aw4.setImage(aw4.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw5=new ImageIcon("images/答案4.png");
		aw5.setImage(aw5.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw6=new ImageIcon("images/答案5.png");
		aw6.setImage(aw6.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw7=new ImageIcon("images/答案6.png");
		aw7.setImage(aw7.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw8=new ImageIcon("images/答案7.png");
		aw8.setImage(aw8.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw9=new ImageIcon("images/答案8.png");
		aw9.setImage(aw9.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw10=new ImageIcon("images/答案9.png");
		aw10.setImage(aw10.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw11=new ImageIcon("images/答案10.png");
		aw11.setImage(aw11.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw12=new ImageIcon("images/答案11.png");
		aw12.setImage(aw12.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw13=new ImageIcon("images/答案12.png");
		aw13.setImage(aw13.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		ImageIcon aw14=new ImageIcon("images/答案13.png");
		aw14.setImage(aw14.getImage().getScaledInstance(120,80,Image.SCALE_DEFAULT));
		
		class MyActionListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
					for(int i=0;i<6;i++) {
						int k=getRandomNumberInRange(1,6);
						data[i]=k;
					}
					if(data[0]==1) {label1.setIcon(tz1);}
					if(data[0]==2) {label1.setIcon(tz2);}
					if(data[0]==3) {label1.setIcon(tz3);}
					if(data[0]==4) {label1.setIcon(tz4);}
					if(data[0]==5) {label1.setIcon(tz5);}
					if(data[0]==6) {label1.setIcon(tz6);}
					
					if(data[1]==1) {label1.setIcon(tz1);}
					if(data[1]==2) {label2.setIcon(tz2);}
					if(data[1]==3) {label2.setIcon(tz3);}
					if(data[1]==4) {label2.setIcon(tz4);}
					if(data[1]==5) {label2.setIcon(tz5);}
					if(data[1]==6) {label2.setIcon(tz6);}
					
					if(data[0]==1) {label1.setIcon(tz1);}
					if(data[2]==2) {label3.setIcon(tz2);}
					if(data[2]==3) {label3.setIcon(tz3);}
					if(data[2]==4) {label3.setIcon(tz4);}
					if(data[2]==5) {label3.setIcon(tz5);}
					if(data[2]==6) {label3.setIcon(tz6);}
					
					if(data[3]==1) {label1.setIcon(tz1);}
					if(data[3]==2) {label4.setIcon(tz2);}
					if(data[3]==3) {label4.setIcon(tz3);}
					if(data[3]==4) {label4.setIcon(tz4);}
					if(data[3]==5) {label4.setIcon(tz5);}
					if(data[3]==6) {label4.setIcon(tz6);}
					
					if(data[0]==1) {label1.setIcon(tz1);}
					if(data[4]==2) {label5.setIcon(tz2);}
					if(data[4]==3) {label5.setIcon(tz3);}
					if(data[4]==4) {label5.setIcon(tz4);}
					if(data[4]==5) {label5.setIcon(tz5);}
					if(data[4]==6) {label5.setIcon(tz6);}
					
					if(data[5]==1) {label6.setIcon(tz1);}
					if(data[5]==2) {label6.setIcon(tz2);}
					if(data[5]==3) {label6.setIcon(tz3);}
					if(data[5]==4) {label6.setIcon(tz4);}
					if(data[5]==5) {label6.setIcon(tz5);}
					if(data[5]==6) {label6.setIcon(tz6);}
					
					Judge l=new Judge();
					int gold=l.check(data);
					
					if(gold==0) {label7.setIcon(aw1);}
					if(gold==1) {label7.setIcon(aw2);}
					if(gold==2) {label7.setIcon(aw3);}
					if(gold==3) {label7.setIcon(aw4);}
					if(gold==4) {label7.setIcon(aw5);}
					if(gold==5) {label7.setIcon(aw6);}
					if(gold==6) {label7.setIcon(aw7);}
					if(gold==7) {label7.setIcon(aw8);}
					if(gold==8) {label7.setIcon(aw9);}
					if(gold==9) {label7.setIcon(aw10);}
					if(gold==10) {label7.setIcon(aw11);}
					if(gold==11) {label7.setIcon(aw12);}
					if(gold==12) {label7.setIcon(aw13);}
					if(gold==13) {label7.setIcon(aw14);}
					for(int i=0;i<gamerNum;i++) {
						if(data1[i][1]=="无") {
							if(gold==0) {data1[i][1]="未中奖";}
							if(gold==1) {data1[i][1]="状元，红六勃";}
							if(gold==2) {data1[i][1]="状元，黑六勃";}
							if(gold==3) {data1[i][1]="状元，插金花";}
							if(gold==4) {data1[i][1]="状元，五红";}
							if(gold==5) {data1[i][1]="状元，五子";}
							if(gold==6) {data1[i][1]="状元，四红";}
							if(gold==7) {data1[i][1]="榜眼";}
							if(gold==8) {data1[i][1]="探花";}
							if(gold==9) {data1[i][1]="四进待二举";}
							if(gold==10) {data1[i][1]="四进待一秀";}
							if(gold==11) {data1[i][1]="进士";}
							if(gold==12) {data1[i][1]="举人";}
							if(gold==13) {data1[i][1]="秀才";}
							break;
						}
					}
					//label7 = new JLabel(bug7);
					label7.setSize(120,80);
					label7.setLocation(115,375);
					label7.setVisible(true);
				}


			
			}
		MyActionListener Listener1=new MyActionListener();
		gameButton.addActionListener(Listener1);
		
		class MyActionListener1 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame4(data1,gamerNum);
			}
		}
		
		MyActionListener1 Listener2=new MyActionListener1();
		checkButton.addActionListener(Listener2);
		
		panel.setBounds(0,0,imgBackground1.getIconWidth(),imgBackground1.getIconHeight());
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);
		panel.add(label7);
		panel.add(gameButton);
		panel.add(checkButton);
		
		
		lp1.add(panel,JLayeredPane.DEFAULT_LAYER);
		lp1.add(label1,JLayeredPane.MODAL_LAYER);
		lp1.add(label2,JLayeredPane.MODAL_LAYER);
		lp1.add(label3,JLayeredPane.MODAL_LAYER);
		lp1.add(label4,JLayeredPane.MODAL_LAYER);
		lp1.add(label5,JLayeredPane.MODAL_LAYER);
		lp1.add(label6,JLayeredPane.MODAL_LAYER);
		lp1.add(label7,JLayeredPane.MODAL_LAYER);
		lp1.add(gameButton,JLayeredPane.MODAL_LAYER);
		lp1.add(checkButton,JLayeredPane.MODAL_LAYER);
		
		
		windows2.setLayeredPane(lp1);

		windows2.setVisible(true);
		
		
		
		
	}
	
	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
	


}


