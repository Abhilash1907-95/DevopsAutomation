package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By Id=By.id("SignIn");
	
	public String getAppUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle() {
		return driver.getTitle();
	}

	public String getStatusOfLink() {
		return driver.getCurrentUrl();
	}
	
	public void clickSignIn() {
		driver.findElement(By.id("SignIn")).click();
	}
}
