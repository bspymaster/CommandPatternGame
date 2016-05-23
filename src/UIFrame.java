import javax.swing.JFrame;

public class UIFrame extends JFrame {
	private VisualPanel vPanel;
	
	public UIFrame(){
		setTitle("Command Pattern Example");
		setResizable(false);
		
		addComponents();
		pack();
	}
	
	private void addComponents(){
		vPanel = new VisualPanel();
		
		add(vPanel);
	}
}
