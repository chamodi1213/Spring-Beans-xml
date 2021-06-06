 package sample.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for 5km";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

//	add init method
	public void initMethodAnyName() {
		System.out.println("inside init method");
	}
	
	
//	add a destroy method
	public void destroyMethodAnyName() {
		System.out.println("inside destroy method");
	}
}
