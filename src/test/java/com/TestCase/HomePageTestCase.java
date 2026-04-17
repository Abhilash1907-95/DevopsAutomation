package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestCase extends BaseTest{
	
	
	
  @Test(priority=1)
  public void verifyUrl() {
	  
	  String actUrl=hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test Fail: Url not matched!");
	  System.out.println("Test Pass: URL Matched!");
  }
  
  @Test(priority=2)
  
  public void verifyTitle() {
	  String actTitle=hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer"),"Test Fail: Title is not matched!");
	  System.out.println("Test pass: Title matched");
  }
  
  @Test(priority=3)
  
  public void validateSignInLink() {
	  
	  String nextPageUrl=hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"),"TestFail: LoginPage is not open");
	  System.out.println("TestPass: Application navigated to login page");
  }
}
