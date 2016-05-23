import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class VisualPanel extends JPanel {
	private final int PANEL_WIDTH = 800;
	private final int PANEL_HEIGHT = 600;
	
	private ArrayList<Actor> actorList;
	
	public VisualPanel(){
		//allows the panel to grab keyboard input
		setFocusable(true);
		requestFocusInWindow();
		
		actorList = new ArrayList<Actor>();
		
		Player player = new Player(PANEL_WIDTH/2,PANEL_HEIGHT/2);
		actorList.add(player);
		
		addKeyListener(new KeyboardListener(player,this));
	}
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(PANEL_WIDTH,PANEL_HEIGHT);
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		//note that the first 10 pixels on the y-axis are covered by the OS frame
		g.drawString("This is a test string",0,10);
		
		for(int i = 0; i < actorList.size(); i++){
			actorList.get(i).draw(g);
		}
	}
}
