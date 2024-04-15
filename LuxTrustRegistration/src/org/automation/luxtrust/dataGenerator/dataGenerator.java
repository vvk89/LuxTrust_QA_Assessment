package org.automation.luxtrust.dataGenerator;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class dataGenerator {
	@DataProvider(name="Excel")
	public static Object[][] testinput() throws Exception
	{
	FileInputStream file =new FileInputStream("./testdata/testinput.xlsx");
	XSSFWorkbook workbook =new XSSFWorkbook(file);
	XSSFSheet formsheet = workbook.getSheet("form");
	int  noofdata =formsheet.getPhysicalNumberOfRows();
	Object [][] testData= new Object[noofdata][5];
	for(int i=0;i<noofdata;i++)
	{
		XSSFRow row = formsheet.getRow(i);
		XSSFCell name = row.getCell(0);
		XSSFCell mail = row.getCell(1);
		XSSFCell phone = row.getCell(2);
		XSSFCell userID = row.getCell(3);
		XSSFCell pwd = row.getCell(4);	
		testData[i][0]= name.getStringCellValue();
		testData[i][1]= mail.getStringCellValue();
		testData[i][2]= phone.getStringCellValue();
		testData[i][3]= userID.getStringCellValue();
		testData[i][4]= pwd.getStringCellValue();
		
	}
	return testData;
	}
}
