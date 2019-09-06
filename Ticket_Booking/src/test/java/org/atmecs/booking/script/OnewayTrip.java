package org.atmecs.booking.script;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class OnewayTrip extends com.atmecs.utils.testbase.SetupDriver {


	@Test(dataProvider = "destination", dataProviderClass = org.atmecs.utils.dataprovider.ProvideData.class)
	public void onewaytripbooking(String from, String to, String email, String f_name, String l_name, String cf_name,
			String cl_name, String phone) throws FileNotFoundException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		org.atmecs.utils.dataprovider.ReadProp rp = new org.atmecs.utils.dataprovider.ReadProp();

		
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.From"))).sendKeys(from);

		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.From"))).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.To"))).sendKeys(to);

		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.To"))).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(rp.takeproperties("loc.borddateclick.btn"))).click();

		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Departon"))).click();

		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Adults"))).click();

		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Adultsss"))).click();
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Children"))).click();

		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.searchFlight"))).click();

		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.book"))).click();
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Insurance"))).click();
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.ContinueDetails"))).click();

		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.EmailId"))).sendKeys(email);
		

		driver.findElement(By.id(rp.takeproperties("locators.textarea.Continue1"))).click();

		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Title"))).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(rp.takeproperties("locator.select.title2"))).click();
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.FirstName"))).click();
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.FirstName"))).sendKeys(f_name);
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.LastName"))).sendKeys(l_name);
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.ctitle1"))).click();
		driver.findElement(By.xpath(rp.takeproperties("loc.textarea.ctitle"))).click();

		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.cFirstName"))).sendKeys(cf_name);
		driver.findElement(By.id(rp.takeproperties("locators.textarea.cLastName"))).sendKeys(cl_name);
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Day"))).click();
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Month"))).click();
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.year"))).click();
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Mobileno"))).sendKeys(phone);
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Continue"))).click();
	}

}
