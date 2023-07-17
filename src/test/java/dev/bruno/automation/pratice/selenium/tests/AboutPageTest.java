package dev.bruno.automation.pratice.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.bruno.automation.pratice.selenium.pages.AboutPage;

class AboutPageTest {
	private AboutPage aboutPage;

	@BeforeEach
	void setUp() throws Exception {
		this.aboutPage = new AboutPage();
		this.aboutPage.visit("https://www.saucedemo.com/inventory.html");
	}

	@AfterEach
	void tearDown() throws Exception {
		//this.aboutPage.quitWebDriver();
	}

	@Test
	void test() {
		this.aboutPage.viewAboutPage();
		Assertions.assertTrue(aboutPage.getCurrentUrl().equals("https://saucelabs.com/"));
		Assertions.assertEquals("The world relies on your code. Test on thousands of device, browser, and OS configurations – anywhere, any time.",this.aboutPage.getTextPage());
	}

}
