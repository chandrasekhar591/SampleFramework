package com.rameshsoft.automation.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.rameshsoft.automation.DriverUtil.DriverUtility;

public interface ScreenShotUtility  {
	
	
	
 public static	void screenShot(String ImageName,WebDriver d) throws IOException{
	 TakesScreenshot ts=(TakesScreenshot)d;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    String path="G://"+ImageName+".jpeg";
	    File dest=new File("G://"+ImageName+".jpeg");
	    
	    FileUtils.copyFile(src, dest);
	  
	     
 }

}
