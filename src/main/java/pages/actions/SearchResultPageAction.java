package pages.actions;

import org.openqa.selenium.support.PageFactory;

import Factory.DriverFactoryMethod;
import pages.locator.SearchResultPage;

public class SearchResultPageAction {

	SearchResultPage amzSearchResult = null;
	
	public SearchResultPageAction() {
		this.amzSearchResult= PageFactory.initElements(DriverFactoryMethod.getDriver(), SearchResultPage.class);
		}
	
	public String getSearchBoxValue() {
		return amzSearchResult.searchBox.getAttribute("value");
	}
	
	public String getPageTitle() {
		return Factory.DriverFactoryMethod.getDriver().getTitle();
		}
	
	public void checkBrandName() {
		amzSearchResult.brandNameLink.click();
	}
	
}
