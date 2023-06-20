package com.automation.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails {
	
	@FindBy(xpath="//a[text()='Absolue Eye Precious Cells']")
	private WebElement absolute_eye;
	@FindBy(xpath="//div[@class='productfilneprice']")
	private WebElement absolute_price;
	@FindBy(xpath="//a[@class='cart']")
	private WebElement add_cart;
	public ProductDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement absoluteeye()
	{
		return absolute_eye;
	}
	public WebElement absoluteprice()
	{
		return absolute_price;
	}
	public WebElement absoluteaddtocart()
	{
		return add_cart;
	}
}
