package dev.bruno.automation.pratice.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import dev.bruno.automation.pratice.selenium.pages.LoginPageAutomationExercise;
import dev.bruno.automation.pratice.selenium.pages.PurchaseSimulateAutomationExercise;
import net.bytebuddy.asm.Advice.This;

class PurchaseSimulateAutomationExerciseTest {
	
	private PurchaseSimulateAutomationExercise purchaseSimulateAutomationExercise; 
	private final String URL= "https://automationexercise.com/";
	private By messageLocation = By.xpath("//*[@id=\"form\"]/div/div/div/h2");

	@BeforeEach
	void setUp() throws Exception {
		purchaseSimulateAutomationExercise = new PurchaseSimulateAutomationExercise();
		this.purchaseSimulateAutomationExercise.visit(URL);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws InterruptedException {
		this.purchaseSimulateAutomationExercise.buyProducts();
		String expected = this.purchaseSimulateAutomationExercise.getText(messageLocation);
		Assertions.assertEquals("ORDER PLACED!", this.purchaseSimulateAutomationExercise.getText(messageLocation));

	}

}
