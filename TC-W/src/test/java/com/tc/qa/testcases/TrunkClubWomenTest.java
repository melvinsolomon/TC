package com.tc.qa.testcases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tc.qa.base.TestBase;
import com.tc.qa.pages.ColorElimination;
import com.tc.qa.pages.DoYouLikeThisStyle;
import com.tc.qa.pages.JewelryStyle;
import com.tc.qa.pages.TrunkClubWomen;
import com.tc.qa.pages.TypicalWorkWeek;
import com.tc.qa.util.ImageValidator;
import com.tc.qa.util.WindowAndPopups;

public class TrunkClubWomenTest extends TestBase{

	TrunkClubWomen  tcw; // = new TrunkClubWomen();
	ImageValidator imageValidator = new ImageValidator();
	WindowAndPopups wap = new WindowAndPopups();
	DoYouLikeThisStyle dylts = new DoYouLikeThisStyle();
	TypicalWorkWeek tww = new TypicalWorkWeek();
	ColorElimination ce = new ColorElimination();
	JewelryStyle js = new JewelryStyle();
	
	public TrunkClubWomenTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		tcw = new TrunkClubWomen();
	}
	
	@Test(priority=1)
	public void verifyImageLoad()
	{
		List<WebElement> lw = new ArrayList<WebElement>();
		lw = tcw.getImages();
		for(WebElement e : lw) {
			//Assert.assertTrue(imageValidator.isImageLoaded(e));
			if (e.isDisplayed())
			{
				System.out.println("Image is displayed" + e.getAttribute("alt"));
			}
			else
			{
				System.out.println("Image is missing" + e.getAttribute("alt"));
			}
		}
	}
	
	
	@Test(priority=2)
	public void verifyGetStartedButtons()
	{
		Set<String> set = new HashSet<String>();

		List<WebElement> lw = new ArrayList<WebElement>();
		lw = tcw.getButtonsToGetStarted();

		for(WebElement e : lw) {
              set.add(e.getAttribute("href"));
		}

		//Verify if all links show the same web site address
		Assert.assertEquals(1,set.size());
		
		//Verify the title of the page when Get Started button is clicked
		lw.get(0).click();
		String windowTitle = wap.getCurrentWindowTitle();		

		Assert.assertEquals("Sign Up | Trunk Club",windowTitle);
	}
	

	@Test(priority=3)
	public void verifyVideo()
	{
		Assert.assertTrue(tcw.getVideo().isDisplayed());
		tcw.getVideo().click();   //this line is to be deleted after checking
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
