package com.rameshsoft.automation.TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.rameshsoft.automation.DriverUtil.DriverUtility;
import com.rameshsoft.automation.reports.ReportFunctions;
import com.rameshsoft.automation.supporters.ValidationFunction;
import com.rameshsoft.automation.validations.ExceptionFunction;

public class Facebook extends DriverUtility{
	
	private static String url="https://www.facebook.com";
	 private static  final Logger log=Logger.getLogger(Facebook.class.getName());
	
	@Test
	public static void Facebooklogin() throws InterruptedException {
		// TODO Auto-generated method stub
		getDriver().get(url);
		     log.info("navigate to the url"+url);
		 
        getDriver().findElement(By.id("email")).sendKeys("hemachandra39");
        ReportFunctions.logInfo("Facebooklogin");
       
	}
}
