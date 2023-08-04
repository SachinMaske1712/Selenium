package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
/**
 * This Class contains All The Generic Methods For Read Data From Property And ExcelSheet.
 * @author SACHIN
 *
 */
public class GenericMethods {

	/**
	 * This Method Is a Non-Static Method designed To Read Data From PropertyFile. 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String ReadDataFromProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/CommanData.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
		
	/**
	 * This is a Non-static Method Used To Read Data from Excel Sheet.
	 * @param SheetName
	 * @param Row
	 * @param Cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
		public String ReadDataFromExcel(String SheetName,int Row,int Cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/AutomationTestdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
		return value;
	
}
}