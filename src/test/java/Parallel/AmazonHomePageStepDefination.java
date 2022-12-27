package Parallel;

import Factory.DriverFactoryMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.AmazonHomePageAction;

public class AmazonHomePageStepDefination {
	
	AmazonHomePageAction amazonHomePageAction;

	@Given("go to Url {string}")
	public void gotoUrl(String url) {
		DriverFactoryMethod.getDriver().get(url);
	}
	
	@And("enter {string} in search text box")
	public void enterData(String text) {
		amazonHomePageAction = new AmazonHomePageAction();
		amazonHomePageAction.enterText(text);
	}
	
	@When("click on search button")
	public void pressSearchIcon() {
		amazonHomePageAction.clickSearchButton();
	} 
	
	@Then("redirect to category page")
	public void categorypage() {
		System.out.println("Page Redirected");
	}
	
	
	
	
	
	
	
	
}
