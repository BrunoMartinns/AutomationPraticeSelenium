package dev.bruno.automation.pratice.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import automationExercise.LoginPageAutomationExercise;


class LoginPageAutomationExerciseTest {
	
	private LoginPageAutomationExercise loginPageAutomationExercise; 
	private final String URL= "https://automationexercise.com/";
	private By messageLocation = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");

	@BeforeEach
	void setUp() throws Exception {
		loginPageAutomationExercise = new LoginPageAutomationExercise();
		this.loginPageAutomationExercise.visit(URL);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		this.loginPageAutomationExercise.login();

		Assertions.assertTrue(this.loginPageAutomationExercise.getText(messageLocation).equals("Logged in as bruno martins"));
		
	}

}
