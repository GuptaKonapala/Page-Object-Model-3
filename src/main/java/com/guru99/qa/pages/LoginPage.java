package com.guru99.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - Object Repository(OR)
	@FindBy(name = "uid")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "btnLogin")
	WebElement login;
	
	@FindBy(linkText = "here")
	WebElement signup;
	
	@FindBy(xpath = "//img[@src='/logo.png']")
	WebElement logo;

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean vallidateLogo() {
		return logo.isDisplayed();
	}
	public HomePage login() throws IOException {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
		return new HomePage();
	}

}
