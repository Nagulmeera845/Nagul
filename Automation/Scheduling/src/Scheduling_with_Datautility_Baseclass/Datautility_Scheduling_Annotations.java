package Scheduling_with_Datautility_Baseclass;

import java.io.FileInputStream;
import java.util.Properties;

public class Datautility_Scheduling_Annotations {
public String getDataFromProperties(String data) throws Exception {
		
		FileInputStream fis = new FileInputStream("E:\\Excel\\actitme.propeties");
		Properties pobj = new Properties();
		pobj.load(fis);
		//return pobj.getProperty(data);
		String s= pobj.getProperty(data);
		return s;
		}
}
