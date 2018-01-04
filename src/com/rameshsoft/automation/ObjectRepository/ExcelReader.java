

package com.rameshsoft.automation.ObjectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	private String FilePath;
	private FileInputStream fip;
	private Workbook wb;
	private String SheetName;
	
	
	public ExcelReader(String FilePath) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated constructor stub
		this.FilePath=FilePath;
		 fip=new FileInputStream(FilePath);
          wb=WorkbookFactory.create(fip);
	}
	public int getRowCount(String SheetName) {
		// TODO Auto-generated method stub
	      //  int rowcount=0;
	  int  rowcount =  wb.getSheet(SheetName).getLastRowNum()+1;
		return rowcount;
	
	}
	public String getCellData(String sheetName, int rowNumber, int columnNumber) {

		String cellValue = "";
		try {

			if (wb.getSheet(sheetName).getRow(rowNumber)
					.getCell(columnNumber).getCellType() == wb
					.getSheet(sheetName).getRow(rowNumber)
					.getCell(columnNumber).CELL_TYPE_STRING) {

				cellValue = wb.getSheet(sheetName).getRow(rowNumber)
						.getCell(columnNumber).getStringCellValue().trim();
			} else {

				cellValue = String.valueOf(
						(int) (wb.getSheet(sheetName).getRow(rowNumber)
								.getCell(columnNumber).getNumericCellValue()))
						.trim();
			}
		} catch (Exception e) {

			return cellValue;
		}

		return cellValue;
	}
	public void setCellData(String SheetName,int RowNumber,int CollNumber,String value) throws IOException {
		// TODO Auto-generated method stub
		
		wb.getSheet(SheetName).createRow(RowNumber).createCell(CollNumber).setCellValue(value);
		FileOutputStream fop=new FileOutputStream(FilePath);
                   wb.write(fop);
		

	}
	}


