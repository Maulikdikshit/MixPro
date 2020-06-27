package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext
					("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		
		boolean result = (theCoach == alphaCoach) ; 
		
		System.out.println("\n pointing to same object -->"+ result);
		System.out.println("memory location "+theCoach);
		
		System.out.println("memory location "+alphaCoach);
		
		context.close();

	}

}