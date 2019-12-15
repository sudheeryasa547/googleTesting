package com.googleTesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.googleTesting.Pages.GoogleHomePagePOM;



public class GoogleHomePageTest{
	WebDriver driver;
	GoogleHomePagePOM  g1;
			
		@BeforeClass
			public void openBrowser() {
			String driverPath = "D://Sudheer//sudheer_workspace//yasa547//Drivers//";
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("open the browser");
			System.out.println("enter URL into your browser");
		//	driver.get(url);
		driver.get("https://www.google.co.in/");
			g1=new GoogleHomePagePOM(driver);
		}
		
											//****verification of WebElements present or not***//
@Test
public void googleTitleTest() {
Assert.assertEquals(g1.googleTitle(), "Google657","Title Verification is Failed::::");
}

//google logo
@Test
public void verifyGoogleLogoTest() {
	Assert.assertEquals(g1.googleLogoisDisplayed().booleanValue(), true);
}

//google gmail link
@Test
public void verifyGooglegmailTest() {
	Assert.assertEquals(g1.googlegmailisDisplayed().booleanValue(),true);
}

//google images link
@Test
public void verifyGoogleImagesTest() {
	Assert.assertEquals(g1.googleImagesisDisplayed().booleanValue(),true);
}

//Search Box
@Test
public void searchBoxIsDisplayed() {
			Assert.assertEquals(g1.searchBoxisDisplayed().booleanValue(),true);
}

//google search button
@Test
public void verifyGoogleSearchButtonTest() {
	Assert.assertEquals(g1.googleSearchButtonisDisplayed().booleanValue(),true);
}

//google am feeling lucky button
@Test
public void verifyGoogleIamFeelingLuckyTest() {
	Assert.assertEquals(g1.googleIamFeelingLuckyisDisplayed().booleanValue(),true);
}


						//****verification of WebElements enabled or not***//
//google logo
@Test(dependsOnMethods = "verifyGoogleLogoTest")
public void verifyGoogleLogoEnabledTest() {
	Assert.assertEquals(g1.googleLogoisEnabled().booleanValue(), true);
}

//google gmail link
@Test(dependsOnMethods = "verifyGooglegmailTest")
public void verifyGooglegmailEnabledTest() {
	Assert.assertEquals(g1.googlegmailisEnabled().booleanValue(),true);
}

//google images link
@Test(dependsOnMethods = "verifyGoogleImagesTest")
public void verifyGoogleImagesEnabledTest() {
	Assert.assertEquals(g1.googleImagesisEnabled().booleanValue(),true);
}

//Search Box
@Test(dependsOnMethods = "searchBoxIsDisplayed")
public void searchBoxIsEnabled() {
			Assert.assertEquals(g1.searchBoxisEnabled().booleanValue(),true);
}

//google search button
@Test(dependsOnMethods = "verifyGoogleSearchButtonTest")
public void verifyGoogleSearchButtonEnabledEnabledTest() {
	Assert.assertEquals(g1.googleSearchButtonisEnabled().booleanValue(),true);
}

//google am feeling lucky button
@Test(dependsOnMethods = "verifyGoogleIamFeelingLuckyTest")
public void verifyGoogleIamFeelingLuckyEnabledTest() {
	Assert.assertEquals(g1.googleIamFeelingLuckyisEnabled().booleanValue(),true);
}



						//**Verifying Search button functionality**//
		@Test(dependsOnMethods = "verifyGoogleIamFeelingLuckyEnabledTest")
		public void googleSearchTest() throws InterruptedException {
			g1.googleSearchTest("james cameron");
		}


		
	
		@AfterClass
		public void closeBroswer() throws InterruptedException {
			System.out.println("close the browser");
			
			driver.close();
		}
		

}
