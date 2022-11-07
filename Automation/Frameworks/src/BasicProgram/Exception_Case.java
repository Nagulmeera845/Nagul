package BasicProgram;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exception_Case {
	public static void main(String[] args) throws Exception {
	    FileInputStream fis = new FileInputStream("E:\\Excel\\Book2.xlsx");
	    Workbook book = WorkbookFactory.create(fis);
	    Sheet sh = book.getSheet("Sheet2");
	    DataFormatter format = new DataFormatter();
	    String data = format.formatCellValue(sh.getRow(6).getCell(3));
	    System.out.println(data);
	    		
		}
}
