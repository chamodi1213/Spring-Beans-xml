package sample.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getDailyWorkout());

		System.out.println("email: "+theCoach.getEmail());
		System.out.println("name: "+theCoach.getTeam());
		context.close();

	}

}
