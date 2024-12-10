import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");

        Square square = applicationContext.getBean("squareID",Square.class);
        System.out.println(square); // first instance

        Square square2 = applicationContext.getBean("squareID",Square.class);
        System.out.println(square2); // second instance

        Circle circle = applicationContext.getBean("circleID", Circle.class);
        System.out.println(circle); // first instance

        Circle circle2 = applicationContext.getBean("circleID", Circle.class);
        System.out.println(circle2); // second instance ( the same instance because it is singleton)
    }
}