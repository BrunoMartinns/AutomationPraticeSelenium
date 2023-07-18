package dev.bruno.automation.pratice.selenium.pages;

import java.time.Duration;

import org.openqa.selenium.By;

public class RegisterPageAutomationExercise extends BasePage{
	
	//Location Register
	private By signupLoginLocation = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");	
	private By nameRegisterLocation = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
	private By emailAddressLocation = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	private By signupBtnLocation = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	private By genderMrLocation = By.id("id_gender1");
	private By genderMsLocation = By.id("uniform-id_gender2");
	private By emailLocation = By.id("email");
	private By passwordLocation = By.id("password");
	private By daysLocation = By.id("days");
	private By monthsLocation = By.xpath("//*[@id=\"months\"]");
	private By yearsLocation = By.id("years");
	private By newsletterLocation = By.id("newsletter");
	private By optinLocation = By.id("optin");
	private By firstNameLocation = By.id("first_name");
	private By lastNameLocation = By.id("last_name");
	private By companyLocation = By.id("company");
	private By addressOneLocation = By.id("address1");
	private By addressTwoLocation = By.id("address2");
	private By countryLocation = By.id("country");
	private By stateLocation = By.id("state");
	private By cityLocation = By.id("city");
	private By zipcodeLocation = By.id("zipcode");
	private By mobileNumberLocation = By.id("mobile_number");
	private By createAccountLocation = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
	private By messageLocation = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/p[4]/label/span");
	
	
	public void registerPage() {
		click(signupLoginLocation);
		type("bruno martins", nameRegisterLocation);
		type("martins@gmail.com", emailAddressLocation);
		click(signupBtnLocation);
		click(genderMrLocation);
		type("123456789", passwordLocation);
		selectByValue(daysLocation, "10");
		selectByValue(monthsLocation, "3");
		selectByValue(yearsLocation, "1997");
		click(newsletterLocation);
		click(optinLocation);
		type("bruno", firstNameLocation);
		type("martins", lastNameLocation);
		type("BMCompany", companyLocation);
		type("rua 1 2 3 de março 104", addressOneLocation);
		type("rua 4 5 6 de março 204", addressTwoLocation);
		selectByValue(countryLocation, "Canada");
		type("Quebec", stateLocation);
		type("Quebec", cityLocation);
		type("35333325", zipcodeLocation);
		type("999999999", mobileNumberLocation);
		click(createAccountLocation);
		
		
	}
	
	public String getEmailNewAccount() {
		super.waitVisibilityOfElementLocated(messageLocation, Duration.ofSeconds(10));
		return super.getTextByAttribute(this.emailLocation, "value");
	}

}
