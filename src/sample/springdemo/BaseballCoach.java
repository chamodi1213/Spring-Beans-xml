package sample.springdemo;

public class BaseballCoach implements Coach{
	
//	define a private field for the dependency
	private FortuneService fortuneService;
	
//	define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "batting practice for 30 mins";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
