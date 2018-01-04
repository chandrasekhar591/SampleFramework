package com.rameshsoft.automation.ObjectRepository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFunctionUtilities {
String FilePath;
     File f;
     FileWriter fw;
     BufferedWriter bw;
     FileReader fr;
    BufferedReader br;

	public TextFunctionUtilities(String FilePath) throws IOException {
		// TODO Auto-generated constructor stub
		this.FilePath=FilePath;
		f=new File("G:\\NewJar\\SampleFrameWork\\src\\com\\rameshsoft\\automation\\ObjectRepository\\Flipkart.txt");
		fw=new FileWriter(f);
		bw=new BufferedWriter(fw);
		fr=new FileReader(f);
		br=new BufferedReader(fr);
	}
	public String getData() throws IOException {
		// TODO Auto-generated method stub
		 String value=null;
		if(br!=null){
		 value= br.readLine();
		}else{
			System.out.println("br is null plz cross check");
		}
		 return value;

	}
	public List<String> getAllData() throws IOException {
		// TODO Auto-generated method stub
		List<String>datas=new ArrayList();
		if(br!=null){
			while(br.ready()){
			String data= br.readLine();
			      datas.add(data);
				
			}
		}else{
			System.out.println("br is null plz cross check");
		}
     return datas;
	}
     public String writeData(String data) throws IOException {
		// TODO Auto-generated method stub
    	   bw.write(data);
    	   bw.newLine();
    	   bw.flush();
    	   return data;

	}
     public int writeData(int data) throws IOException {
 		// TODO Auto-generated method stub
     	   bw.write(data);
     	   bw.newLine();
     	   bw.flush();
     	   return data;

 	}
 	
	
	
}
