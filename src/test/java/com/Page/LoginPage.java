package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//locators
	
	private By email=By.id("email-id");
	private By pwd=By.id("password");
	private By chkBx=By.id("remember");
	private By sbmt=By.id("submit-id");

	
	//method
	public String doLogin(String em,String ps)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(pwd).sendKeys(ps);
		driver.findElement(chkBx).click();
		driver.findElement(sbmt).click();
		return driver.getCurrentUrl();
	}
}
	
