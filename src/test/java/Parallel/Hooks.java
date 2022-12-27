package Parallel;

import java.io.IOException;
import java.util.Properties;

import Factory.DriverFactoryMethod;
import Utils.ConfigReader;
import io.cucumber.java.Before;

public class Hooks {

	private DriverFactoryMethod driverFactoryMethod;
	
	private ConfigReader reader;
	Properties prop;
	
	@Before(order=0)
	public void getProperties() throws IOException {
		reader = new ConfigReader();
		prop = reader.init_prop();
	}
	
	    @Before(order=1)
	    public void launchBrowser() {
	    	System.out.println("in launch Method");
		String browserName = prop.getProperty("browser");
		driverFactoryMethod = new DriverFactoryMethod();
		System.out.println("in launch Method 1");
		
		driverFactoryMethod.init_Driver(browserName);
		System.out.println("in launch Method 2");
	}
	
}
