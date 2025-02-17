package springdemo;

public class TrackCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
		
	//define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
		}
	@Override
	public String getDailyWorkout() {
	
		return "Run a hard 5k"; 
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it"+fortuneService.getFortune();
	}

}
