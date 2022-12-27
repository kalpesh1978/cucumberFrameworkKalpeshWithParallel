package pages.actions;

import org.openqa.selenium.support.PageFactory;

import Factory.DriverFactoryMethod;
import pages.locator.AmazonHomePage;

public class AmazonHomePageAction {

	AmazonHomePage amzhom = null;
	
	public AmazonHomePageAction () {
		this.amzhom = PageFactory.initElements(DriverFactoryMethod.getDriver(),AmazonHomePage.class );
		amzhom.clickCookies.click();
		
	}
	
	public void enterText(String text) {
		amzhom.searchBox.click();
		amzhom.searchBox.sendKeys(text);
	}
	
	public void clickSearchButton() {
		amzhom.searchButton.click();
	}
	
	public void clearText() {
		amzhom.searchBox.clear();
	}
	
	
	
	
	
	
	
}
