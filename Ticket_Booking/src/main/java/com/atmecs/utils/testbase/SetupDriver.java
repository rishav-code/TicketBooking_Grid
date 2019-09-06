package com.atmecs.utils.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;

public class SetupDriver {
	public static WebDriver driver;
	public static Properties prop = new Properties();

	@BeforeSuite
	public static void browserSetup() throws MalformedURLException {

//String nodeurl="http://55.55.53.66:4444/wd/hub";
//
//
// DesiredCapabilities capability=new DesiredCapabilities();
// URL url1=new URL(nodeurl);
// capability.setBrowserName("chrome");
// capability.setPlatform(Platform.WIN10);
// driver=new RemoteWebDriver(url1,capability);
		try {
			InputStream input = new FileInputStream(
					"./src/test/resources/TestData/config.properties");
			
			// load a properties file
			prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		switch (prop.getProperty("browsername")) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "MSedge":
			System.setProperty("webdriver.edge.driver", "./lib/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("browser not available");

		}
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();


	
	}
}
