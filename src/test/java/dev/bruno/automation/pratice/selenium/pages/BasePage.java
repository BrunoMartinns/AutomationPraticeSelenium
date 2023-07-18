package dev.bruno.automation.pratice.selenium.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
	
	private WebDriver driver;
	private Actions actions;
	private WebDriverWait wait;
	private Select select;
	
	public BasePage() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
	public void visit(String url) {
		this.driver.get(url);
	}
	
	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}
	
	public void quitWebDriver() {
		this.driver.quit();
	}
	
	public WebElement findElement(By locator) {
		return this.driver.findElement(locator);
	}
	
	public void type(String input, By locator) {
		this.driver.findElement(locator).sendKeys(input);
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return this.driver.findElement(locator).isDisplayed();
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public void click(By locator) {
		this.driver.findElement(locator).click();
	}
	
	public String getText(By locator) {
		return this.driver.findElement(locator).getText();
	}
	
	public void actionMoveToElementPerform(By locator) {
		if(this.actions == null) {
			this.actions = new Actions(this.driver);
		}
		
		WebElement element = this.driver.findElement(locator);
		actions.moveToElement(element).perform();
	}
	
	public void actionClickElementPerform(By locator) {
		if(this.actions == null) {
			this.actions = new Actions(this.driver);
		}
		
		WebElement element = this.driver.findElement(locator);
		actions.moveToElement(element).click().build().perform();
	}
	
	public WebElement waitVisibilityOfElementLocated(By locator, Duration time) {
		wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void selectByValue(By locator, String value) {
		select = new Select(findElement(locator));
		select.selectByValue(value);
	}
	
	public void optionsSelectLinguagem(String value) {
		this.driver.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//a[text()='"+value+"']")).click();
	}
	
	public String getTextByAttribute(By locator, String atributeName) {
		return this.driver.findElement(locator).getAttribute(atributeName);
	}
	
	private Boolean isContainedInPageSource(String message) {
		return this.driver.getPageSource().contains(message);
	}
	

}
