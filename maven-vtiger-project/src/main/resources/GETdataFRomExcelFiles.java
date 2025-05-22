import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GETdataFRomExcelFiles {
	public static void main(String[] args) {
//get java Object  Representation of the Physical Files	
		FileInputStream fls=new FileInputStream("\"C:\\Users\\rohit\\OneDrive\\Desktop\\Book1.xlsx\"");
		
		Workbook wb=WorkbookFactory.create(fls);
		
		Sheet sheet=wb.getSheet("sheet1");
		Row row=wb.getRow(0);
		Cell cell1=wb.getCell(0);
		
		System.out.println("Cell Value"+cell1.getStringCellValue()); 
		
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			Row row=sheet.getRow(i);
			String Contact=row.getCell(0).getStringCellValue();
			System.out.println(Contact+" "+Name);
		}
		Workbook.close();
		
		
		}

}
