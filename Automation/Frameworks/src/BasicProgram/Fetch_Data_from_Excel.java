package BasicProgram;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Fetch_Data_from_Excel {
	public static void main(String[] args) throws Exception {
	FileInputStream fis = new FileInputStream("E:\\Excel\\Book1.xlsx");
	Workbook book = WorkbookFactory.create(fis);
 Sheet sh = book.getSheet("Sheet1");
 Row row=sh.getRow(5);
 Cell col=row.getCell(5);
 String cellvalue = col.getStringCellValue();
// String cellvalue=sh.getRow(5).getCell(5).getStringCellValue();
 System.out.println(cellvalue);
}
}
