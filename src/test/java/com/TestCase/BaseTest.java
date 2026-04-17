package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Page.HomePage;
import com.Page.LoginPage;

public class BaseTest {
	
	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		hp=new HomePage(driver);
		hp.clickSignIn();
		
		lp=new LoginPage(driver);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}

}
