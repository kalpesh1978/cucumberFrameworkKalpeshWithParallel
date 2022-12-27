package pages.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage {
	

	@FindBy(id = "sp-cc-accept")
	public WebElement clickCookies;
	
	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy(id = "nav-search-submit-button")
	public WebElement searchButton;
	
	private WebDriver driver = null;
	
	public AmazonHomePage (WebDriver driver) {
		this.driver = driver;
	}
		
	
	
	
	
	
}
