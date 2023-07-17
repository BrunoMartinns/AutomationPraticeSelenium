package dev.bruno.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	//Locators
	private By emailAndressLocator = By.id("user-name");
	private By passowordLocator = By.id("password");
	private By submitBtnLocator = By.id("login-button");
	private By tagSwagLabs = By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div");
	
	public void signin() {
		if(super.isDisplayed(emailAndressLocator)) {
			super.type("standard_user", emailAndressLocator);
			super.type("secret_sauce", passowordLocator);
			super.click(submitBtnLocator);
		} else {
			System.out.println("email não cadastrado!");
		}
	}
	
	public String getMyAccountMessage() {
		return super.getText(tagSwagLabs);
	}

}
