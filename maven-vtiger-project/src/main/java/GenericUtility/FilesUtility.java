package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FilesUtility {

	   public String getFilesFromProperties(String key) throws IOException {
		// Java Object Represtation Of Physical Files(Taking File)
			
			FileInputStream fls=new FileInputStream("D:\\maven-vtiger-project\\src\\main\\resources\\CommonData.properties");
			
		//Loading The File(fls)
			
				Properties pro=new Properties();
				 pro.load(fls);
				 String value=pro.getProperty(key);
				 return value;
	   }
	   public String getFilesFromExcel(String Sheetname,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		   FileInputStream fls2=new FileInputStream("C:\\Users\\rohit\\OneDrive\\Desktop\\Book1.xlsx");
		   Workbook wb=WorkbookFactory.create(fls2);
		 String value=  wb.getSheet(Sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue();
		 return value;
	   }

}
