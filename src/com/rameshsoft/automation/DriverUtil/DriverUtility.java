package com.rameshsoft.automation.DriverUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





import com.rameshsoft.automation.reports.ReportFunctions;
import com.rameshsoft.automation.utility.ScreenShotUtility;
import com.rameshsoft.automation.validations.ExceptionFunction;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DriverUtility {
	 private static WebDriver driver;
	 private static  ExtentReports er ;
	 private static ExtentTest test;  
	 private static Method name;
	 private static  final Logger log=Logger.getLogger(DriverUtility.class.getName());
	 String Browser;
	 static {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			er=new ExtentReports("E:\\Reports.html",true);
			
	 }
	 @BeforeSuite
	 @Parameters("Browser")
	public void openBrowser(@Optional("ChromeBrowser")String Browser) {
		 PropertyConfigurator.configure("log4j.properties"); 
		   log.info(" created a object is --"+Browser);
		  er=new ExtentReports("E:\\Reports.html",true);
		 
		  
		 
		   if(Browser.equalsIgnoreCase("FirefoxBrowser")){
			   
		
			     

			   System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			     driver =new FirefoxDriver();
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			    driver.manage().deleteAllCookies();
		                
			    
			    
			        
					   }else if (Browser.equalsIgnoreCase("ChromeBrowser")){
						   
						   
						   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32 (1)\\chromedriver.exe");
						     driver =new ChromeDriver();
						     driver.manage().window().maximize();
							    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
							    driver.manage().deleteAllCookies();
						                
					   }else if (Browser.equalsIgnoreCase("IE")){
						   
						   
						   System.setProperty("webdriver.ie.driver", "E:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
						     driver =new InternetExplorerDriver();
						     driver.manage().window().maximize();
							    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
							    driver.manage().deleteAllCookies();
						                
					   }	
					   else{
						   System.out.println("Throws an Exception");
						   
					   }
		   }
		@AfterSuite
	 public void closeBrowser() {
			if (driver!=null) {
			driver.close();
			log.info("close the broeser"+Browser);
			}
			else
			{
				System.out.println("browser is null.....");
			}
		

	}  
		@BeforeMethod
		public  static  void  BeforeMethod(Method name) throws IOException {
			     
			 test=  er.startTest(name.getName());
		   	       
			}
			    
		
		@AfterMethod
		public   static void  AfterMethod(ITestResult result) throws IOException {
		
			
			   er.endTest(test);
			   er.flush();
			if(result.getStatus()==ITestResult.FAILURE){
				 
			 ScreenShotUtility.screenShot(name.getName(), driver);
			// log.info("failure test case Screenshot created--"+name.getName());
			
			}
			
			
		}
		
		
				
		
	public static ExtentTest getExtentTest(){
		
		
		
		return  test;
	}
		 public static WebDriver getDriver(){
			   
			   
			   return driver;

		 }
		
}
