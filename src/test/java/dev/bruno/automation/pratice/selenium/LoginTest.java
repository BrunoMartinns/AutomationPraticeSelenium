package dev.bruno.automation.pratice.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;

class LoginTest {
	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		WebElement emailAddressLocator = driver.findElement(By.id("user-name"));
		emailAddressLocator.sendKeys("standard_user");
		
		WebElement passwordAddressLocator = driver.findElement(By.id("password"));
		passwordAddressLocator.sendKeys("secret_sauce");
		
		WebElement submitBtnElement = driver.findElement(By.id("login-button"));
		submitBtnElement.click();
		
		WebElement tagSwagLabs = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));
		Assertions.assertTrue(tagSwagLabs.getText().equals("Swag Labs"));
	}

}
