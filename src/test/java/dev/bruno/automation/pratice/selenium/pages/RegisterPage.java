package dev.bruno.automation.pratice.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {
	
	private By emailRegisterLocation = By.id("email");
	private By emailBtnLocation = By.xpath("//*[@id=\"main\"]/div[2]/span/a");
	private By firstNameLocation = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	private By lastNameLocation = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	private By emailLocation = By.id("email");
	private By addressLocation = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
	private By emailAnddressLocation = By.cssSelector("#eid > input");
	private By phoneLocation = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
	private By genderMaleLocation = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	private By genderFemaleLocation = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input");
	private By hobbiesCricketLocation = By.id("checkbox1");
	private By hobbiesMoviesLocation = By.id("checkbox2");
	private By hobbiesHockeyLocation = By.id("checkbox3");
	private By languagesLocation = By.xpath("//*[@id=\"msdd\"]");
	private By selectLanguagensLocation = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul");
	private By skillLocation = By.id("Skills");
	private By countryLocation = By.id("countries");
	private By selectCountryLocation = By.id("country");
	private By dateBirthYearLocation = By.id("yearbox");
	private By dateBirthMonthLocation = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
	private By dateBirthDayLocation = By.id("daybox");
	private By passwordLocation = By.id("firstpassword");
	private By confirmPasswordLocation = By.id("secondpassword");
	private By submitBtnLocation = By.id("submitbtn");
	private By refreshBtnLocation = By.id("Button1");
	private By bodyLocation = By.tagName("body");
	
	
	
	public void insertEmail() throws InterruptedException {
		//Thread.sleep(5000);
		if(super.isDisplayed(emailRegisterLocation)) {
			type("aaaaaaaaaaa@gmail.com", emailRegisterLocation);
			click(emailBtnLocation);
		} else {
			System.out.println("Não encontrado esse location!");
		}
		
	}
	
	public void registerPage() {
		if(super.isDisplayed(firstNameLocation)) {
			type("bruno", firstNameLocation);
			type("martins", lastNameLocation);
			type("rua um dois tres de março 105", addressLocation);
			type("aaaaaaaaaaa@gmail.com", emailAnddressLocation);
			type("9999999999", phoneLocation);
			click(genderMaleLocation);
			click(hobbiesMoviesLocation);
		
			actionClickElementPerform(languagesLocation);
			optionsSelectLinguagem("Finnish");
			optionsSelectLinguagem("English");
			optionsSelectLinguagem("Portuguese");
			actionClickElementPerform(bodyLocation);
			
			selectByValue(skillLocation, "Java");
			selectByValue(selectCountryLocation, "Japan");
			selectByValue(dateBirthYearLocation, "1997");
			selectByValue(dateBirthMonthLocation, "March");
			selectByValue(dateBirthDayLocation, "10");
			type("qqqqqqqqqqq", passwordLocation);
			type("qqqqqqqqqqq", confirmPasswordLocation);
			click(submitBtnLocation);
			click(refreshBtnLocation);
			
		} else {
			System.out.println("Location não encontrado na URL:" + super.getCurrentUrl());
		}
		
	}
	

}
