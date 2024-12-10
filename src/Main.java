import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");

        Square square = applicationContext.getBean("squareID",Square.class);


        Circle circle = applicationContext.getBean("circleID", Circle.class);

        //init and destroy test

        circle.saveIntoDatabase();
        square.saveIntoDatabase();
        ((ClassPathXmlApplicationContext) applicationContext).close();

    }
}