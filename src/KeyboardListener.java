import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JPanel;

public class KeyboardListener extends KeyAdapter {
	private Actor controlledActor;
	private JPanel panel;
	
	public KeyboardListener(Actor controllableActor,JPanel drawable){
		super();
		controlledActor = controllableActor;
		panel = drawable;
	}
	@Override
	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode()==KeyEvent.VK_UP){
			new MoveUpCommand().execute(controlledActor);
		}else if(k.getKeyCode()==KeyEvent.VK_DOWN){
			new MoveDownCommand().execute(controlledActor);
		}else if(k.getKeyCode()==KeyEvent.VK_LEFT){
			new MoveLeftCommand().execute(controlledActor);
		}else if(k.getKeyCode()==KeyEvent.VK_RIGHT){
			new MoveRightCommand().execute(controlledActor);
		}
		//redraw objects on screen
		panel.repaint();
		panel.revalidate();
	}
	@Override
	public void keyReleased(KeyEvent k) {
		//pass
	}
	@Override
	public void keyTyped(KeyEvent k) {
		//pass
	}

}
