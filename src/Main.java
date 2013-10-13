import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String... w)
	{
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person per = (Person)appCon.getBean("person");
		Student studentObj = per.getStu();
		studentObj.setCourseOpted("Java");
		studentObj.display();
	}
}
