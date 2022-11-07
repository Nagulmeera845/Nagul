package Scheduling_With_DataUtility_Base_class;

import java.io.FileInputStream;
import java.util.Properties;

public class DataUtility_Scheduling_Annotations {
	public String getDataFromProperties(String data) throws Exception {
		FileInputStream fis = new FileInputStream("E:\\Excel\\Actitime.Properties.txt");
		
		Properties obj = new Properties();
		obj.load(fis);
	   // String s = obj.getProperty(data);
	  //  return s;
		return obj.getProperty(data);
	}

}
