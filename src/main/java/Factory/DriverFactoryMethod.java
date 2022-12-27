package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactoryMethod {

	private static WebDriver driver = null;
	private static WebDriverWait wait = null;
	public final static int TIME_OUT = 30;
	public final static int PAGE_LOAD_TIME = 50;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	public WebDriver init_Driver(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			tlDriver.set(new ChromeDriver());
			
			getDriver().manage().window().maximize();
			wait = new WebDriverWait(getDriver(),  TIME_OUT);
			getDriver().manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
			getDriver().manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIME, TimeUnit.SECONDS);
			
		}
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	
	
	
	
	
	
}
