import java.awt.Graphics;

public interface Actor {
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
	public void draw(Graphics g);
}
