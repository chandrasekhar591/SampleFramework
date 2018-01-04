package com.rameshsoft.automation.TestCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.rameshsoft.automation.ActionDriver.ActionDriverEngine;
import com.rameshsoft.automation.DriverUtil.DriverUtility;
import com.rameshsoft.automation.gmail.PojoUtility;
import com.rameshsoft.automation.reports.ReportFunctions;
import com.rameshsoft.automation.validations.ExceptionFunction;

public class BusinessScripts extends DriverUtility  {
	 private static  final Logger log=Logger.getLogger(BusinessScripts.class.getName());
		
	        @Test
	   public static  void FlipkartTestcase() throws IOException, InterruptedException {
		   
		   PojoUtility.getConfigFile().setPropertiesValues("Flip_url", "https://www.flipkart.com"); 
		   ActionDriverEngine.getUrl(PojoUtility.getConfigFile().getPropertiesKeys("Flip_url"));
		   ReportFunctions.logInfo("Entered the url");
		   
		  log.info("Entered the url:.");
		   
		   
		   

	}
	
	
	

}
