package dev.bruno.automation.pratice.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.bruno.automation.pratice.selenium.pages.RegisterPage;

class RegisterPageTest {
	private RegisterPage registerPage; 
	private final String URL= "https://demo.automationtesting.in/Index.html";

	@BeforeEach
	void setUp() throws Exception {
		registerPage = new RegisterPage();
		this.registerPage.visit(URL);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws InterruptedException {
		this.registerPage.insertEmail();
//		if(this.registerPage.getCurrentUrl().equals("https://demo.automationtesting.in/Register.html")) {
//			this.registerPage.registerPage();
//			
//		}
		
		this.registerPage.registerPage();
		Assertions.assertEquals("https://demo.automationtesting.in/Register.html", this.registerPage.getCurrentUrl());
		
	}
	

}
