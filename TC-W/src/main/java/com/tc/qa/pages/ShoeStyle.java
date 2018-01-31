package com.tc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tc.qa.base.TestBase;

public class ShoeStyle extends TestBase{
	
	//Page Factory - OR - Object Repository
	
	/***
	 * Images
	 */
	@FindBy(xpath="//*[@id=\'react-root\']/div/div[1]/div[2]/div[2]/label[2]/div/input")
	WebElement shoeStyle;

	@FindBy(xpath="//*[@id=\'react-root\']/div/div[1]/div[2]/button[2]")
	WebElement dontKnow;

	/***
	 * Initialize elements in Page Factory
	 */
	public ShoeStyle(){
	    PageFactory.initElements(driver, this);
	}



	/**
	 * Fetch the WebElements from the page
	 * @return WebElement
	 */
	
	public WebElement getShoeStyle()
	{
		return shoeStyle;
	}
	
	public WebElement getDontKnow()
	{
		return dontKnow;
	}
}
