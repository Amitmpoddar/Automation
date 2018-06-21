package qspiders;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writinginsideExcel {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		// TODO Auto-generated method stub

		FileInputStream f = new FileInputStream("C:\\Users\\Amith\\eclipse-workspace\\Selenium\\ExcelSheet\\New Microsoft Office Excel Worksheet.xlsx");
		Workbook wb = WorkbookFactory.create(f);
	 String  e = wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	 System.out.println(e);
   
	}

}
