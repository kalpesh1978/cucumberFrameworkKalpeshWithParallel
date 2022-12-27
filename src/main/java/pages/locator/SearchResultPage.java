package pages.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {

	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy(xpath = "//*[@id=\"p_89/Samsung\"]/span/a/div/label/i")
	public WebElement brandNameCheckbox;
	
	@FindBy(xpath = "//*[@id=\"p_89/Samsung\"]/span/a/span")
	public WebElement brandNameLink;
	
	WebDriver driver;
	
	public SearchResultPage(WebDriver driver) {
		this.driver=driver;
	}
}
