package sample.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String email;
	private String team;

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice 1 hour";
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method-setEmail");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method-setTeam");
		this.team = team;
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method-setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
