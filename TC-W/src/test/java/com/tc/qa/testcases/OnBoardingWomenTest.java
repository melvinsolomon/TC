package com.tc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tc.qa.base.TestBase;
import com.tc.qa.pages.AccountInfoPage;
import com.tc.qa.pages.Age;
import com.tc.qa.pages.BraBandSize;
import com.tc.qa.pages.BraCupSize;
import com.tc.qa.pages.Budget;
import com.tc.qa.pages.ClubHousePreference;
import com.tc.qa.pages.ColorElimination;
import com.tc.qa.pages.ConcealAreas;
import com.tc.qa.pages.DislikePatterns;
import com.tc.qa.pages.DoYouLikeThisStyle;
import com.tc.qa.pages.DressSize;
import com.tc.qa.pages.DressStyle;
import com.tc.qa.pages.HeelHeight;
import com.tc.qa.pages.HeightWeight;
import com.tc.qa.pages.JewelryStyle;
import com.tc.qa.pages.PantRise;
import com.tc.qa.pages.PantSize;
import com.tc.qa.pages.PantStyle;
import com.tc.qa.pages.ShirtSize;
import com.tc.qa.pages.ShoeSize;
import com.tc.qa.pages.ShoeStyle;
import com.tc.qa.pages.Stores;
import com.tc.qa.pages.TopsStyle;
import com.tc.qa.pages.TrunkClubWomen;
import com.tc.qa.pages.TrunkSchedule;
import com.tc.qa.pages.TypicalWorkWeek;
import com.tc.qa.util.ImageValidator;
import com.tc.qa.util.WindowAndPopups;

public class OnBoardingWomenTest extends TestBase{

	TrunkClubWomen tcw; // = new TrunkClubWomen();
	ImageValidator imageValidator; // = new ImageValidator();
	WindowAndPopups wap; /// = new WindowAndPopups();
	DoYouLikeThisStyle dylts; // = new DoYouLikeThisStyle();
	TypicalWorkWeek tww; // = new TypicalWorkWeek();
	ColorElimination ce; // = new ColorElimination();
	JewelryStyle js; // = new JewelryStyle();
	ConcealAreas ca; // = new ConcealAreas();
	TopsStyle ts; // = new TopsStyle();
	DislikePatterns dp; // = new DislikePatterns();
	PantStyle ps; //  = new PantStyle();
	PantRise pr; // = new PantRise();
	DressStyle ds; // = new DressStyle();
	ShoeStyle ss; // = new ShoeStyle();
	HeelHeight hh; // = new HeelHeight();
	Budget bd; // = new Budget();
	Stores st; // = new Stores();
	ShirtSize shsz; // = new ShirtSize();
	PantSize pnsz; // = new PantSize();
	DressSize dsz; // = new DressSize();
	ShoeSize shoe; // = new ShoeSize();
	BraBandSize bbs; // = new BraBandSize();
	BraCupSize bcs; // = new BraCupSize();
	HeightWeight hw; // = new HeightWeight();
	Age age; // = new Age();
	ClubHousePreference chp; // = new ClubHousePreference();
	TrunkSchedule tsc; // = new TrunkSchedule();
	AccountInfoPage aip; // = new AccountInfoPage();
	
	
	public OnBoardingWomenTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		tcw = new TrunkClubWomen();
		dylts = new DoYouLikeThisStyle();
		
		
		imageValidator = new ImageValidator();
		wap = new WindowAndPopups();
		tww = new TypicalWorkWeek();
		ce = new ColorElimination();
		js = new JewelryStyle();
		ca = new ConcealAreas();
		ts = new TopsStyle();
		dp = new DislikePatterns();
		ps  = new PantStyle();
		pr = new PantRise();
		ds = new DressStyle();
		ss = new ShoeStyle();
		hh = new HeelHeight();
		bd = new Budget();
		st = new Stores();
		shsz = new ShirtSize();
		pnsz = new PantSize();
		dsz = new DressSize();
		shoe = new ShoeSize();
		bbs = new BraBandSize();
		bcs = new BraCupSize();
		hw = new HeightWeight();
		age = new Age();
		chp = new ClubHousePreference();
		tsc = new TrunkSchedule();
		aip = new AccountInfoPage();
		
		
	}
	
		
	@Test(priority=1)
	public void getStartedForWomen()
	{
		//Click on the Get Started Button
		tcw.getStartedButton().click();
		
		//Do you like this Style 1-6
		for (int i = 0; i<6; i++)
			dylts.getLikeThis().click();
		
		tww.getBusinessFormals().click();
		ce.getLikeAllColors().click();
		dp.getLikeAllPatterns().click();
		js.getLikeGold().click();
		js.getContinueWithSelection();
		ca.getArmsShoulders().click();
		ca.getContinueWithSelection().click();
		ts.getOverSized().click();
		ts.getContinueWithSelection().click();
		ps.getStraightStyle().click();
		ps.getContinueWithSelection().click();
		//pr.getLowRise().click();
		pr.getContinueWithSelection().click();
		//ds.getMaxiStyle().click();
		ds.getDontKnow().click();
		//ss.getShoeStyle().click();
		ss.getDontKnow().click();
		hh.getNoHeelHeight().click();
		bd.getSkipOption().click();
		st.getNoneOfThese().click();
		shsz.getDontKnow().click();
		pnsz.getDontKnow().click();
		dsz.getDontKnow().click();
		shoe.getDontKnow().click();
		bbs.getDontKnow().click();
		bcs.getDontKnow().click();
		hw.getHeight().sendKeys("5");
		hw.getWeight().sendKeys("140");
		hw.getContinueOption().click();
		age.getAge24().click();
		chp.getSkipStep().click();
		tsc.getDecideLater().click();
		System.out.println("Account Profile page text - " + aip.getCompleteProfileInfo().getText());
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
