package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//("thatSillyCoach")
public class TennisCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	
	/* Constructor injection*/
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}*/
	
	public TennisCoach() {
		System.out.println("Thsi is default constructor "
				+ "of tennis coach");
		
	}
	
	/* Setter injection*/
	/*@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	/* Method injection*/
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}