package com.rameshsoft.automation.TestCases;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.rameshsoft.automation.ActionDriver.ActionDriverEngine;
import com.rameshsoft.automation.DriverUtil.DriverUtility;
import com.rameshsoft.automation.ObjectRepository.PropertiesFunction;
import com.rameshsoft.automation.ObjectRepository.TextFunctionUtilities;
import com.rameshsoft.automation.reports.ReportFunctions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class FlipkartTest extends DriverUtility {
	 private static  final Logger log=Logger.getLogger(FlipkartTest.class.getName());
	@Test
	public void FlipkartLogin() throws IOException, InterruptedException {
		
		
		ActionDriverEngine.getUrl("https://www.gmail.com");
		log.info("Entered the url");
		ActionDriverEngine.ActionSendData("id", "identifierId", "hemachndra39");
		log.info("Entered  the username");

		 ReportFunctions.logInfo("Entered The Right username");
		
		
		
		
		
		
		
		
		
				

		/*getDriver().get("https://www.flipkart.com");*/
		/*PropertiesFunction pf=new PropertiesFunction("G:\\NewJar\\SampleFrameWork\\src\\com\\rameshsoft\\automation\\ObjectRepository\\ramesh.properties");
		pf.setPropertiesValues("Flip_xpath", "//div[@class='_3Ed3Ub']/ul/li[6]/a");
		String flip_xpath=pf.getPropertiesKeys("Flip_xpath");
		   String text= getDriver().getTitle();
		   
	Map<String, String>val=	pf.getAllProperties();
	     System.out.println(val);
		Actions action=new Actions(getDriver());
		action.moveToElement(getDriver().findElement(By.xpath(flip_xpath))).build().perform();
	     TextFunctionUtilities tf=new TextFunctionUtilities("G:\\NewJar\\SampleFrameWork\\src\\com\\rameshsoft\\automation\\ObjectRepository\\FlipKart.txt");
		     tf.writeData(text);
                  */
	}

}
