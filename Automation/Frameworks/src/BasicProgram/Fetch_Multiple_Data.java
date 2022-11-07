package BasicProgram;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Multiple_Data {
	public static void main(String[] args) throws Exception {
		FileInputStream  fis = new FileInputStream("E:\\Excel\\Book3.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet3");
		DataFormatter df = new DataFormatter();
		for(int i=1;i<=sh.getLastRowNum();i++) {
			Row r = sh.getRow(i);
			for(int j =1;j<=r.getLastCellNum();j++) {
				String allvalues = df.formatCellValue(r.getCell(j));
				System.out.println(allvalues);
			}
		}
	}
}
