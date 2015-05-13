import org.springframework.beans.factory.annotation.Required;


public class Point implements Shape{
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	/*@Required*/
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	/*@Required*/
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Point: ("+x+" ," +y+")");
	}

}
