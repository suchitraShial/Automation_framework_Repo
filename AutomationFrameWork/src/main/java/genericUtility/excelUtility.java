package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelUtility {
	public String getStringDataFromexcel(String sheetname,int rowNum,int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsl");
		Workbook workbook= WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).getStringCellValue();
	}
	
}
