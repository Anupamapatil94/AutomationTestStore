package com.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	@FindBy(xpath="//a[text()='Login or register']")
	private WebElement login_link;

	@FindBy(xpath="//button[@title='Continue']")
	private WebElement continue_btn;
	
	@FindBy(id="AccountFrm_firstname")
	private WebElement first_name;

	@FindBy(id="AccountFrm_lastname")
	private WebElement last_name;

	@FindBy(id="AccountFrm_email")
	private WebElement email_text;

	@FindBy(id="AccountFrm_address_1")
	private WebElement address_text;

	@FindBy(id="AccountFrm_city")
	private WebElement city_text;

	@FindBy(id="AccountFrm_zone_id")
	private WebElement state_id;

	@FindBy(id="AccountFrm_postcode")
	private WebElement zip_code;

	@FindBy(id="AccountFrm_country_id")
	private WebElement country_id;
	
	@FindBy(id="AccountFrm_loginname")
	private WebElement login_name;
	
	@FindBy(id="AccountFrm_password")
	private WebElement pass_text;

	@FindBy(id="AccountFrm_confirm")
	private WebElement pass_confirm;
	
	@FindBy(id="AccountFrm_agree")
	private WebElement agree_cbox;
	
	@FindBy(xpath="//button[@class='btn btn-orange pull-right lock-on-click']")
	private WebElement login_btn;
	
	@FindBy(xpath="//input[@id='loginFrm_loginname']")
	private WebElement user_name;
	@FindBy(xpath="//input[@id='loginFrm_password']")
	private WebElement user_pswd;
	@FindBy(xpath="//button[@title='Login']")
	private WebElement user_login;
	@FindBy(xpath="//span[text()='Account'][1]")
	private WebElement user_account;
	
	@FindBy(xpath="//span[text()='Logout'][1]")
	private WebElement user_logout;
	
	
	
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement loginlink()
	{
		return login_link;
	}
	public WebElement continuebutton()
	{
		return continue_btn;
	}

	public WebElement firstname()
	{
		return first_name;
	}

	public WebElement lastname()
	{
		return last_name;
	}


	public WebElement email_add()
	{
		return email_text;
	}

	public WebElement address()
	{
		return address_text;
	}

	public WebElement city()
	{
		return city_text;
	}

	public WebElement state()
	{
		return state_id;
	}
	public WebElement zipcode()
	{
		return zip_code;
	}
	
	public WebElement country()
	{
		return country_id;
	}

	public WebElement loginname()
	{
		return login_name;
	}

	public WebElement password()
	{
		return pass_text;
	}

	public WebElement passwordconfirm()
	{
		return pass_confirm;
	}
	
	public WebElement agree_check()
	{
		return agree_cbox;
	}
	
	public WebElement username()
	{
		return user_name;
	}
	public WebElement userpswd()
	{
		return user_pswd;
	}
	public WebElement login_button()
	{
		return login_btn;
	}
	public WebElement login()
	{
		return user_login;
	
	}
	public WebElement useracct()
	{
		return user_account;
	}
	
	public WebElement actlogout()
	{
		return user_logout;
	}
	
	
	
}
