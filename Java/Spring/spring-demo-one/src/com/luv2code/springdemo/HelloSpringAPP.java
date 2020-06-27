package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LOAD THE SPRING CONFIGURATION FILE
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//RETRIEVE BEAN FROM SPRING CONTAINER
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//CALL METHODS ON THE BEAN
		System.out.println(theCoach.getDailyWorkout());
		
		// CALL THE FORTUNE SERVICE
		System.out.println(theCoach.getDailyFortune());
		
		//CLOSE THE CONTEXT
		context.close();
	}

}