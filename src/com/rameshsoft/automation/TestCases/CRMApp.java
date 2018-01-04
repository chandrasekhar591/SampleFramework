package com.rameshsoft.automation.TestCases;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.rameshsoft.automation.ActionDriver.ActionDriverEngine;
import com.rameshsoft.automation.DriverUtil.DriverUtility;
import com.rameshsoft.automation.gmail.PojoUtility;
import com.rameshsoft.automation.utility.ScreenShotUtility;
import com.relevantcodes.extentreports.ExtentReports;

public class CRMApp extends DriverUtility {
	
	private static  final Logger log=Logger.getLogger(CRMApp.class.getName());
	
	@Test
	public void homepeage() throws IOException, InterruptedException {
		PojoUtility.getConfigFile().setPropertiesValues("crmurl", "https://www.freecrm.com/index.html");
		 String url=PojoUtility.getConfigFile().getPropertiesKeys("crmurl");
		  ActionDriverEngine.getUrl(url);
		  log.info("navigated to url"+url);;
		  
		  
		  PojoUtility.getOrProperties().setPropertiesValues("username", "naveenk");
		  PojoUtility.getOrProperties().setPropertiesValues("userpath", "username");
		  String user= PojoUtility.getOrProperties().getPropertiesKeys("username");
		  
		  String userpaTH= PojoUtility.getOrProperties().getPropertiesKeys("userpath");
		 ActionDriverEngine.ActionSendData("name", userpaTH, user);
		 log.info("navigated to username   - "+userpaTH);;
		 log.info("navigated to userdata     -"+user);;
		 Thread.sleep(5000);
		 
		 
		 
		 PojoUtility.getOrProperties().setPropertiesValues("passPath", "password");
		 PojoUtility.getOrProperties().setPropertiesValues("passData", "test@123");
		 String passP=PojoUtility.getConfigFile().getPropertiesKeys("passPath");
		 
		
		 String pass=PojoUtility.getConfigFile().getPropertiesKeys("passData");
		 
		 ActionDriverEngine.ActionSendData("names", passP, pass);
		 log.info("Enterd the password inta field"+pass.toString());
		 PojoUtility.getOrProperties().setPropertiesValues("submit", "//input[@type='submit']");
		 
		 
		 String submitp=PojoUtility.getConfigFile().getPropertiesKeys("submit");
		 ActionDriverEngine.ActionClick("xpath", submitp);
		 log.info("Sucessfully login into the CRM app"+submitp.toString());
		 
		 ScreenShotUtility.screenShot("CRMApp", getDriver());
	         

	}

}
