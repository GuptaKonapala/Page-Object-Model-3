package com.guru99.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class NewCustomerPage extends TestBase {
	
	@FindBy(linkText="Home")
	WebElement homeButton;
	
	public NewCustomerPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

}
