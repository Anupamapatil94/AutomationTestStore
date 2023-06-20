package com.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AccountDetails {
	@FindBy(xpath="//span[@class='subtext']")
	private WebElement my_account;
	
	@FindBy(xpath="(//a[contains(.,'Skincare')])[2]")
	private WebElement skin_care;
	
	@FindBy(xpath="(//a[contains(.,'Eyes')])[1]")
	private WebElement eye_products;
	
	
	public AccountDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement myaccount()
	{
		return my_account ;
	}
	public WebElement skincare()
	{
		return skin_care ;
	}
	public WebElement eyes()
	{
		return eye_products ;
	}
	

}
