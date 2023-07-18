package automationExercise;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.By;

import dev.bruno.automation.pratice.selenium.pages.BasePage;

public class PurchaseSimulateAutomationExercise extends BasePage {
	
	//Location Login
	private By signupLoginLocation = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	private By emailLoginLocation = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
	private By passwordLocation = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
	private By loginBtnLocation = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	//Location Buy
	private By firstProductLocation = By.xpath("/html/body/section/div/div[2]/div[2]/div/div[3]/div/div[1]");
	private By btnBuyFirstProductLocation = By.xpath("/html/body/section/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div/a");
	private By menBtnLocation = By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a");
	private By tshirtsBtnLocation = By.xpath("//*[@id=\"Men\"]/div/ul/li[1]/a");
	private By jeansBtnLocation = By.xpath("//*[@id=\"Men\"]/div/ul/li[2]/a");
	private By secondProductLocation = By.xpath("/html/body/section/div/div[2]/div[2]/div/div[4]/div/div[1]/div[1]");
	private By btnBuySecondProductLocation = By.xpath("/html/body/section/div/div[2]/div[2]/div/div[4]/div/div[1]/div[2]/div/a");
	private By thirdProductLocation = By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]");
	private By btnBuyThridProductLocation = By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/a");
	private By continueBuyLocation = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
	private By cartBtnLocation = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
	private By proceedToCheckoutBtnLocation = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");
	private By placerOrderBtnLocation = By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a");
	private By nameCardLocation = By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input");
	private By cardNumberLocation = By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input");
	private By cvcLocation = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input");
	private By expirationLocation = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input");
	private By expirationYearsLocation = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input");
	private By confirmOrderLocation = By.id("submit");
	
	
	
	private By spanBtnLocation = By.xpath("//*[@id=\"dismiss-button\"]");
	private By cardSpanLocation = By.id("card");
	private By spanTwoBtnLocation = By.xpath("//*[@id=\"dismiss-button\"]/div/svg/path[1]");
	
	public void login() {
		click(signupLoginLocation);
		type("martins@gmail.com", emailLoginLocation);
		type("123456789", passwordLocation);
		click(loginBtnLocation);
	}
	
	public void buyProducts() throws InterruptedException {
		login();
		click(menBtnLocation);
		super.actionClickElementPerform(tshirtsBtnLocation);
		if(isDisplayed(spanBtnLocation)) {
			click(spanBtnLocation);
		} else if (isDisplayed(cardSpanLocation)) {
			click(spanTwoBtnLocation);
		}
		super.actionMoveToElementPerform(firstProductLocation);
		Thread.sleep(1000);
		super.actionClickElementPerform(btnBuyFirstProductLocation);
		Thread.sleep(1000);
		super.click(continueBuyLocation);
		super.actionMoveToElementPerform(secondProductLocation);
		Thread.sleep(1000);
		super.actionClickElementPerform(btnBuySecondProductLocation);
		Thread.sleep(1000);
		super.click(continueBuyLocation);
		click(menBtnLocation);
		super.actionClickElementPerform(jeansBtnLocation);
		super.actionMoveToElementPerform(thirdProductLocation);
		Thread.sleep(1000);
		super.actionClickElementPerform(btnBuyThridProductLocation);
		Thread.sleep(1000);
		super.click(continueBuyLocation);
		super.click(cartBtnLocation);
		super.click(proceedToCheckoutBtnLocation);
		super.click(placerOrderBtnLocation);
		type("bruno bruno bruno", nameCardLocation);
		type("1111 2222 3333 4444 55", cardNumberLocation);
		type("311", cvcLocation);
		type("03", expirationLocation);
		type("2030", expirationYearsLocation);
		super.click(confirmOrderLocation);
	}
	
	
}
