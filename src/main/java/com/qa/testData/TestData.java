package com.qa.testData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestData extends TestBase {

	public static String username;
	public static String password;
	
	static Workbook workbook;
	static Sheet sheet;
	
	 public static FileInputStream file;
	public static void main() throws IOException {

		String path = "C:\\Users\\Anant\\Desktop\\Book1.xlsx";

		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		 username = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();

		 password = workbook.getSheet("Sheet1").getRow(0).getCell(1).toString();

		System.out.println(username);
		System.out.println(password);
	
	}

	public static Object[][] getTestData(String sheetName) {
		 
		FileInputStream file1 = null;
		
		try {
			file1 = new FileInputStream("B:\\Velocitytraining\\Setup\\Eclipse_IDE_2021_12\\Eclipse_Workspace_2021_12\\SauceDemo\\testData\\Book1.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook = WorkbookFactory.create(file1);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		sheet = workbook.getSheet(sheetName);
		
		Object data[][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i<sheet.getLastRowNum();i++) {
			for (int k = 0; k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
				System.out.println(data[i][k]);
			}
		}
		return data;
	}

}
