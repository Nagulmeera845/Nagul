package BasicProgram;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String getDataFromProperties(String data) throws Exception{
	    FileInputStream fis  = new FileInputStream("E:\\Excel\\actitme.propeties");
	    Properties pobj =new Properties();
	    pobj.load(fis);
	    return pobj.getProperty(data);
	    	}
	 public String getDataFromExcelSheet(String SheetName,int rowno,int cellno)throws Exception{
		FileInputStream fis = new FileInputStream("E:\\Excel\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(SheetName);
	DataFormatter df = new DataFormatter();
	String data = df.formatCellValue(sh.getRow(rowno).getCell(cellno));
	return data;
		
	 }
}
