package sample.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
//		load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
//		call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
//		new method using dependency injection
		System.out.println(theCoach.getFortune());
		
//		close the context
		context.close();

	}

}
