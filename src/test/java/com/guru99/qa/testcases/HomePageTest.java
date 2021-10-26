package com.guru99.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99.qa.base.TestBase;
import com.guru99.qa.pages.HomePage;
import com.guru99.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;

	public HomePageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setup() throws IOException {
		intialization();
		loginpage = new LoginPage();
		homepage = loginpage.login();
	}
	@Test
	public void verifyHomePageTitleTest() {
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Guru99 Bank Manager HomePage", "home page title not matched");
	}
	@Test
	public void verifyHomePageLabelTest() {
		boolean label = homepage.verifyLabel();
		Assert.assertTrue(label);
	}
	@Test
	public void verifyFlashMovieDemoTest() throws InterruptedException {
		homepage.clickOnSelenium();
		Assert.assertEquals(driver.getTitle(), "Flash Movie Demo");
	}
	@Test
	public void verifyInsuranceProjectTest() {
		homepage.clickOnInsuranceProject();
		Assert.assertEquals(driver.getTitle(),"Insurance Broker System - Login");
	}
	@Test
	public void newCustomerPageTest() throws IOException {
		homepage.clickOnNewCustomer();
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank New Customer Entry Page");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
