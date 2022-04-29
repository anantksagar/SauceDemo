package com.qa.testData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData1 {

	public String username2;
	public String password2;
	public static void main() throws IOException {
		
		String path1 = "C:\\Users\\Anant\\Desktop\\Book1.xlsx";
		
		FileInputStream file = new FileInputStream(path1);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		String username2 = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
	
		String password2 = workbook.getSheet("Sheet1").getRow(0).getCell(1).toString();
		System.out.println(username2);
		System.out.println(password2);
	}
}
