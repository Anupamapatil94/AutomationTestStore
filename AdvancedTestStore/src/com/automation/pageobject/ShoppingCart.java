package com.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	
	@FindBy(xpath="(//span[contains(text(),'Cart')])[1]")
	private WebElement cart_btn;
	@FindBy(xpath="(//a[@class='btn btn-orange pull-right'])[1]")
	private WebElement checkout_btn;
	@FindBy(xpath="(//table[@class='table table-striped table-bordered']/tbody[1]/tr[1]/td[2]/span")
	private WebElement subtotal;
	@FindBy(xpath="(//a[text()='Absolue Eye Precious Cells'])[2]")
	private WebElement absolute_text;
	@FindBy(xpath="(//button[@title='Confirm Order']")
	private WebElement confirm_order;
	@FindBy(xpath="(//span[@class='maintext']")
	private WebElement order_placed;
	
	public ShoppingCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement cart()
	{
		return cart_btn;
	}
	public WebElement checkout()
	{
		return checkout_btn;
	}
	public WebElement subtotal()
	{
		return subtotal;
	}
	public WebElement absolutetext()
	{
		return absolute_text;
	}
	public WebElement confirmorder()
	{
		return confirm_order;
	}
	public WebElement orderplaced()
	{
		return order_placed;
	}

}
