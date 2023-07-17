package dev.bruno.automation.pratice.selenium.tests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.bruno.automation.pratice.selenium.pages.LoginPage;

class LoginPageTest {
	
	private LoginPage loginPage;
	private final String URL= "https://www.saucedemo.com/";

	@BeforeEach
	void setUp() throws Exception {
		this.loginPage = new LoginPage();
		this.loginPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		//this.loginPage.quitWebDriver();
	}

	@Test
	void test() {
		this.loginPage.signin();
		Assertions.assertTrue(this.loginPage.getMyAccountMessage().equals("Swag Labs"));
		Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
	}

}
