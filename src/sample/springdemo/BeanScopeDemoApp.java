package sample.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println((theCoach==alphaCoach));
		System.out.println("theCoach: "+theCoach);
		System.out.println("alphaCoach: "+alphaCoach);
		
		context.close(); 

	}

}
