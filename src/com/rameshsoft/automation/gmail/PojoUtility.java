package com.rameshsoft.automation.gmail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.automation.ObjectRepository.ExcelReader;
import com.rameshsoft.automation.ObjectRepository.PropertiesFunction;
import com.rameshsoft.automation.ObjectRepository.TextFunctionUtilities;

public class PojoUtility {
	
		

	private static	String configFile="G:\\NewJar\\SampleFrameWork\\config.properties";
	private static	String OrProperties="G:\\NewJar\\SampleFrameWork\\src\\com\\rameshsoft\\automation\\ObjectRepository\\ramesh.properties";
	private static	String TextFile="G:\\NewJar\\SampleFrameWork\\src\\com\\rameshsoft\\automation\\ObjectRepository\\Flipkart.txt";
	private static	String ExcellSheet="G:\\NewJar\\SampleFrameWork\\ExcellSheet.xlsx";
	
		public static PropertiesFunction getConfigFile() throws IOException {
			
			PropertiesFunction pr=new PropertiesFunction(configFile);
			
			
			return pr;
		}
public static PropertiesFunction getOrProperties() throws IOException {
			
			PropertiesFunction pr1=new PropertiesFunction(OrProperties);

			return pr1;
		}
public static ExcelReader getExcellSheet() throws IOException, EncryptedDocumentException, InvalidFormatException {
	
	ExcelReader pr2=new ExcelReader(ExcellSheet);

	return pr2;
}
public static TextFunctionUtilities getTextFile() throws IOException {
	
	TextFunctionUtilities pr3=new TextFunctionUtilities(TextFile);

	return pr3;
}
		
		
		
	

}
