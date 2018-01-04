package com.rameshsoft.automation.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.rameshsoft.automation.ActionDriver.ActionDriverEngine;
import com.rameshsoft.automation.DriverUtil.DriverUtility;
import com.rameshsoft.automation.gmail.PojoUtility;
import com.rameshsoft.automation.utility.ScreenShotUtility;

public class PhpTravels  extends DriverUtility{
	 private static Logger log=Logger.getLogger(PhpTravels.class.getName());
	 String url="http://www.phptravels.net/";
	 String myacount=".//*[@id='li_myaccount']/a";
	
	@Test
	public void TestPhpTravels() throws IOException {
		PojoUtility.getConfigFile().setPropertiesValues("PHP_URL", "http://www.phptravels.net/");
		 ActionDriverEngine.getUrl(url);
		 log.info("navigate to the url--"+url);
		 PojoUtility.getOrProperties().setPropertiesValues("hotel_id", "html/body/nav[1]/div/div/div/ul/li[2]/a");
		String hotel= PojoUtility.getOrProperties().getPropertiesKeys("hotel_id");
		ActionDriverEngine.ActionClick("xpath",hotel);
		log.info("Click on hotels to book---"+hotel);
	     String room=PojoUtility.getOrProperties().getPropertiesKeys("Room_id");
	 getDriver().manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	 ActionDriverEngine.ActionClick("xpath", room);
	 log.info("click on  identified room"+room);
		
	   String title = getDriver().getTitle();
	   log.info("Title of page is  "+title);
	   PojoUtility.getTextFile().writeData(title);
	  JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	  jse.executeScript("window.scrollBy(0,1000)");
	   String avail=   PojoUtility.getOrProperties().getPropertiesKeys("avail");
	     WebElement element= getDriver().findElement(By.xpath(avail));
	       ActionDriverEngine.dropDown(element, "value", "3");
	       ScreenShotUtility.screenShot("Facebook", getDriver());
	         log.info("Select data value"+element);
	       String bility=  PojoUtility.getOrProperties().getPropertiesKeys("bility");
	         ActionDriverEngine.ActionClick("xpath",bility);
	         log.info("check the availability of room");
	         WebElement date= getDriver().findElement(By.xpath(".//*[@id='52']"));
	         log.info("selecting date.."+date);
	         ActionDriverEngine.dropDown(date, "value", "11,2018");
	         getDriver().manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	         ScreenShotUtility.screenShot("date", getDriver());
	         log.info("date selected");
		         String book=PojoUtility.getOrProperties().getPropertiesKeys("book");
		           ActionDriverEngine.ActionClick("xpath", book);
		             log.info("book the room"+book);
		
	}

}
