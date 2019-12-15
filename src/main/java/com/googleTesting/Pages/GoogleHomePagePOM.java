package com.googleTesting.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Page Factory for Googl Home page by Sudheer

public class GoogleHomePagePOM {
	
	By logo_HomePage=By.xpath("//*[@id=\"hplogo\"]");
	By gmailLinl_HomePage=By.linkText("Gmail");
	By imagesLink_HomePage=By.linkText("Images");
	By searchBox_HomePage=By.name("q");
	By searchButton_HomePage=By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]");
	By amFeelingLuckyButton_HomePage=By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]");

	
	WebDriver driver_HomePage;
	public GoogleHomePagePOM(WebDriver driver) {
		this.driver_HomePage=driver;
		
	}
								// Returns Title//
	
	public String googleTitle() {
		return driver_HomePage.getTitle();
}
	
									//***methods to returns element isDisplayed or not***//
	
	//google logo
	public Boolean googleLogoisDisplayed() {
		return driver_HomePage.findElement(logo_HomePage).isDisplayed();
		}
	
	//google search button
	public Boolean googleSearchButtonisDisplayed() {
		return driver_HomePage.findElement(searchButton_HomePage).isDisplayed();
	}
	
	//google am feeling lucky button
	public Boolean googleIamFeelingLuckyisDisplayed() {
		return driver_HomePage.findElement(amFeelingLuckyButton_HomePage).isDisplayed();
	}
	
	//google gmail link
	public Boolean googlegmailisDisplayed() {
		return driver_HomePage.findElement(gmailLinl_HomePage).isDisplayed();
	}
	
	//google images link
	public Boolean googleImagesisDisplayed() {
		return driver_HomePage.findElement(imagesLink_HomePage).isDisplayed();
	}
	
	//search box button
	public Boolean searchBoxisDisplayed() {
		return driver_HomePage.findElement(searchBox_HomePage).isDisplayed();
	}
	
							
	
					//***methods to returns element isEnabled or not***//
	
		//google logo
		public Boolean googleLogoisEnabled() {
			return driver_HomePage.findElement(logo_HomePage).isEnabled();
		}
		
		//google gmail link
		public Boolean googlegmailisEnabled() {
			return driver_HomePage.findElement(gmailLinl_HomePage).isEnabled();	
		}
		
		//google images link
		public Boolean googleImagesisEnabled() {
			return driver_HomePage.findElement(imagesLink_HomePage).isEnabled();
			}
		
		//search box button
		public Boolean searchBoxisEnabled() {
			return driver_HomePage.findElement(searchBox_HomePage).isEnabled();
			}
		
		//google search button
		public Boolean googleSearchButtonisEnabled() {
			return driver_HomePage.findElement(searchButton_HomePage).isEnabled();
			}
		
		//google am feeling lucky button
		public Boolean googleIamFeelingLuckyisEnabled() {
			return driver_HomePage.findElement(amFeelingLuckyButton_HomePage).isEnabled();
				}
											// page action methods//
		public void googleSearchTest(String SearchValue) throws InterruptedException {
			driver_HomePage.findElement(searchBox_HomePage).sendKeys(SearchValue);;
			driver_HomePage.findElement(searchButton_HomePage).submit();
			Thread.sleep(5000);
				}

}
