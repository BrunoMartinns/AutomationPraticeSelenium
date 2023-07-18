package dev.bruno.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPageAutomationExercise extends BasePage {
	
	//Location
	private By signupLoginLocation = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	private By emailLoginLocation = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
	private By passwordLocation = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
	private By loginBtnLocation = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	
	
	public void login() {
		click(signupLoginLocation);
		type("martins@gmail.com", emailLoginLocation);
		type("123456789", passwordLocation);
		click(loginBtnLocation);
	}
	

}
