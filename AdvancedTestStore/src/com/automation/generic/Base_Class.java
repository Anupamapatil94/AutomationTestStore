package com.automation.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automation.pageobject.Login_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_Class implements Framework_Constants 
{
	public ExtentHtmlReporter reporter;
	public ExtentReports report;
	public ExtentTest test;
	public static WebDriver driver;
	public Login_Page login_page;
	
	
	
	@BeforeTest
	public void reports()
	{
		reporter=new ExtentHtmlReporter(ExtentPath);
		report=new ExtentReports();
		report.attachReporter(reporter);
		test = report.createTest("Extent Test");
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		driver.get(ReadDataFromProperty.getProperty("url"));
		login_page=new Login_Page(driver);
		login_page.loginlink().click();
//		login_page.continuebutton().click();
//		login_page.firstname().sendKeys(ReadDataFromProperty.getProperty("fname"));
//		login_page.lastname().sendKeys(ReadDataFromProperty.getProperty("lname"));
//		login_page.email_add().sendKeys(ReadDataFromProperty.getProperty("email"));
//		login_page.address().sendKeys(ReadDataFromProperty.getProperty("address1"));
//		login_page.city().sendKeys(ReadDataFromProperty.getProperty("cityname"));
//		Utility_Methods.select_dropdown(login_page.country()).selectByVisibleText("India");
//		Utility_Methods.select_dropdown(login_page.state()).selectByVisibleText("Karnataka");
//		login_page.zipcode().sendKeys(ReadDataFromProperty.getProperty("postcode"));
//		login_page.loginname().sendKeys(ReadDataFromProperty.getProperty("username"));
//		login_page.password().sendKeys(ReadDataFromProperty.getProperty("newpassword"));
//		login_page.passwordconfirm().sendKeys(ReadDataFromProperty.getProperty("newpassword"));
//		login_page.agree_check().click();
//		login_page.login_button().click();
//		Utility_Methods.ActionsClass(driver).moveToElement(login_page.useracct()).perform();
//		Utility_Methods.ExplicitWait(driver).until(ExpectedConditions.visibilityOf(login_page.actlogout()));
//		login_page.actlogout().click();
//		Thread.sleep(3000);
//		login_page.loginlink().click();
		Utility_Methods.ExplicitWait(driver).until(ExpectedConditions.visibilityOf(login_page.username()));	
		Thread.sleep(2000);
		login_page.username().sendKeys(ReadDataFromProperty.getProperty("uname"));
		login_page.userpswd().sendKeys(ReadDataFromProperty.getProperty("newpassword"));
		login_page.login().click();
		
		

	}
	
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
	}
	
	@AfterTest
	public void stopReporting()
	{
		report.flush();
	}
}
