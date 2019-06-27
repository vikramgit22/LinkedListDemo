package com.divya.LinkedList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("C:\\Users\\equifaxmind\\Downloads\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int count= wb.getNumberOfSheets();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			if(wb.getSheetName(i).equalsIgnoreCase("TestData"))
			{
				XSSFSheet sheet = wb.getSheetAt(i);
				System.out.println("sheet found!");
			}
		}

	}

}
