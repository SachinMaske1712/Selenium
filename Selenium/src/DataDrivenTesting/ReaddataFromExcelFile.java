package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/AutomationTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		   String value = wb.getSheet("Sachin").getRow(4).getCell(2).getStringCellValue();
		System.out.println(value);
		
		
	}

}
