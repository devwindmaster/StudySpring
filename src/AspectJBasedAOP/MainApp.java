package AspectJBasedAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans_AOP_ASPECTJ.xml");
		StudentAOP st = (StudentAOP) context.getBean("studentAOP");

		st.getName();
		st.getAge();
		/*
		 * TODO: Thử gọi st.setName("ABC"); NULL Pointer Exception sẽ phát sinh. 
		 * WHY???? 
		 */
		try {
		st.printThrowException();
		} catch (Exception ex) {
			System.out.println("EXCEPTION CATCH: " + ex.getMessage());
		}
	}
}
