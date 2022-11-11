package boBingGame;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
public class GameRule {
	public GameRule(String name) {
	JFrame RuleWindows=new JFrame(name);
	JLayeredPane LayerRule = new JLayeredPane();
	JPanel panelRule = new JPanel();
	JLabel labelRule = new JLabel();
	
	RuleWindows.setSize(750,750);
	Toolkit kit = Toolkit.getDefaultToolkit(); // 定义工具包   
	Dimension screenSize = kit.getScreenSize(); // 获取屏幕的尺寸   
	int screenWidth = screenSize.width; // 获取屏幕的宽   
	int screenHeight = screenSize.height; // 获取屏幕的高   
	RuleWindows.setLocation(screenWidth / 2 + 350/2, screenHeight / 2 - 750 / 2);
	
	//导入并设置开始界面背景图
	ImageIcon imgRule = new ImageIcon("images/RULES.png");
	imgRule.setImage(imgRule.getImage().getScaledInstance(750,750,Image.SCALE_DEFAULT));
	labelRule.setIcon(imgRule);
	
	panelRule.setBounds(0,0,imgRule.getIconWidth(),imgRule.getIconHeight());
	panelRule.add(labelRule);
	
	LayerRule.add(panelRule,JLayeredPane.DEFAULT_LAYER);
	RuleWindows.setLayeredPane(LayerRule);

	RuleWindows.setVisible(true);
	}
	
	
	
		
}
