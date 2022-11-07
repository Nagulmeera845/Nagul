package DataUtilty_class_Base_class_Parallel_Execution;

import java.io.FileInputStream;
import java.util.Properties;

public class Datautility_class {
	public String getDataFromProperties(String data) throws Exception
	{
		FileInputStream fis = new FileInputStream("E:\\Excel\\actitme.propeties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
		return pobj.getProperty(data);
	}
}
