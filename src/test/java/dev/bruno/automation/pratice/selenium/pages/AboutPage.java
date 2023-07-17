package dev.bruno.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class AboutPage extends BasePage {
	
	private By buttonLocator = By.cssSelector("#react-burger-menu-btn");
	private By abboutLocator = By.id("about_sidebar_link");
	private By textPageLocator = By.cssSelector("#__next > div.MuiBox-root.css-14ifkx6 > div.MuiContainer-root.MuiContainer-maxWidthLg.css-sv9kmg > div > div.css-jengxu > div.css-lu2zz1 > div > div.MuiBox-root.css-4q1zgn > p");
	
	private By emailAndressLocator = By.id("user-name");
	private By passowordLocator = By.id("password");
	private By submitBtnLocator = By.id("login-button");
	
	public void viewAboutPage() {
		
		super.type("standard_user", emailAndressLocator);
		super.type("secret_sauce", passowordLocator);
		super.click(submitBtnLocator);
		
		if(super.isDisplayed(buttonLocator)) {
			super.click(buttonLocator);
			super.actionClickElementPerform(abboutLocator);
			
		} else {
			System.out.println("Button não encontrado");
		}
	}
	
	public String getUrl() {
		return super.getCurrentUrl();
	}
	
	public String getTextPage() {
		return super.getText(textPageLocator);
	}

}
