package Programs;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step 1= Get The java object representation of Excel File

		FileInputStream fls = new FileInputStream("C:\\Users\\rohit\\OneDrive\\Desktop\\Book1.xlsx");

// STEp to write a Data Into ExcelSheet
		Workbook wb = WorkbookFactory.create(fls);
		Sheet sh = wb.getSheet("Contact");

		Row srow = sh.getRow(5);

		Cell cell = srow.getCell(1);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("hii");

		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\rohit\\\\OneDrive\\\\Desktop\\\\Book1.xlsx");
		wb.write(fos);
		wb.close();

//Workbook wb=WorkbookFactory.create(fls);
//String Contact=wb.getSheet("Contact").getRow(6).getCell(0).getStringCellValue();
//System.out.println(Contact);

	}
}
