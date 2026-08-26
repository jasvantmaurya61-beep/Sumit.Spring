package seekho.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.entity.Employee;

import seekho.spring.model.child;

public class Main {

	public static void main(String[] args) {
		
		

		ApplicationContext bean = new ClassPathXmlApplicationContext("applicationcontext.xml");

		
		child e2 = bean.getBean("child",child.class);

		
		System.out.println(e2);


		
		
		


	

	}

}
