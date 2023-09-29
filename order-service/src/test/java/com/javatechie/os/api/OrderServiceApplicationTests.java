package com.javatechie.os.api;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

@SpringBootTest
class OrderServiceApplicationTests {

	@BeforeTestClass
	void beforeClass() {
		System.out.println("@BeforeTestClass");
	}
	
	/*
	 * @Before(value = "") void before() { System.out.println("@BeforeAll"); }
	 */
	
	@Test
	void contextLoads1() {
		System.out.println("contextLoads1");
		OrderController.num(5);
	}
	
	@Test
	void contextLoads2() {
		System.out.println("contextLoads2");
		OrderController.num(5);
	}
	
	@Test
	void contextLoads3() {
		System.out.println("contextLoads3");
		OrderController.num(5);
	}
	
	/*
	 * @After(value = "") void after() { System.out.println("@AfterAll"); }
	 */
	
	@AfterTestClass
	void afterClass() {
		System.out.println("@AfterTestClass");
	}

}