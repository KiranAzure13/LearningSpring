package com.example.kk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SecondAppStart {

	public static void main(String[] args) {
		

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"BeansOne.xml");
		
		Point POne= (Point) applicationContext.getBean("PointOne");	
		System.out.println(POne.getX());
		System.out.println(POne.getY());
		System.out.println(POne.getHello_World());
	
	
	}
}
