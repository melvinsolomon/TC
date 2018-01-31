package com.tc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tc.qa.base.TestBase;

public class Stores extends TestBase{
	
	//Page Factory - OR - Object Repository
	
	/***
	 * Images
	 */
	@FindBy(xpath="//*[@id=\"react-root\"]/div/div[1]/div[2]/button[2]")
	WebElement noneOfThese;


	/***
	 * Initialize elements in Page Factory
	 */
	public Stores(){
	    PageFactory.initElements(driver, this);
	}



	/**
	 * Fetch the WebElements from the page
	 * @return WebElement
	 */
	
	public WebElement getNoneOfThese()
	{
		return noneOfThese;
	}
	
}
