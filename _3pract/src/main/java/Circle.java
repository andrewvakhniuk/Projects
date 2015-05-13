import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;


public class Circle implements Shape {
	private Point center;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Center: ("+center.getX()+" ,"+center.getY()+") \nRadius: R");
		
	}
	public Point getCenter() {
		return center;
	}
	/*@Required*/
	@Autowired
	@Qualifier ("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}


}
