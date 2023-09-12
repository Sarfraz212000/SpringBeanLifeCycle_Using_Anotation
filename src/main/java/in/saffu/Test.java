package in.saffu;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("in/saffu/Beans.xml");
		context.registerShutdownHook();
		Students student = context.getBean(Students.class);
		System.out.println(student);
	}
}
