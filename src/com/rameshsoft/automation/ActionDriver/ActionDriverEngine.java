package com.rameshsoft.automation.ActionDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.rameshsoft.automation.DriverUtil.DriverUtility;

public  class ActionDriverEngine extends DriverUtility {
	
	
	private  static WebElement element;
	static Actions action=new Actions(getDriver());
	public ActionDriverEngine() {
		// TODO Auto-generated constructor stub
	}
	public static void getScreenShot(String imgName) throws IOException{	

		TakesScreenshot ts=(TakesScreenshot)getDriver();
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("E:\\"+imgName+".jpeg"));
		
		    
	}
	public static void getUrl(String url) {
		// TODO Auto-generated method stub
                  getDriver().get(url);

	}
	  public static void ActionSendData(String LocatorMecha,String Locator,String Data) {
		  
		switch (LocatorMecha) {
		case "id":
		 element=getDriver().findElement(By.id(Locator));
		 if (element.isDisplayed()&&element.isEnabled()) {
			 element.clear();
			 element.sendKeys(Data);
			
		}   
			break;
		
		case "name":
			element =getDriver().findElement(By.name(Locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				 element.clear();
				 element.sendKeys(Data);
				
			}   
			break;
		
	  case "xpath":
			element =getDriver().findElement(By.xpath(Locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				 element.clear();
				 element.sendKeys(Data);
				
			}   
			break;
			
	  case "cssSelector":
		element=getDriver().findElement(By.cssSelector(Locator));
		if (element.isDisplayed()&&element.isEnabled()) {
			 element.clear();
			 element.sendKeys(Data);
			
		}   
			break;
	  case "className":
			getDriver().findElement(By.className(Locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				 element.clear();
				 element.sendKeys(Data);
				
			}   
			break;
	  case "tagName":
		element=getDriver().findElement(By.tagName(Locator));
		if (element.isDisplayed()&&element.isEnabled()) {
			 element.clear();
			 element.sendKeys(Data);
			
		}   
			break;
	  case "linkText":
		element=getDriver().findElement(By.linkText(Locator));
		if (element.isDisplayed()&&element.isEnabled()) {
			 element.clear();
			 element.sendKeys(Data);
			
		}   
			break;
	  case "partialLinkText":
		element=getDriver().findElement(By.partialLinkText(Locator));
		if (element.isDisplayed()&&element.isEnabled()) {
			 element.clear();
			 element.sendKeys(Data);
			
		}   
			break;
		}  
	  }
		public static void ActionClick( String locatorMechanism,String Locator) {
			String locMech=locatorMechanism;
			switch (locMech) {
			case "id":
		element=	getDriver().findElement(By.id(Locator));
		if (element.isDisplayed()&&element.isEnabled()) {
			element.click();
		}
			break;
			
			case "name":
			element=getDriver().findElement(By.name(Locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
			}

				break;
			
		  case "xpath":
			element=getDriver().findElement(By.xpath(Locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
			}

				break;
				
		  case "cssSelector":
			element=getDriver().findElement(By.cssSelector(Locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
			}

				break;
		  case "className":
			element=	getDriver().findElement(By.className(Locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
			}

				break;
		  case "tagName":
			element=getDriver().findElement(By.tagName(Locator));
				if (element.isDisplayed()&&element.isEnabled()) {
					element.click();
				}
				break;
		  case "linkText":
			element=getDriver().findElement(By.linkText(Locator));
				if (element.isDisplayed()&&element.isEnabled()) {
					element.click();
				}

				break;
		  case "partilaLinkText":
			element=getDriver().findElement(By.partialLinkText(Locator));
				if (element.isDisplayed()&&element.isEnabled()) {
					element.click();
				break;
			}  
			
			} 

	}
		public static List<WebElement> getAllFrames() {
		
			
			List<WebElement> frames=getDriver().findElements(By.tagName("iframe"));
			return frames;

		}
		public void SwitchToFrames(String LocatorMech,String Loctor) {
			switch(LocatorMech)
			{
			case "idOrName":
			getDriver().switchTo().frame(Loctor);
			
			break;
			case "index":
				if (getAllFrames().size()>=Integer.parseInt(Loctor)){

					getDriver().switchTo().frame(Loctor);
				}
				break;
			case "webelement":
				getDriver().switchTo().frame(Loctor);
				break;
				
				}
						}
		public static void windowHandles(int index)
		{
			Set<String> windows = getDriver().getWindowHandles();
			List<String> list = new ArrayList<String>(windows);
			String windowName = list.get(index);
			getDriver().switchTo().window(windowName);	
		}
		public static void dropDown(WebElement elementone,String dropDownSelect,String dropDownData)
		{
			String tagName = elementone.getTagName();
			if (tagName.equalsIgnoreCase("select")) {
				Select select = new Select(elementone);

	switch(dropDownSelect)
	{
	case "value":
		select.selectByValue(dropDownData);
		break;
	case "text":
		select.selectByVisibleText(dropDownData);
		break;
	case "index":
		select.selectByIndex(Integer.parseInt(dropDownData));
		break;
	}
			}
		}
		
		public static void mouseHover(WebElement elementone)
		{
			action.moveToElement(elementone).build().perform();
		}
		
		public static void rightClick(WebElement elementOne)
		{
			
			action.contextClick(elementOne).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
		}

		public static boolean isDisplayed(WebElement element)
		{
			boolean flag=true;
			if (element.isDisplayed()&&element.isEnabled());
			else
				flag=false;
			return flag;
		}
		

}
 