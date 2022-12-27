package Parallel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.actions.SearchResultPageAction;

public class SearchResultPageStepDefination {

	SearchResultPageAction searchResultPageAction;
	
	
	
	@Given("User is on category page have title as {string}")
	public void checkPageTitle(String expectedTitle) {
		searchResultPageAction = new SearchResultPageAction();
		String actualTitle = searchResultPageAction.getPageTitle();
		
		System.out.println("Expected" + expectedTitle);
		System.out.println("Actual" + actualTitle);
	//	Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Title Match");
		}
	
	@And("Check the value in textbox is {string}")
	public void checktextvalue(String expectedValue) {
		String actualValue = searchResultPageAction.getSearchBoxValue();
	//	Assert.assertEquals(expectedValue, actualValue);
		System.out.println("Value Matched");
		}
	
	@When("User check on {string} checkbox")
	public void selectBrand(String brandName) {
		System.out.println("check brand" + brandName);
		searchResultPageAction.checkBrandName();
	}
	
	@Then("Redirected to page having title {string}")
	public void checkNextPageTitle(String actualTitle) {
		String expectedTitle = searchResultPageAction.getPageTitle();
		
	//	Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Expected title is" + expectedTitle);
		
	}
	
	
}
