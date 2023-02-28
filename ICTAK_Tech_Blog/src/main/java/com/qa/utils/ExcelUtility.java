package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static XSSFWorkbook excelWbook;
	public static XSSFSheet excelWsheet;
public static String getCellData(int rowNum,int colNum,String excelPath,int sheetNum) throws IOException
	
	{
	
		FileInputStream Excel=new FileInputStream(excelPath);
		excelWbook=new XSSFWorkbook(Excel);
		excelWsheet=excelWbook.getSheetAt(sheetNum);
		
		return
				excelWsheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	}
public static String getAdminPassword(int rowNum,int colNum,String excelPath,int sheetNum) throws IOException
{
	FileInputStream excel=new FileInputStream(excelPath);
	
	excelWbook=new XSSFWorkbook(excel);
	excelWsheet=excelWbook.getSheetAt(sheetNum);
	
	return excelWsheet.getRow(rowNum).getCell(colNum).getRawValue().toString();	
	
}
	
}
	




