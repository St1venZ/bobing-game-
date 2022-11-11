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
	Toolkit kit = Toolkit.getDefaultToolkit(); // ���幤�߰�   
	Dimension screenSize = kit.getScreenSize(); // ��ȡ��Ļ�ĳߴ�   
	int screenWidth = screenSize.width; // ��ȡ��Ļ�Ŀ�   
	int screenHeight = screenSize.height; // ��ȡ��Ļ�ĸ�   
	RuleWindows.setLocation(screenWidth / 2 + 350/2, screenHeight / 2 - 750 / 2);
	
	//���벢���ÿ�ʼ���汳��ͼ
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
