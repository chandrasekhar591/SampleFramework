package com.rameshsoft.automation.ObjectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesFunction {
	private String FilePath;
	private Properties pr;
	private FileInputStream f;
	public PropertiesFunction(String FilePath) throws IOException {
		// TODO Auto-generated constructor stub
		this.FilePath=FilePath;
		
		f=new FileInputStream(FilePath);
		pr=new Properties();
		pr.load(f);
	}
	
	
	public String getPropertiesKeys(String key) {
		// TODO Auto-generated method stub
		
	String key1=	pr.getProperty(key);
	return key1;

	}
	public void setPropertiesValues(String key, String Value) throws IOException {
		// TODO Auto-generated method stub
		 pr.setProperty(key, Value);
		  FileOutputStream fop= new FileOutputStream(FilePath);
		              pr.load(f);
		              pr.store(fop, "sucessfully Recorded");
		
		
		

	}
	public void removeProperty(String key,String value) throws IOException {
		// TODO Auto-generated method stub
		
		pr.remove(key);
		FileOutputStream fop= new FileOutputStream(FilePath);
        pr.load(f);
        pr.store(fop, "sucessfully Recorded");

	}

	
	
	public Map<String,String> getAllProperties() {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> m=new LinkedHashMap();
		
	Set keys=	pr.keySet();
	 Iterator<Object> t= keys.iterator();
	 while(t.hasNext()){
		 Object key=t.next();
		String value= pr.getProperty((String)key);
		  m.put((String)key, value);
	 }
	
		return m;

	}
	
	
}
