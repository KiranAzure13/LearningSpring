package com.example.kk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {

	public static void main(String[] args) {
		ApplicationContext applicationcontext = new ClassPathXmlApplicationContext(
				"Beans.xml");
		Point P = (Point) applicationcontext.getBean("Point10");
		System.out.println(P.getX());
		System.out.println(P.getY());

		Calculator k = (Calculator) applicationcontext.getBean("Calculator");
		System.out.println("Multiplication "+k.multiply());
		System.out.println("Division "+k.divide());
		System.out.println("Addition "+k.add());
		System.out.println("Subtract "+k.sub());
		
		Animal Cat = (Animal) applicationcontext.getBean("Animal");
		System.out.println("Weight "+Cat.getWeight());
		System.out.println("Height "+Cat.getHeight());
		System.out.println("SpecieName "+Cat.getSpecieName());
		System.out.println(Cat.getColor().getColorName());
		
	}
}
