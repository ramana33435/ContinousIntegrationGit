package com.hexaware.junit;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumValidationTesting {
private static WebDriver driver = null;
	
	@BeforeClass
    public static void setUp(){
		System.out.println("Selenium Validation Testing Started");

		
		//System.setProperty("webdriver.ie.driver", "D:/IEDriverServer.exe");
		
		//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		
		ChromeOptions chromeOptions= new ChromeOptions();
		java.io.File file = new java.io.File("C:\\Users\\18982\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Jenkins\\workspace\\AntContinousIntegration\\chromedriver.exe");
		chromeOptions.setBinary(file);
		//driver = new InternetExplorerDriver();
		driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void testChromeSelenium() {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8089/ContinousIntegration/");
        String title = driver.getTitle();
        if(title.equals("Continous Assurance Platform (CAP)")){
        	System.out.println("Testing Passed");
        }else{
        	System.out.println("Test Failed");
        }
    }

    @AfterClass
    public static void cleanUp(){
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
