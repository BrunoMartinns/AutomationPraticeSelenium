package dev.bruno.automation.pratice.selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {

	private WebDriver driver;
	
	@Test
    public void helloSelenium() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		
		String currentUrl = driver.getCurrentUrl();
		
		String expected = "https://phptravels.com/demo/";
		
		Assertions.assertEquals(expected, currentUrl);
		driver.quit();
    }
	
	
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

}
