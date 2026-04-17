package com.TestCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseTest {
	
	
  @Test
  public void validateLogin() {
	  
	  String url=lp.doLogin("test@gmail.com", "test123");
	  System.out.println("Current URL : "+ url);
	  Assert.assertTrue(url.contains("customers"),"Test Fail:Login Fail");
  }
  
  
}
