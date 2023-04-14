package com.test.practice.prog01;

//import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Prog01Application {

	public static void main(String[] args) {
		
		//without bean - An empty context area
		var context = new AnnotationConfigApplicationContext();
		System.out.println("I am Spring Context Address without Beans: " + context);
		
		//with bean injected
		var contextbean = new AnnotationConfigApplicationContext(Config01.class);
			
			//normal bean injections
			System.out.println(contextbean.getBean("name"));
			System.out.println(contextbean.getBean("age"));
			System.out.println(contextbean.getBean("setFlags"));
			
			//record type bean injections
			System.out.println(contextbean.getBean("person"));
			System.out.println(contextbean.getBean("address"));

			//Pass record class type bean injections
			System.out.println(contextbean.getBean(Address.class));

			

	}

}
