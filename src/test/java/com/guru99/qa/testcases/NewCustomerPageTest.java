package com.guru99.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.guru99.qa.base.TestBase;
import com.guru99.qa.pages.HomePage;
import com.guru99.qa.pages.LoginPage;

public class NewCustomerPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;

	public NewCustomerPageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setup() throws IOException {
		intialization();
		loginpage = new LoginPage();
		homepage = loginpage.login();
	}
}
