package BasicProgram;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Send_Data_To_Excel {
	public static void main(String[] args) throws Exception {
	    FileInputStream fis = new FileInputStream("E:\\Excel\\Book4.xlsx");
	    Workbook book = WorkbookFactory.create(fis);
	    Sheet sh = book.getSheet("Sheet4");
	    
	    sh.createRow(0).createCell(1).setCellValue("Name");
	    sh.createRow(0).createCell(2).setCellValue("Cell no.");
	    sh.createRow(0).createCell(3).setCellValue("Place");
	    FileOutputStream fos = new FileOutputStream("E:\\Excel\\Book4.xlsx");
	    book.write(fos);
	   	}
}
