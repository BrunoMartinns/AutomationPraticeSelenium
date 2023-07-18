package dev.bruno.automation.pratice.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import dev.bruno.automation.pratice.selenium.pages.RegisterPageAutomationExercise;

class RegisterPageAutomationExerciseTest {
	private RegisterPageAutomationExercise registerPageAutomationExercise; 
	private final String URL= "https://automationexercise.com/";
	private By messageCongratulationsLocation = By.xpath("//*[@id=\"form\"]/div/div/div/p[1]");


	@BeforeEach
	void setUp() throws Exception {
		this.registerPageAutomationExercise = new RegisterPageAutomationExercise();
		registerPageAutomationExercise.visit(URL);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		this.registerPageAutomationExercise.registerPage();
		Assertions.assertTrue(this.registerPageAutomationExercise.getText(messageCongratulationsLocation).equals("Congratulations! Your new account has been successfully created!"));
		//String expected = "martins@gmail.com";
		//Assertions.assertEquals(expected, this.registerPageAutomationExercise.getEmailNewAccount());
	}

}
