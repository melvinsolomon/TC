package com.tc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tc.qa.base.TestBase;

public class HeightWeight extends TestBase{
	
	//Page Factory - OR - Object Repository
	
	/***
	 * Images
	 */
	@FindBy(xpath="//*[@id=\'react-root\']/div/div[1]/div[2]/form/fieldset[1]/div/input")
	WebElement height;

	@FindBy(xpath="//*[@id=\'react-root\']/div/div[1]/div[2]/form/fieldset[2]/div/input")
	WebElement weight;

	@FindBy(xpath="//*[@id=\'react-root\']/div/div[1]/div[2]/form/div/button/span")
	WebElement continueOption;	
	
	
	/***
	 * Initialize elements in Page Factory
	 */
	public HeightWeight(){
	    PageFactory.initElements(driver, this);
	}



	/**
	 * Fetch the WebElements from the page
	 * @return WebElement
	 */
	
	public WebElement getHeight()
	{
		return height;
	}
	
	public WebElement getWeight()
	{
		return weight;
	}
	
	public WebElement getContinueOption()
	{
		return continueOption;
	}
	
}
