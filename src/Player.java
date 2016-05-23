import java.awt.Color;
import java.awt.Graphics;

public class Player implements Actor {
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	
	private int moveIncrement;
	
	public Player(int startX,int startY){
		x = startX;
		y = startY;
		width = 10;
		height = 10;
		color = Color.RED;
		moveIncrement = 5;
	}
	
	@Override
	public void draw(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, width, height);
		//outline
		g.setColor(Color.BLACK);
		g.drawRect(x,y,width,height);
	}
	public void moveUp(){
		y-=moveIncrement;
	}
	public void moveDown(){
		y+=moveIncrement;
	}
	public void moveLeft(){
		x-=moveIncrement;
	}
	public void moveRight(){
		x+=moveIncrement;
	}
}
