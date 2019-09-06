package org.atmecs.booking.script;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;



public class RoundTrip extends com.atmecs.utils.testbase.SetupDriver {

	@Test(dataProvider = "destination", dataProviderClass = org.atmecs.utils.dataprovider.ProvideData.class)
	public void roundtrip(String from, String to, String email, String f_name, String l_name, String cf_name,
			String cl_name, String phone) throws FileNotFoundException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		org.atmecs.utils.dataprovider.Readroundtrip_prop rrp = new org.atmecs.utils.dataprovider.Readroundtrip_prop();
		
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(rrp.takeproperties("loc.roundtrip.btn"))).click();
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.From"))).sendKeys(from);
		
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.From"))).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.To"))).sendKeys(to);
		
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.To"))).sendKeys(Keys.ENTER);
		
	driver.findElement(By.xpath(rrp.takeproperties("loc.borddateclick.btn"))).click();
	
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.Departon"))).click();		
		
		System.out.println(rrp.takeproperties("locators.textarea.Departon"));
		
		driver.findElement(By.xpath(rrp.takeproperties("loc.returndateclick.btn"))).click();
		
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.returnon"))).click();Thread.sleep(5000);
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.Adults"))).click();
		
		
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.Adultsss"))).click();		
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.Children"))).click();
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.searchFlight"))).click();

		driver.findElement(By.xpath(rrp.takeproperties("loc.2ndpagebook.btn"))).click();
	
		driver.findElement(By.xpath(rrp.takeproperties("Itinerarystep.Insurance.txt"))).click();
		driver.findElement(By.xpath(rrp.takeproperties("Itinerarystep.ContinueDetails.txt"))).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.EmailId"))).sendKeys(email);
		driver.findElement(By.xpath(rrp.takeproperties("loc.mob.txt"))).click();
		driver.findElement(By.xpath(rrp.takeproperties("loc.mob.txt"))).sendKeys("7063744660");
		
		Thread.sleep(1000);

		driver.findElement(By.id(rrp.takeproperties("locators.textarea.Continue1"))).click();
		
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.Title"))).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(rrp.takeproperties("locator.select.title2"))).click();
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.FirstName"))).click();
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.FirstName"))).sendKeys("rishav");
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.LastName"))).sendKeys("kumar");
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.ctitle1"))).click();
		driver.findElement(By.xpath(rrp.takeproperties("loc.textarea.ctitle"))).click();

	}

}
