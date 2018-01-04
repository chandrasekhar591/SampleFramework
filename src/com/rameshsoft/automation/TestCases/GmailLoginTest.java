package com.rameshsoft.automation.TestCases;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.ActionDriver.ActionDriverEngine;
import com.rameshsoft.automation.DriverUtil.DriverUtility;
import com.rameshsoft.automation.ObjectRepository.ExcelReader;
import com.rameshsoft.automation.ObjectRepository.PropertiesFunction;
import com.rameshsoft.automation.gmail.PojoUtility;
import com.rameshsoft.automation.reports.ReportFunctions;

public class GmailLoginTest extends DriverUtility {
	
	@Test
public void GmailLogin() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
	// TODO Auto-generated method stub
		/*PropertiesFunction pr1=new PropertiesFunction("G:\\NewJar\\SampleFrameWork\\config.properties");
		PropertiesFunction pr=new PropertiesFunction("G:\\NewJar\\SampleFrameWork\\src\\com\\rameshsoft\\automation\\ObjectRepository\\ramesh.properties");
		String url=pr1.getPropertiesKeys("Gmail_url");
	getDriver().get(url);
	getDriver().manage().window().maximize();
	getDriver().manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	
	String u=getDriver().getCurrentUrl();
	System.out.println(u);
	 String v= pr.getPropertiesKeys("UserName_id");
	   String v2=pr.getPropertiesKeys("PassWrd_id");
	   String v3=pr.getPropertiesKeys("next");
	 String v4=  pr.getPropertiesKeys("pnext");
	 ExcelReader er=new ExcelReader("G:\\NewJar\\SampleFrameWork\\ExcellSheet.xlsx");
	String u1= er.getCellData("Sheet1", 0, 1);
	String u2= er.getCellData("Sheet1", 1, 1);
	
	   getDriver().findElement(By.id(v)).sendKeys(u1);
	   getDriver().findElement(By.id(v3)).click();
	   getDriver().findElement(By.name(v2)).sendKeys(u2);
	 getDriver().findElement(By.id(v4)).click();
	   */
		/*ExcelReader er=new ExcelReader("G:\\NewJar\\SampleFrameWork\\ExcellSheet.xlsx");
		 String data= er.getCellData("Sheet1", 0, 1);
		String data2= er.getCellData("Sheet1", 1, 1);
		System.out.println("dataa: "+data2);
		
       getDriver().get(PojoUtility.getConfigFile().getPropertiesKeys("Gmail_url"));
       getDriver().findElement(By.id(PojoUtility.getOrProperties().getPropertiesKeys("UserName_id"))).sendKeys(data);
       getDriver().findElement(By.id(PojoUtility.getOrProperties().getPropertiesKeys("next"))).click();
       Thread.sleep(4000);
       getDriver().findElement(By.id(PojoUtility.getOrProperties().getPropertiesKeys("PassWrd_id"))).sendKeys(data2);
       getDriver().findElement(By.id(PojoUtility.getOrProperties().getPropertiesKeys("pnext"))).click();
     String rt= getDriver().getCurrentUrl();
       PojoUtility.getTextFile().writeData(rt);
             */
		ActionDriverEngine.getUrl(PojoUtility.getConfigFile().getPropertiesKeys("Bing_url"));
		ReportFunctions.logInfo("clicked on Bing ");
		
		ActionDriverEngine.ActionClick("linkText", PojoUtility.getOrProperties().getPropertiesKeys("msn"));
		ReportFunctions.logInfo("clicked on msn ");
		ActionDriverEngine.ActionClick("linkText", PojoUtility.getOrProperties().getPropertiesKeys("office"));
		ReportFunctions.logInfo("clicked on office ");
	    ActionDriverEngine.windowHandles(2);
		ActionDriverEngine.getScreenShot("bing");
		;
		PojoUtility.getOrProperties().setPropertiesValues("Link_text", "My account");
		ActionDriverEngine.ActionClick("linkText", "My account");
		ReportFunctions.logInfo("clicked on myaccount");
		  String url= getDriver().getCurrentUrl();
		PojoUtility.getTextFile().writeData(url);
 
		/*ActionDriverEngine.ActionSendData("id", PojoUtility.getOrProperties().getPropertiesKeys("UserName_id"), PojoUtility.getExcellSheet().getCellData("Sheet1", 0, 1));
		ActionDriverEngine.ActionClick("id", PojoUtility.getOrProperties().getPropertiesKeys("next"));*/
	
	

}
}
