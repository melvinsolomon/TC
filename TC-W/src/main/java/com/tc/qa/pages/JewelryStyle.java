package com.tc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tc.qa.base.TestBase;

public class JewelryStyle extends TestBase{
	
	//Page Factory - OR - Object Repository
	
	/***
	 * Images
	 */
	@FindBy(xpath="//*[@id=\'react-root\']/div/div[1]/div[2]/div[2]/label[1]/div/input")
	WebElement likeGold;

	@FindBy(xpath="//*[@id=\'react-root\']/div/div[1]/div[2]/button[1]")
	WebElement continueWithSelection;
	
	/***
	 * Initialize elements in Page Factory
	 */
	public JewelryStyle(){
	    PageFactory.initElements(driver, this);
	}



	/**
	 * Fetch the WebElements from the page
	 * @return WebElement
	 */
	
	public WebElement getLikeGold()
	{
		return likeGold;
	}
	
	public WebElement getContinueWithSelection()
	{
		return continueWithSelection;
	}
}
