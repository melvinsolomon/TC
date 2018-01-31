package com.tc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tc.qa.base.TestBase;

public class DoYouLikeThisStyle extends TestBase{
	
	//Page Factory - OR - Object Repository
	
	/***
	 * Images
	 */
	@FindBy(xpath="//*[@id=\'react-root\']/div/div[1]/div[2]/div[2]/div/button[1]")
	WebElement likeThis;

	@FindBy(xpath="//*[@id=\'react-root\']/div/div[1]/div[2]/div[2]/div/button[2]")
	WebElement dontLikeThis;
	
	
	/***
	 * Initialize elements in Page Factory
	 */
	public DoYouLikeThisStyle(){
	    PageFactory.initElements(driver, this);
	}



	/**
	 * Fetch the WebElements from the page
	 * @return WebElement
	 */
	
	public WebElement getLikeThis()
	{
		return likeThis;
	}
	
	public WebElement getDontLikeThis()
	{
		return dontLikeThis;
	}
}
