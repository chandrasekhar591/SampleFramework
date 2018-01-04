package com.rameshsoft.automation.reports;

import com.rameshsoft.automation.DriverUtil.DriverUtility;
import com.relevantcodes.extentreports.LogStatus;

public class ReportFunctions {
	
	static public void logInfo(String stepDetails) throws InterruptedException 
	{
		DriverUtility.getExtentTest().log(LogStatus.INFO, stepDetails);
		
	}
	
	public static void loginfo(String stepName,String stepDetails) {
		DriverUtility.getExtentTest().log(LogStatus.INFO, stepName, stepDetails);
		
	}
	public static void loginf2(String stepName,String stepDetails) {
		DriverUtility.getExtentTest().log(LogStatus.INFO, stepName, stepDetails);
		
	}
	public static void loginf(String stepName,String stepDetails) {
		DriverUtility.getExtentTest().log(LogStatus.INFO, stepName, stepDetails);
		
	}
}
