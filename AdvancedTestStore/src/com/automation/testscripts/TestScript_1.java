package com.automation.testscripts;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.generic.Base_Class;
import com.automation.generic.Utility_Methods;
import com.automation.pageobject.AccountDetails;
import com.automation.pageobject.ProductDetails;

import com.automation.pageobject.ShoppingCart;
import com.aventstack.extentreports.Status;

@Listeners(com.automation.generic.ListenerClass.class)

public class TestScript_1 extends Base_Class
{
	@Test
	public void script() throws InterruptedException
	{
		
		SoftAssert sftAssrt= new SoftAssert();
		// Verifying Welcome Page with Account Details -> Clicking on SkinCare-> Eyes 
		AccountDetails act=new AccountDetails(driver);
		String Expected_name="Anupama";
		String Actual_name=act.myaccount().getText();
		System.out.println(Actual_name);
		System.out.println("********");
		sftAssrt.assertEquals(Actual_name, Expected_name);
		//Assert.assertEquals(, false);
		test.log(Status.INFO, "Account Name verified");
		Utility_Methods.ActionsClass(driver).moveToElement(act.skincare()).perform();
		Utility_Methods.ExplicitWait(driver).until(ExpectedConditions.visibilityOf(act.eyes()));
		act.eyes().click();
		// On Product list Page, clicking on product to see details, then clicking on Add to Cart	
		ProductDetails pDetails= new ProductDetails(driver);
		Utility_Methods.ExplicitWait(driver).until(ExpectedConditions.visibilityOf(pDetails.absoluteeye()));
		String sExpectedProductName=pDetails.absoluteeye().getText();
		pDetails.absoluteeye().click();
		Utility_Methods.ExplicitWait(driver).until(ExpectedConditions.visibilityOf(pDetails.absoluteprice()));
		String sExpectedProductPrice=pDetails.absoluteprice().getText();
		pDetails.absoluteaddtocart().click();
		Thread.sleep(10000);	
		// On Cart page, clicking on Checkout Page to continue, verifying the details in Payments Page
		ShoppingCart sCart= new ShoppingCart(driver);
		Utility_Methods.ExplicitWait(driver).until(ExpectedConditions.visibilityOf(sCart.checkout()));
		sCart.checkout().click();
		Thread.sleep(6000);
		Utility_Methods.ExplicitWait(driver).until(ExpectedConditions.visibilityOf(sCart.absolutetext()));
		String sActualProductName=sCart.absolutetext().getText();
		sftAssrt.assertEquals(sExpectedProductName, sActualProductName);
		test.log(Status.INFO, "Product Name verified");
		String sActualProductPrice=sCart.subtotal().getText();
		sftAssrt.assertEquals(sExpectedProductPrice,sActualProductPrice);
		test.log(Status.INFO, "Product Price verified");
		Utility_Methods.JavaScript_Scroll(driver)
        .executeScript("window.scrollBy(0,400)");
		sCart.confirmorder().click();
		String sExpectedMessage=" Your Order Has Been Processed!";
		String sActualMessage=sCart.orderplaced().getText();
		sftAssrt.assertEquals(sExpectedMessage,sActualMessage);
		test.log(Status.INFO, "order placed");
		sftAssrt.assertAll();
		
	}
}