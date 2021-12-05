package org.com.defaultBrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class BrowseLauncher {
	
	protected static Properties prop=null;
	String browserProperties;
	String urlProperties;
	String locationProperties;
	protected WebDriver driver=null;
	static Logger logger=Logger.getLogger(BrowseLauncher.class);
	
	public Properties getProperties() throws IOException {
		
		FileInputStream file=new FileInputStream("config.properties");
		prop=new Properties();
		prop.load(file);
		return prop;
	}
	
	@Test 
	public void launchBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		getProperties();
		browserProperties=prop.getProperty("browser");
		urlProperties=prop.getProperty("url");
		locationProperties=prop.getProperty("DriverLocation");
		
		if(browserProperties.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", locationProperties);
			driver= new ChromeDriver();
		}else if(browserProperties.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", locationProperties);
			driver= new FirefoxDriver();
		}
		driver.get(urlProperties);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	

}
