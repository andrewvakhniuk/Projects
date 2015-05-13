import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"beans.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}

}
