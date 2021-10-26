package com.guru99.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99.qa.base.TestBase;
import com.guru99.qa.pages.HomePage;
import com.guru99.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setup() throws IOException {
		intialization();
		loginpage = new LoginPage();
	}
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Guru99 Bank Home Page", "title not matched");
	 }
	@Test(priority=2)
	public void logoimagetest() {
		boolean flag = loginpage.vallidateLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest() throws IOException {
		homepage = loginpage.login();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
