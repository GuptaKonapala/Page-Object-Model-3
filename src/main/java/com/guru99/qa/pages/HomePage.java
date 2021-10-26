package com.guru99.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	WebElement selenium;
	
	@FindBy(xpath="//a[contains(text(), 'Flash Movie Demo')]")
	WebElement flashmoviedemo;
	
	@FindBy(xpath="//a[contains(text(), 'Insurance Project')]")
	WebElement insuranceproject;
	
	@FindBy(xpath="//a[contains(text(), 'New Customer')]")
	WebElement newcustomer;
	
	@FindBy(xpath="//a[contains(text(), 'Demo Site')]")
	WebElement label;

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public void clickOnSelenium() throws InterruptedException {
		selenium.click();
		Thread.sleep(1000);
		flashmoviedemo.click();
	}
	public void clickOnInsuranceProject() {
		insuranceproject.click();
	}
	public NewCustomerPage clickOnNewCustomer() throws IOException {
		newcustomer.click();
		return new NewCustomerPage();
	}
	public boolean verifyLabel() {
		return label.isDisplayed();
	}

}
