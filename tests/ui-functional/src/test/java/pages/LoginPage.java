package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import test.java.framework.SeleniumUtils;

public class LoginPage extends OpenCartBasePage{
	
	public LoginPage(WebDriver driver){
		super(driver);
		//PageFactory.initElements(driver, this);
	}
	
	public void login(String email, String password){
		WebElement loginUser = SeleniumUtils.getWebElement(driver, By.xpath("//input[@name='email']"+ email +"//input[@name='password']"+ password), 30);
		loginUser.click();
	}
}
