import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.pojo.Address;
import com.example.demo.pojo.User;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		User user = (User) applicationContext.getBean("resource");
		
		System.out.println(user.getName() + " " + user.getAddress().getCountry());

	}

}
