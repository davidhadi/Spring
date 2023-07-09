package com.app;

import com.app.component.Alian;
import com.app.component.Employee;

import com.app.component.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Employee emp=(Employee)context.getBean("emp");
		System.out.println(emp);

        System.out.println("=======================================");
        Student st = (Student) context.getBean("std");

        System.out.println(st);

		System.out.println("=======================================");

		Alian al = (Alian) context.getBean("ali");

		System.out.println(al);
	}

}
