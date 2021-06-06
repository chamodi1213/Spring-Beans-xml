package sample.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "lucky day!!!!!";
	}

}
