package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	
		//define a private field for the dependency
	private FortuneService fortuneService;
	
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

		@Override
		public String getDailyWorkout() {
			return "Spend 30 minutes on batting practice";
		}

		@Override
		public String getDailyFortune() {
			// TODO Auto-generated method stub
			
			//use fortuneService to get fortune
			
			return fortuneService.getFortune();
		}
}