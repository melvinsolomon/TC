package com.tc.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tc.qa.base.TestBase;

public class TrunkClubWomen extends TestBase{
	
	//Page Factory - OR - Object Repository
	
	/*******************
	 * Images
	 */
	@FindBy(xpath="//*[@id='intro']/div[2]/img")
	WebElement firstImage;   //Missing

	@FindBy(xpath="//*[@id=\'how-it-works\']/div/div[2]/ol/li[1]/div/img")
	WebElement howItWorksImage1;

	@FindBy(xpath="//*[@id=\'how-it-works\']/div/div[2]/ol/li[2]/div/img")
	WebElement howItWorksImage2;

	@FindBy(xpath="//*[@id=\'how-it-works\']/div/div[2]/ol/li[3]/div/img")
	WebElement howItWorksImage3;
	
	@FindBy(xpath="//*[@id=\'how-it-works\']/div/div[2]/ol/li[4]/div/img")
	WebElement howItWorksImage4;
	
	@FindBy(xpath="//*[@id=\'how-it-works\']/div/div[2]/ol/li[5]/div/img")
	WebElement howItWorksImage5;
	
	@FindBy(xpath="//*[@id=\"pricing\"]/img")
	WebElement pricingImage;       //Missing
	
	@FindBy(xpath="//*[@id=\'outfits\']/div/div[2]/div[1]/div/figure/img")
	WebElement outfitsImage1;
	
	@FindBy(xpath="//*[@id=\'outfits\']/div/div[2]/div[2]/div/figure/img")
	WebElement outfitsImage2;
	
	@FindBy(xpath="//*[@id=\'outfits\']/div/div[2]/div[3]/div/figure/img")
	WebElement outfitsImage3;
	
	@FindBy(xpath="//*[@id=\'trunks\']/img")
	WebElement trunksImage;       //Missing
	
	/*******************
	 * Get Started Button
	 */
	
	@FindBy(xpath="//*[@id=\'intro\']/div[1]/div/div/a")
	WebElement getStartedForWomenButton;
	
	@FindBy(xpath="//*[@id=\'how-it-works\']/div/a")
	WebElement getStartedHowItWorksButton;
	
	@FindBy(xpath="//*[@id='pricing']/div/div/a")
	WebElement getStartedPricingButton;
	
	@FindBy(xpath="//*[@id='outfits']/div/a")
	WebElement getStartedOutfitsButton;
	
	@FindBy(xpath="//*[@id='trunks']/div/div/div/a")
	WebElement getStartedTrunksButton;
	
	@FindBy(xpath="/html/body/main/aside/div/div/div/a")
	WebElement getStartedTCNButton;
	
	
	/*******************
	 * How it works video
	 */
	
	@FindBy(xpath="//*[@id=\'how-it-works\']/div/div[2]/div[3]/div/div")
	WebElement howItWorksVideo;
	
	
	
	
	//driver.FindElement(By.XPath("//div[contains(@style, 'background-image: url(quot;http://green.png&quot;);')]")).isdisplayed();
	
	/*********************
	 * Initialize elements in Page Factory
	 */
	public TrunkClubWomen(){
	    PageFactory.initElements(driver, this);
	}

 
	/*********************
	 * Prepare a List<WebElements for Images>
	 * @return List<WebElements>
	 */
	public List<WebElement> getImages()
	{
		List<WebElement> lw = new ArrayList<WebElement>();
		
		lw.add(howItWorksImage1);
		lw.add(howItWorksImage2);
		lw.add(howItWorksImage3);
		lw.add(howItWorksImage4);
		lw.add(howItWorksImage5);
		
		lw.add(outfitsImage1);
		lw.add(outfitsImage2);
		lw.add(outfitsImage3);
		
		
		return lw;
	}
	
	
	/*********************
	 * Prepare a List<WebElements for Get Started Buttons>
	 * @return List<WebElements>
	 */
	public List<WebElement> getButtonsToGetStarted()
	{
		List<WebElement> lw = new ArrayList<WebElement>();
		lw.add(getStartedForWomenButton);
		lw.add(getStartedHowItWorksButton);
		lw.add(getStartedPricingButton);
		lw.add(getStartedOutfitsButton);
		lw.add(getStartedTrunksButton);
		lw.add(getStartedTCNButton);
	
		return lw;
	}
	
	public WebElement getStartedButton()
	{
		return getStartedForWomenButton;
	}
	
	public WebElement getVideo()
	{
		return howItWorksVideo;
	}
}
